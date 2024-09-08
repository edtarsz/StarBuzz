/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators.condiment;

import com.mycompany.decorators.beverage.IBeverage;

/**
 *
 * @author Ramosz
 */
public class WhippedCreamDecorator extends CondimentDecorator {

    public WhippedCreamDecorator(IBeverage wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        msg = "-    Whipped Cream";
        System.out.println(msg);
        super.send(msg);
    }
}
