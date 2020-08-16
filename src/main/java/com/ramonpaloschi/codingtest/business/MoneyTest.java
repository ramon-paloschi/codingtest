/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramonpaloschi.codingtest.business;

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
public class MoneyTest {

    public MoneyTest() {
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
    public void testRoundToNearest5Cents() {

        double[][] moneyArray = {{1.05, 1.01}, {1.10, 1.09}, {48.50, 48.4936}, {-55.30, -55.298}, {0.90, 0.851}, {0.05, 0.01}, {10.90, 10.89}, {-4.20, -4.151}, {3.50, 3.48}, {100.00, 99.99}};

        for (int i = 0; i < 10; i++) {
            Money money = new Money(moneyArray[i][1]);
            money.roundToNearest5Cents();

            Money moneyTest = new Money(moneyArray[i][0]);

            assertEquals(moneyTest.toString(), money.toString());
            //System.out.println(moneyTest.toString() + " == " + moneyArray[i][1] + " => " + money.toString());
        }
    }
}
