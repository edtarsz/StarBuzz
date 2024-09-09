/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators.condiment;

import com.mycompany.decorators.beverage.IBeverage;

/**
 * Decorador concreto que añade "Whipped Cream" (crema batida) a una bebida.
 * Extiende la clase abstracta CondimentDecorator para aplicar el patrón de
 * diseño Decorator, permitiendo agregar el condimento de manera dinámica a
 * cualquier instancia de IBeverage.
 *
 * @author Eduardo Talavera Ramos | 00000245244 | Fecha: 08/09/2024
 */
public class WhippedCreamDecorator extends CondimentDecorator {

    /**
     * Constructor que recibe una instancia de IBeverage, la cual es la bebida a
     * la que se le aplicará el decorador (en este caso, Whipped Cream).
     *
     * @param wrapped La bebida base que será decorada con Whipped Cream.
     */
    public WhippedCreamDecorator(IBeverage wrapped) {
        super(wrapped); // Llama al constructor de la clase base (CondimentDecorator).
    }

    /**
     * Método que imprime la adición de Whipped Cream (crema batida) a la bebida
     * y luego llama al método `send` de la bebida decorada.
     *
     * @param msg El mensaje que se desea enviar o imprimir.
     */
    @Override
    public void send(String msg) {
        msg = "-    Whipped Cream"; // Modifica el mensaje para incluir el condimento específico.
        System.out.println(msg); // Imprime el condimento.
        super.send(msg); // Llama al método `send` del decorador original para continuar la cadena de decoradores.
    }
}
