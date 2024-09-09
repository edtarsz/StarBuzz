/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators.beverage;

/**
 * Clase abstracta que implementa la interfaz `IBeverage` y sirve como base para
 * los decoradores de bebidas. Esta clase maneja la referencia a la bebida base
 * (`wrappee`) y proporciona una implementación común para los métodos de los
 * decoradores.
 *
 * @author Eduardo Talavera Ramos | 00000245244 | Fecha: 08/09/2024
 */
public abstract class BaseBeverageDecorator implements IBeverage {

    private final IBeverage wrappee; // La bebida base que será decorada.

    /**
     * Constructor que recibe una instancia de `IBeverage` para decorar.
     *
     * @param wrappee La bebida base que será decorada.
     */
    public BaseBeverageDecorator(IBeverage wrappee) {
        this.wrappee = wrappee; // Inicializa el decorador con la bebida base.
    }

    /**
     * Método que delega el envío del mensaje a la bebida base decorada.
     *
     * @param msg El mensaje que se desea enviar o imprimir.
     */
    @Override
    public void send(String msg) {
        wrappee.send(msg); // Llama al método `send` de la bebida base.
    }

    /**
     * Método que delega la obtención del costo a la bebida base decorada.
     *
     * @return El costo de la bebida base decorada.
     */
    @Override
    public float getCosto() {
        return wrappee.getCosto(); // Devuelve el costo de la bebida base.
    }
}
