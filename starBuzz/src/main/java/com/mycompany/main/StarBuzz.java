/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;

import com.mycompany.decorators.Beverage;
import com.mycompany.decorators.HouseBlendDecorator;
import com.mycompany.decorators.IBeverage;
import com.mycompany.decorators.MilkDecorator;

/**
 *
 * @author Eduardo Talavera Ramos | 00000245244 | Fecha: 25/08/2024
 */
public class StarBuzz {

    public static void main(String[] args) {
        System.out.println("El pedido es: ");
        String msg = "";
        IBeverage beverage = new MilkDecorator(new HouseBlendDecorator(new Beverage()));
        beverage.send(msg);
    }
}
