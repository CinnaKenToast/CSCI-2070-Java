/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kennethshipley2070assignment13;

/**
 *
 * @author rockm
 */
public class Book {
    private 
    final String title;
    final String author;
    final String publisher;
    final int year;
    
    /**
     * Constructor for the book class
     * @precondition None.
     * @postcondition Object must be created.
     * @param title The title of the book
     * @param author The author of the book
     * @param publisher The publisher of the book
     * @param year The year the book was published
     */
    public Book(String title, String author, String publisher, int year){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }
    
    /**
     * Displays the description of the book 
     * @precondition None.
     * @postcondition None.
     * @return the title, author, publisher, year with a space in between each
     */
    public String getDescription(){
        String desc = title + " " + author + " " + publisher + " " + year;
        return desc;
    }
}
