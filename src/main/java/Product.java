/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miroslav
 */
public class Product {
    protected String name, url;
    protected double price;
    protected static int count = 0;
    protected int id;

    public Product(String name, String url, double price) {
        this.name = name;
        this.url = url;
        this.price = price;
        count++;
        this.id = count;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        count++;
        this.id = count;
    }
}
