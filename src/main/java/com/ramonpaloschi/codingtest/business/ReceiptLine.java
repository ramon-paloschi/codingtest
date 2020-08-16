/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramonpaloschi.codingtest.business;

import com.ramonpaloschi.codingtest.product.Product;

/**
 *
 * @author ramon
 */
public class ReceiptLine {

    private Product product = new Product();
    private Double amount = 1.0;
    private Money taxableAmount = new Money();
    private Money salesTax = new Money();
    private Money total = new Money();
    private boolean importTax = false;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Money getTaxableAmount() {
        return taxableAmount;
    }

    public void setTaxableAmount(Money taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    public Money getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(Money salesTax) {
        this.salesTax = salesTax;
    }

    public Money getTotal() {
        return total;
    }

    public void setTotal(Money total) {
        this.total = total;
    }

    public boolean isImportTax() {
        return importTax;
    }

    public void setImportTax(boolean importTax) {
        this.importTax = importTax;
    }

}
