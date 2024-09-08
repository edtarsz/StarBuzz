/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators;

/**
 *
 * @author user
 */
public class CondimentDecorator extends BaseBeverageDecorator {

    private float cost = 38;

    public CondimentDecorator(IBeverage wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
    }
}
