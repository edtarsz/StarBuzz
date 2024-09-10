/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators.condiment;

import com.mycompany.decorators.beverage.IBeverage;

/**
 * Decorador concreto que añade "Soy" (leche de soya) a una bebida. Extiende la
 * clase abstracta CondimentDecorator y utiliza el patrón de diseño Decorator
 * para agregar dinámicamente el condimento de leche de soya a una bebida.
 *
 * @author Eduardo Talavera Ramos | 00000245244 | Fecha: 08/09/2024
 */
public class SoyDecorator extends CondimentDecorator {

    private final float costo = 10.00f; // Costo específico para la bebida "House Blend".

    /**
     * Constructor que recibe una instancia de IBeverage (bebida base) y la
     * envuelve con el condimento Soy (leche de soya).
     *
     * @param wrapped La bebida base que será decorada con Soy.
     */
    public SoyDecorator(IBeverage wrapped) {
        super(wrapped); // Llama al constructor de la clase base (CondimentDecorator).
    }

    /**
     * Método que imprime la adición de Soy (leche de soya) a la bebida y luego
     * llama al método `send` de la bebida decorada.
     *
     * @param msg El mensaje que se desea enviar o imprimir.
     */
    @Override
    public void send(String msg) {
        msg = "-    Soy .......... "; // Modifica el mensaje para incluir "House Blend".
        System.out.println(msg + costo); // Imprime el mensaje con el costo asociado.
        super.send(msg); // Llama al método `send` del decorador anterior, permitiendo encadenar decoradores.
    }

    /**
     * Método que calcula el costo total del condimento de la bebida decorada
     * añadiendo el costo de "Soy".
     *
     * @return El costo total del condimento incluyendo el costo del decorador
     * "Soy".
     */
    @Override
    public float getCosto() {
        return super.getCosto() + costo; // Devuelve el costo del condimento más el costo del decorador.
    }
}
