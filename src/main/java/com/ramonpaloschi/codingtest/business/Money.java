/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramonpaloschi.codingtest.business;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 *
 * @author ramon
 */
public class Money {

    private final int roundingMode = BigDecimal.ROUND_HALF_UP;
    private static final BigDecimal ZERO = new BigDecimal("0.00");

    private BigDecimal value = ZERO;
    private int fractionalDigits = 2;

    public Money() {
    }

    public Money(double amount) {
        value = toBigDecimal(amount);
    }

    public Money(BigDecimal amount) {
        value = amount;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public int getFractionalDigits() {
        return fractionalDigits;
    }

    public void setFractionalDigits(int fractionalDigits) {
        this.fractionalDigits = fractionalDigits;
    }

    public static BigDecimal toBigDecimal(double aDouble) {
        String asString = Double.toString(aDouble);
        return new BigDecimal(asString);
    }

    public void round() {
        value = value.setScale(fractionalDigits, roundingMode);
    }

    //Round up to the nearest 5 cents.
    public void roundToNearest5Cents() {
        value = value.divide(new BigDecimal("0.05")).setScale(0, BigDecimal.ROUND_UP).multiply(new BigDecimal("0.05"));
    }

    public void add(Money money) {
        value = value.add(money.value);
    }

    public void multiply(double value1) {
        value = value.multiply(toBigDecimal(value1));
    }

    @Override
    public String toString() {
        NumberFormat formatter = NumberFormat.getNumberInstance();

        formatter.setMinimumFractionDigits(fractionalDigits);
        formatter.setMaximumFractionDigits(fractionalDigits);

        //System.out.println("toString: " + formatter.format(value));
        return formatter.format(value);
    }

    public boolean isZero() {
        return (value.compareTo(ZERO) == 0);
    }

    public boolean isNotZero() {
        return !isZero();
    }

    public boolean isNegative() {
        return (value.compareTo(ZERO) < 0);
    }

    public boolean isPositive() {
        return (value.compareTo(ZERO) >= 0);
    }

}
