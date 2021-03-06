package dhbw.fowler1.videostore;

import java.util.Enumeration;
import java.util.Vector;
/**
 * Die Klasse Customer modelliert einen Kunden.
 * Ein Kunde kann Filme ausleihen.
 * 
 */
public class Customer {
    private String _name;
    private Vector _rentals = new Vector();
/** 
 * Der Konstruktor erstellt einen Kunden mit dem übergebenen Namen
 * @param name 
 */
    public Customer(String name) {
        _name = name;
    }
/**
 * Die Methode statement erstellt einen Auszug für einen Kunden
 * mit den ausgeliehenen Filmen, den Name des Kundens und seinen
 * Bonuspunkten
 * @return Der Auszug des Kunden
 */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            double thisAmount = each.calculateAmount();

            // add frequent renter points
            frequentRenterPoints ++;
            // add bonus for a two day new release rental
            if ((each.getMovie() instanceof MovieNewRelease) &&
                    each.getDaysRented() > 1) frequentRenterPoints ++;
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" +
                    String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) +
                " frequent renter points";
        return result;
    }

/**
 * Die Methode addRental fügt einem Kunde eine neue Ausleihe hinzu.
 * @param arg Die Ausleihe, die hinzugefügt werden soll.
 */
    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }
/**
 * Die Methode getName gibt den Namen des Kunden zurück.
 * @return Der Name des Kundens
 */
    public String getName() {
        return _name;
    }
}
