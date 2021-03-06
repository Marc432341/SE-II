package dhbw.fowler1.videostore;
import java.util.Iterator;
import java.util.LinkedList;
/**
 * Die Klasse Customer modelliert einen Kunden.
 * Ein Kunde kann Filme ausleihen.
 * 
 */
public class Customer {
    private String _name;
    private LinkedList<Rental> _rentals = new LinkedList<Rental>();
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
        return new TextStatement().value(this);
    }

/**
 * Die Methode addRental fügt einem Kunde eine neue Ausleihe hinzu.
 * @param arg Die Ausleihe, die hinzugefügt werden soll.
 */
    public void addRental(Rental arg) {
        _rentals.add(arg);
    }
    /**
     * Die Methode getRentals gibt die Ausleihen für einen 
     * Kunden zurück
     * @return Ausleihen
     */
    public LinkedList<Rental> getRentals() {
        return _rentals;
    }
/**
 * Die Methode getName gibt den Namen des Kunden zurück.
 * @return Der Name des Kundens
 */
    public String getName() {
        return _name;
    }
    /**
     * Die getTotalCharge gibt den gesamten Ausleihepreis zurück
     * @return Gesamter Ausleihpreis
     */
    public double getTotalCharge() {
        double result = 0;
        Iterator rentals = _rentals.iterator();
        while (rentals.hasNext()) {
            Rental each = (Rental) rentals.next();
            result += each.calculateAmount();
        }
    return result;
    }
    /**
     * Die Methode getTotalFrequentRenterPoints gibt die
     * gesamnten Ausleihepunkte zurück.
     * @return die gesamten Ausleihepunkte
     */
    public int getTotalFrequentRenterPoints(){
        int result = 0;
        Iterator rentals = _rentals.iterator();
        while (rentals.hasNext()) {
            Rental each = (Rental) rentals.next();
            result += each.calculateRentalPoints();
        }
    return result;
    }
    /**
     * Die Methode htmlStatement gibt eine HTML-Darstellung
     * des Kunden zurück.
     * @return Die HTML-Darstellung des Kundens
     */
    public String htmlStatement() {
        return new HtmlStatement().value(this);
    }
}

