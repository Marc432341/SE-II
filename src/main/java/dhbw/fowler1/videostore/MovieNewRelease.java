/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.fowler1.videostore;

/**
 * Die Klasse MovieNewRelease repräsentiert einen
 * Film, der erst kürzlich erschienen ist.
 * 
 */
public class MovieNewRelease extends Movie {
    
    public MovieNewRelease(String title) {
        super(title);
    }
    @Override
    public double getPrice(int rentalDays) {
        return rentalDays * 3;
    }
}
