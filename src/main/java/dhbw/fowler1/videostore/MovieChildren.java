/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
