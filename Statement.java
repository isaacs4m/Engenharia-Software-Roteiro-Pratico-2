import java.util.Enumeration;

public abstract class Statement {

  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = getCustomerName(aCustomer);
    while (rentals.hasMoreElements()) {
       Rental each = (Rental) rentals.nextElement();
       //show figures for this rental
       result += getRentalFigures(each);
    }
    //add footer lines
    result += getAmountOwed(aCustomer);
    result += getFrequentRenterPoints(aCustomer);
    return result;
  }

  public abstract String getCustomerName(Customer aCustomer);

  public abstract String getRentalFigures(Rental aRental);

  public abstract String getAmountOwed(Customer aCustomer);

  public abstract String getFrequentRenterPoints(Customer aCustomer);
}
