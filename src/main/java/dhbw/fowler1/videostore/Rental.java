package dhbw.fowler1.videostore;
/**
 * Die Klasse Rental repräsentiert eine Ausleihe.
 * Eine Ausleihe besteht aus einem Film und der
 * Ausleihedauer.
 */
public class Rental {
    private Movie _movie;
    private int _daysRented;
/**
 * Der Konstruktor erstellt einen neue Ausleihe
 * mit dem übergebenen Film und der Anzahl an
 * Tagen, die der Film ausgeliehen wird.
 * @param movie Der Film, der ausgeliehen wird.
 * @param daysRented Die Anzahl an Tagen, die der Film ausgeliehen wird.
 */
    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }
/**
 * Die Methode getMovie gibt den Film zurück, der für diese
 * Ausleihe gesetzt ist.
 * @return Der ausgeliehene Film
 */
    public Movie getMovie() {
        return _movie;
    }
/**
 * Die Methode getDaysRented gibt die Anzahl an Tagen zurück,
 * die der Film ausgeliehen wird.
 * @return Die Anzahl an ausgeliehenen Tagen.
 */
    public int getDaysRented() {
        return _daysRented;
    }
    /**
 * Die Methode calculateAmount berechnet die Kosten für die Ausleihe
 * anhand der übergebenen Ausleihe und gibt den Preis zurück.
 * @return Kosten für die Ausleihe
 */
    public double calculateAmount() {
        return _movie.getPrice(_daysRented);
    }
    /**
     * Die Methode calculateRentalPoints berechnet die Anzahl an
     * Punkten, die für eine Ausleihe dem Benutzer gutgeschrieben werden.
     * @return die Anzahl an erhaltenen Punkten
     */
    public int calculateRentalPoints() {
        return (_movie instanceof MovieNewRelease && _daysRented > 1) ?
                2 : 1;
    }
}
