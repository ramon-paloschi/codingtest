/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramonpaloschi.codingtest.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ramon
 */
public class Receipt {

    private Date date = new Date();
    private Money salesTaxes = new Money();
    private Money total = new Money();

    private List<ReceiptLine> receiptLines = new ArrayList();

    public List<ReceiptLine> getReceiptLines() {
        return receiptLines;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setReceiptLines(List<ReceiptLine> receiptLines) {
        this.receiptLines = receiptLines;
    }

    public Money getSalesTaxes() {
        return salesTaxes;
    }

    public void setSalesTaxes(Money salesTaxes) {
        this.salesTaxes = salesTaxes;
    }

    public Money getTotal() {
        return total;
    }

    public void setTotal(Money total) {
        this.total = total;
    }

}
