/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators.beverage;

/**
 *
 * @author Ramosz
 */
public class DecafDecorator extends BaseBeverageDecorator {

    private final float costo = 30.00f;

    public DecafDecorator(IBeverage wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        msg = "* Decaf .......... ";
        System.out.println(msg + costo);
        super.send(msg);
    }

    @Override
    public float getCosto() {
        return super.getCosto() + costo;
    }
}
