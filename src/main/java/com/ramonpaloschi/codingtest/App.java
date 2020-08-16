package com.ramonpaloschi.codingtest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.ramonpaloschi.codingtest.product.Product;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ramon
 */
public class App {

    private static final Map<Integer, Product> PRODUCTS_DATA = new HashMap();

    public static Map<Integer, Product> getProductsData() {
        return PRODUCTS_DATA;
    }

    public static Map<Integer, Product> getProducts() {
        if (PRODUCTS_DATA.isEmpty()) {
            AppFunctions.loadProducts();
        }
        return PRODUCTS_DATA;
    }

    public static void main(String[] args) {
        System.out.println("start App");
    }

}
