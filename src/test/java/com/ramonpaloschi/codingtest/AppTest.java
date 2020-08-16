/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramonpaloschi.codingtest;

import com.ramonpaloschi.codingtest.App;
import com.ramonpaloschi.codingtest.product.Book;
import com.ramonpaloschi.codingtest.product.Medical;
import com.ramonpaloschi.codingtest.product.Product;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ramon
 */
public class AppTest {

    public AppTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void productsLoadedTest() {
        System.out.println("productsLoadedTest");

        Map<Integer, Product> products = App.getProducts();

        assertFalse(products.isEmpty());

        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            Integer key = entry.getKey();
            Product product = entry.getValue();

            assertFalse(product.getName().isEmpty());
            assertTrue(product.getPrice().isNotZero());

            if (product instanceof Book) {
                assertFalse(((Book) product).getIsbn().isEmpty());
                assertFalse(((Book) product).getPublisher().isEmpty());
                assertFalse(((Book) product).getAuthor().isEmpty());
            }

            if (product instanceof Medical) {
                assertNotNull(((Medical) product).getExpirationDate());
            }
        }
    }

}
