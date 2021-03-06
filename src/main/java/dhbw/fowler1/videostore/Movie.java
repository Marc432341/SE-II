package dhbw.fowler1.videostore;
/**
 * Die abstrakte Klasse Movie repräsentiert einen Film.
 * Ein Film hat einen Titel und einen Preiscode.
 * Die abstrakte Methode getPrice wird in den
 * Unterklassen implementiert, da der Preis
 * für unterschiedliche Filmtypen unterschiedlich
 * berechnet wird.
 */
public abstract class Movie {

    private String _title;
/**
 * Der Konstruktor erstellt einen neuen Film mit übergebenen 
 * Titel und dem Preiscode.
 * @param title Der Titel des Films
 */
    public Movie(String title) {
        _title = title;
    }
/**
 * Die Methode getTitle gibt den Titel des Films zurück.
 * @return Titel des Films
 */
    public String getTitle() {
        return _title;
    }
    /**
     * Die abstrakte Methode getPrice wird von den
     * Unterklassen dieser Klasse ausprogrammiert,
     * da die Preisbildung abhängig von Filmtyp
     * ist.
     * @param rentalDays Die Anzahl an Tagen, die der Film ausgeliehen wird.
     * @return Preis
     */
    public abstract double getPrice(int rentalDays);
    
}
