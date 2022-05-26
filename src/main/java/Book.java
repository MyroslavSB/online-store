/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miroslav
*/
public class Book extends Product{
    protected String title, author, desc, publisher, publishedDate, url;
    protected double price;
   
    
    public Book(String title, String author, String desc, String publisher, String url, String publishedDate, double price) {
        super(title, url, price);
        this.title = title;
        this.author = author;
        this.price = price;
        this.desc = desc;
        this.publishedDate = publishedDate;
        this.url = url;
        this.publisher = publisher;
    }
    
    
    
}
