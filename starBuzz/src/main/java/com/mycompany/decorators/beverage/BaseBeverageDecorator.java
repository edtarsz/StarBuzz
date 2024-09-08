/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators.beverage;

/**
 *
 * @author user
 */
public abstract class BaseBeverageDecorator implements IBeverage {

    private final IBeverage wrappee;

    public BaseBeverageDecorator(IBeverage wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String msg) {
        wrappee.send(msg);
    }

    public float getCosto() {
        return wrappee.getCosto();
    }

}
