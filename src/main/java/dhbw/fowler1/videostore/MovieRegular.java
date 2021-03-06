/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.fowler1.videostore;

/**
 * Die Klasse MovieRegular repräsentiert einen
 * gewöhnlichen Film.
 * 
 */
public class MovieRegular extends Movie {

    public MovieRegular(String title) {
        super(title);
    }

    @Override
    public double getPrice(int rentalDays) {
       return (rentalDays > 2) ? (rentalDays - 2) * 1.5 + 2 : 2;
    }
    
}
