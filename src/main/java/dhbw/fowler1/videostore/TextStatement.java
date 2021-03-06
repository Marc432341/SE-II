package dhbw.fowler1.videostore;

import java.util.Iterator;

/**
 *Die Klasse TextStatement erzeugt ein Statement in Form von Text.
 *
 */
public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        Iterator rentals = aCustomer.getRentals().iterator();
        String result = "Rental Record for " + aCustomer.getName() + "\n";
        while (rentals.hasNext()) {
            Rental each = (Rental) rentals.next();
            result += "\t" + each.getMovie().getTitle()+ "\t" +
            String.valueOf(each.calculateAmount()) + "\n";
        }
        result += "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
        return result;
}
    @Override
    String headerString(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    @Override
    String eachRentalString(Rental aRental) {
        return "\t" + aRental.getMovie().getTitle()+ "\t" +
            String.valueOf(aRental.calculateAmount()) + "\n";
    }

    @Override
    String footerString(Customer aCustomer) {
        return "Amount owed is " +
            String.valueOf(aCustomer.getTotalCharge()) + "\n" +
            "You earned " +
            String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
            " frequent renter points";
    }
    
}
