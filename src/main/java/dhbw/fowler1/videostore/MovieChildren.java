package dhbw.fowler1.videostore;

/**
 * Die Klasse MovieChildren repräsentiert einen
 * Film für Kinder.
 * 
 */
public class MovieChildren extends Movie {

    public MovieChildren(String title) {
        super(title);
    }

    @Override
    public double getPrice(int rentalDays) {
        return (rentalDays > 3) ? (rentalDays - 3) * 1.5 + 1.5 : 1.5;
    }
    
}
