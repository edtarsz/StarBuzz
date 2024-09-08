/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators;

/**
 *
 * @author Ramosz
 */
public class DarkRoastDecorator extends BaseBeverageDecorator {

    private float cost = 38;

    public DarkRoastDecorator(IBeverage wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        msg = "Dark Roast, " + msg;
        super.send(msg);
    }

}
