/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators;

/**
 *
 * @author Ramosz
 */
public class MilkDecorator extends CondimentDecorator {

    public MilkDecorator(IBeverage wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        msg = "Milk, " + msg;
        super.send(msg);
    }

}
