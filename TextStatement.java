import java.util.Enumeration;

public class TextStatement extends Statement {

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

  public String getCustomerName(Customer aCustomer) {
    return "Rental Record for " + aCustomer.getName() + "\n";
  }

  public String getRentalFigures(Rental aRental) {
    return "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(aRental.getCharge()) + "\n";
  }

  public String getAmountOwed(Customer aCustomer) {
    return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
  }

  public String getFrequentRenterPoints(Customer aCustomer) {
    return "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
  }
}
