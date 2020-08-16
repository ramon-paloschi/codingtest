/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramonpaloschi.codingtest.business;

import com.ramonpaloschi.codingtest.product.ProductFunctions;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ramon
 */
public class ReceiptTest {

    public ReceiptTest() {
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
    public void testPrintReceipt1() {
        System.out.println("--------------------------------------------------------");
        System.out.println("test PrintReceipt1");
        System.out.println("");

        Receipt receipt = new Receipt();
        List<ReceiptLine> receiptLines = receipt.getReceiptLines();

        ReceiptLine receiptLine1 = new ReceiptLine();
        receiptLine1.setProduct(ProductFunctions.getProduct(1));
        receiptLines.add(receiptLine1);

        ReceiptLine receiptLine2 = new ReceiptLine();
        receiptLine2.setProduct(ProductFunctions.getProduct(3));
        receiptLines.add(receiptLine2);

        ReceiptLine receiptLine3 = new ReceiptLine();
        receiptLine3.setProduct(ProductFunctions.getProduct(4));
        receiptLines.add(receiptLine3);

        ReceiptFunctions.calculateReceipt(receipt);

        assertEquals("12.49", receiptLine1.getTotal().toString());
        assertEquals("16.49", receiptLine2.getTotal().toString());
        assertEquals("0.85", receiptLine3.getTotal().toString());
        assertEquals("1.50", receipt.getSalesTaxes().toString());
        assertEquals("29.83", receipt.getTotal().toString());

        ReceiptFunctions.printReceipt(receipt);
    }

    @Test
    public void testPrintReceipt2() {
        System.out.println("--------------------------------------------------------");
        System.out.println("test PrintReceipt2");
        System.out.println("");

        Receipt receipt = new Receipt();
        List<ReceiptLine> receiptLines = receipt.getReceiptLines();

        ReceiptLine receiptLine1 = new ReceiptLine();
        receiptLine1.setProduct(ProductFunctions.getProduct(5));
        receiptLine1.setImportTax(true);
        receiptLines.add(receiptLine1);

        ReceiptLine receiptLine2 = new ReceiptLine();
        receiptLine2.setProduct(ProductFunctions.getProduct(7));
        receiptLine2.setImportTax(true);
        receiptLines.add(receiptLine2);

        ReceiptFunctions.calculateReceipt(receipt);

        assertEquals("10.50", receiptLine1.getTotal().toString());
        assertEquals("54.65", receiptLine2.getTotal().toString());
        assertEquals("7.65", receipt.getSalesTaxes().toString());
        assertEquals("65.15", receipt.getTotal().toString());

        ReceiptFunctions.printReceipt(receipt);
    }

    @Test
    public void testPrintReceipt3() {
        System.out.println("--------------------------------------------------------");
        System.out.println("test PrintReceipt3");
        System.out.println("");

        Receipt receipt = new Receipt();
        List<ReceiptLine> receiptLines = receipt.getReceiptLines();

        ReceiptLine receiptLine1 = new ReceiptLine();
        receiptLine1.setProduct(ProductFunctions.getProduct(8));
        receiptLine1.setImportTax(true);
        receiptLines.add(receiptLine1);

        ReceiptLine receiptLine2 = new ReceiptLine();
        receiptLine2.setProduct(ProductFunctions.getProduct(9));
        receiptLines.add(receiptLine2);

        ReceiptLine receiptLine3 = new ReceiptLine();
        receiptLine3.setProduct(ProductFunctions.getProduct(10));
        receiptLines.add(receiptLine3);

        ReceiptLine receiptLine4 = new ReceiptLine();
        receiptLine4.setProduct(ProductFunctions.getProduct(6));
        receiptLine4.setImportTax(true);
        receiptLines.add(receiptLine4);

        ReceiptFunctions.calculateReceipt(receipt);

        assertEquals("32.19", receiptLine1.getTotal().toString());
        assertEquals("20.89", receiptLine2.getTotal().toString());
        assertEquals("9.75", receiptLine3.getTotal().toString());
        assertEquals("11.85", receiptLine4.getTotal().toString());
        assertEquals("6.70", receipt.getSalesTaxes().toString());
        assertEquals("74.68", receipt.getTotal().toString());

        ReceiptFunctions.printReceipt(receipt);
    }

}
