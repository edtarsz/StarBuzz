/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators;

/**
 *
 * @author user
 */
public class Beverage implements IBeverage {

    @Override
    public void send(String msg) {
        System.out.println(msg);
    }

}
