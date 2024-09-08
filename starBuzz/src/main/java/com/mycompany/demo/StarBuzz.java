/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.demo;

import com.mycompany.decorators.beverage.Beverage;
import com.mycompany.decorators.beverage.DarkRoastDecorator;
import com.mycompany.decorators.beverage.HouseBlendDecorator;
import com.mycompany.decorators.beverage.IBeverage;
import com.mycompany.decorators.condiment.MilkDecorator;
import com.mycompany.decorators.condiment.SoyDecorator;

/**
 *
 * @author Eduardo Talavera Ramos | 00000245244 | Fecha: 25/08/2024
 */
public class StarBuzz {

    public static void main(String[] args) {
        System.out.println("El pedido es: ");
        String msg = "";
        IBeverage beverage = new HouseBlendDecorator(new MilkDecorator(new SoyDecorator(new DarkRoastDecorator(new SoyDecorator(new Beverage())))));
        beverage.send(msg);
        System.out.println("Costo total: " + beverage.getCosto());
    }
}
