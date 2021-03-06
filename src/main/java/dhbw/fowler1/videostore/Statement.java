package dhbw.fowler1.videostore;

import java.util.Iterator;

/**
 * Die Klasse Statement ist die Oberklasse zu Html Statement
 * und Text Statement und gibt deren Methoden vor.
 */
public abstract class Statement {
    /**
     * Die Methode value liefert das komplette Statement
     * für einen Kunden.
     * @param aCustomer Kunde, für den das Statement erzeugt werden soll.
     * @return Statement des Kundens.
     */
    public String value(Customer aCustomer) {
        Iterator rentals = aCustomer.getRentals().iterator();
        String result = headerString(aCustomer);
        while (rentals.hasNext()) {
            Rental each = (Rental) rentals.next();
            result += eachRentalString(each);
        }
        result += footerString(aCustomer);
        return result;
    }
    /**
     * Die Methode headerString erzuegt die Ausgabe für den Header
     * @param aCustomer Kunde, für den der Header erstellt werden soll.
     * @return Statement des Headers
     */
    abstract String headerString(Customer aCustomer);
    /**
     * Die Methode eachRentalString erzeugt die Ausgabe für jede Ausleihe.
     * @param aRental Kunde, für den die Ausgabe erzeugt werden soll
     * @return Statement der Ausleihe.
     */
    abstract String eachRentalString (Rental aRental);
    /**
     * Die Methode footerString erzeugt die Ausgabe für den Footer.
     * @param aCustomer Kunde, für den die Ausgabe erzeugt werden soll.
     * @return Statement der Ausgabe.
     */
    abstract String footerString (Customer aCustomer);
}
