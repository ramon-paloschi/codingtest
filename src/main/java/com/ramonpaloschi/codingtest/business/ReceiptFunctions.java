/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramonpaloschi.codingtest.business;

import com.ramonpaloschi.codingtest.product.Book;
import com.ramonpaloschi.codingtest.product.Food;
import com.ramonpaloschi.codingtest.product.Medical;
import com.ramonpaloschi.codingtest.product.Product;

/**
 *
 * @author ramon
 */
public class ReceiptFunctions {

    public static void calculateReceipt(Receipt receipt) {
        Money salesTaxes = receipt.getSalesTaxes();
        Money total = receipt.getTotal();

        for (ReceiptLine receiptLine : receipt.getReceiptLines()) {

            Product product = receiptLine.getProduct();

            double taxRateValue = 0.1;
            if (product instanceof Book) {
                taxRateValue = 0;
            }
            if (product instanceof Food) {
                taxRateValue = 0;
            }
            if (product instanceof Medical) {
                taxRateValue = 0;
            }

            if (receiptLine.isImportTax()) {
                taxRateValue = taxRateValue + 0.05;
            }

            calculatereceiptLineTaxableAmount(receiptLine);
            calculateReceiptLineSalesTax(receiptLine, taxRateValue);
            calculateReceiptLineTotal(receiptLine);

            salesTaxes.add(receiptLine.getSalesTax());
            total.add(receiptLine.getTotal());

        }
    }

    private static void calculatereceiptLineTaxableAmount(ReceiptLine receiptLine) {
        Product product = receiptLine.getProduct();
        double amount = receiptLine.getAmount();

        Money taxableAmount = new Money(product.getPrice().getValue());
        taxableAmount.multiply(amount);

        receiptLine.setTaxableAmount(taxableAmount);
    }

    private static void calculateReceiptLineSalesTax(ReceiptLine receiptLine, double taxRate) {
        Money taxableAmount = receiptLine.getTaxableAmount();

        Money salestax = new Money(taxableAmount.getValue());
        salestax.multiply(taxRate);
        salestax.roundToNearest5Cents();

        receiptLine.setSalesTax(salestax);

    }

    private static void calculateReceiptLineTotal(ReceiptLine receiptLine) {
        Money total = receiptLine.getTotal();

        total.add(receiptLine.getTaxableAmount());
        total.add(receiptLine.getSalesTax());
        total.round();
    }

    public static void printReceipt(Receipt receipt) {

        for (ReceiptLine receiptLine : receipt.getReceiptLines()) {
            String importedOption = "";
            if (receiptLine.isImportTax()) {
                importedOption = "imported ";
            }
            Product product = receiptLine.getProduct();
            String receiptLineOutput = receiptLine.getAmount().intValue() + " " + importedOption + product.getName() + " : " + receiptLine.getTotal().getValue();
            System.out.println(receiptLineOutput);
        }
        System.out.println("Sales Taxes: " + receipt.getSalesTaxes().toString());
        System.out.println("Total: " + receipt.getTotal().toString());

    }
}
