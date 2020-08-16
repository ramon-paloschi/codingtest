package com.ramonpaloschi.codingtest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.ramonpaloschi.codingtest.business.Money;
import com.ramonpaloschi.codingtest.product.Book;
import com.ramonpaloschi.codingtest.product.Food;
import com.ramonpaloschi.codingtest.product.Medical;
import com.ramonpaloschi.codingtest.product.Product;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author ramon
 */
public class AppFunctions {

    public static void loadProducts() {
        //System.out.println("loadProducts");
        
        Map<Integer, Product> products = App.getProductsData();

        Book book1 = new Book();
        book1.setName("Clean Code: A Handbook of Agile Software Craftsmanship");
        book1.setAuthor("Robert C. Martin");
        book1.setIsbn("0-13-235088-2");
        book1.setNumPages(464);
        book1.setPublisher("Prentice Hall PTR");
        book1.setPublishedDate(new Date("11/08/2008"));
        book1.setPrice(new Money(12.49));
        products.put(1, book1);

        Book book2 = new Book();
        book2.setName("Test Driven Development: By Example");
        book2.setAuthor("Kent Beck");
        book2.setIsbn("978-0321146533");
        book2.setNumPages(240);
        book2.setPublisher("Addison-Wesley");
        book2.setPublishedDate(new Date("08/11/2002"));
        book2.setPrice(new Money(23.99));
        products.put(2, book2);

        Product musicCD = new Product();
        musicCD.setManufacturer("Sony");
        musicCD.setName("Music CD1");
        musicCD.setPrice(new Money(14.99));
        products.put(3, musicCD);

        Food chocolateBar = new Food();
        chocolateBar.setManufacturer("Manufacturer 1");
        chocolateBar.setName("Chocolate Bar 1");
        chocolateBar.setCategory("Sweets");
        chocolateBar.setPrice(new Money(0.85));
        products.put(4, chocolateBar);

        Food chocolateBox1 = new Food();
        chocolateBox1.setManufacturer("Manufacturer 2");
        chocolateBox1.setName("Chocolate Box 1");
        chocolateBox1.setCategory("Sweets");
        chocolateBox1.setPrice(new Money(10.00));
        products.put(5, chocolateBox1);

        Food chocolateBox2 = new Food();
        chocolateBox2.setManufacturer("Manufacturer 3");
        chocolateBox2.setName("Chocolate Box 2");
        chocolateBox2.setCategory("Sweets");
        chocolateBox2.setPrice(new Money(11.25));
        products.put(6, chocolateBox2);

        Product perfume1 = new Product();
        perfume1.setManufacturer("Manufacturer 4");
        perfume1.setName("Perfume 1");
        perfume1.setPrice(new Money(47.50));
        products.put(7, perfume1);

        Product perfume2 = new Product();
        perfume2.setManufacturer("Manufacturer 5");
        perfume2.setName("Perfume 2");
        perfume2.setPrice(new Money(27.99));
        products.put(8, perfume2);

        Product perfume3 = new Product();
        perfume3.setManufacturer("Manufacturer 6");
        perfume3.setName("Perfume 3");
        perfume3.setPrice(new Money(18.99));
        products.put(9, perfume3);

        Medical headachePills = new Medical();
        headachePills.setManufacturer("Manufacturer 7");
        headachePills.setName("Headache Pills");
        headachePills.setPrice(new Money(9.75));
        headachePills.setExpirationDate(new Date("05/09/2023"));
        products.put(10, headachePills);

    }

}
