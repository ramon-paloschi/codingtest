/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramonpaloschi.codingtest.product;

import com.ramonpaloschi.codingtest.App;

/**
 *
 * @author ramon
 */
public class ProductFunctions {

    public static Product getProduct(Integer productId) {
        return App.getProducts().get(productId);
    }
}
