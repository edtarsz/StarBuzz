/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators.condiment;

import com.mycompany.decorators.beverage.BaseBeverageDecorator;
import com.mycompany.decorators.beverage.IBeverage;

/**
 * Clase abstracta que sirve como base para todos los decoradores de
 * condimentos. Extiende de BaseBeverageDecorator y utiliza el patrón de diseño
 * Decorator para añadir condimentos a una bebida.
 *
 * @author Eduardo Talavera Ramos | 00000245244 | Fecha: 08/09/2024
 */
public abstract class CondimentDecorator extends BaseBeverageDecorator {

    /**
     * Constructor que recibe una instancia de IBeverage (bebida base) que será
     * decorada con un condimento.
     *
     * @param wrapped La bebida base que será envuelta por el decorador de
     * condimentos.
     */
    public CondimentDecorator(IBeverage wrapped) {
        super(wrapped); // Llama al constructor de la clase base (BaseBeverageDecorator).
    }

    /**
     * Método que pasa el mensaje al método `send` de la bebida envuelta,
     * permitiendo que los decoradores adicionales puedan modificar el
     * comportamiento del método.
     *
     * @param msg El mensaje que se desea enviar o imprimir.
     */
    @Override
    public void send(String msg) {
        super.send(msg); // Llama al método `send` de la bebida envuelta (o de los decoradores anteriores).
    }

    /**
     * Método que delega la obtención del costo del condimento a la bebida base
     * decorada.
     *
     * @return El costo de la bebida base decorada.
     */
    @Override
    public float getCosto() {
        return super.getCosto(); // Devuelve el costo de la bebida base.
    }
}
