package dhbw.fowler1.videostore;
/**
 * Die Klasse Movie repräsentiert einen Film.
 * Ein Film hat einen Titel und einen Preiscode.
 * 
 */
public abstract class Movie {

    private String _title;
/**
 * Der Konstruktor erstellt einen neuen Film mit übergebenen 
 * Titel und dem Preiscode.
 * @param title Der Titel des Films
 * @param priceCode Der Preiscode des Films
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
    public abstract double getPrice(int rentalDays);
    
}
