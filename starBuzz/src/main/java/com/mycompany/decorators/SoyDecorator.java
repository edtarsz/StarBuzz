/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators;

/**
 *
 * @author Ramosz
 */
public class SoyDecorator extends CondimentDecorator {

    private float cost = 38;

    public SoyDecorator(IBeverage wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        msg = "House Blend, " + msg;
        super.send(msg);
    }
}
