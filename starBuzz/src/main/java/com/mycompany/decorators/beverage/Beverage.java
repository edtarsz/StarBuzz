/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators.beverage;

/**
 *
 * @author user
 */
public class Beverage implements IBeverage {

    private float costo;

    @Override
    public void send(String msg) {
    }

    @Override
    public float getCosto() {
        return costo;
    }

}
