/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators.condiment;

import com.mycompany.decorators.beverage.IBeverage;

/**
 * Decorador concreto que añade "Chocolate" a una bebida. Extiende la clase
 * abstracta CondimentDecorator para aplicar el patrón de diseño Decorator,
 * permitiendo agregar el condimento de chocolate a una bebida de forma
 * dinámica.
 *
 * @author Eduardo Talavera Ramos | 00000245244 | Fecha: 08/09/2024
 */
public class ChocolateDecorator extends CondimentDecorator {

    private final float costo = 10.00f; // Costo específico para la bebida "House Blend".

    /**
     * Constructor que recibe una instancia de IBeverage (bebida base) y la
     * envuelve con el condimento Chocolate.
     *
     * @param wrapped La bebida base que será decorada con Chocolate.
     */
    public ChocolateDecorator(IBeverage wrapped) {
        super(wrapped); // Llama al constructor de la clase base (CondimentDecorator).
    }

    /**
     * Método que imprime la adición de Chocolate a la bebida y luego llama al
     * método `send` de la bebida decorada.
     *
     * @param msg El mensaje que se desea enviar o imprimir.
     */
    @Override
    public void send(String msg) {
        msg = "-    Chocolate .......... "; // Modifica el mensaje para incluir "House Blend".
        System.out.println(msg + costo); // Imprime el mensaje con el costo asociado.
        super.send(msg); // Llama al método `send` del decorador original para continuar la cadena de decoradores.
    }

    /**
     * Método que calcula el costo total del condimento de la bebida decorada
     * añadiendo el costo de "Chocolate".
     *
     * @return El costo total del condimento incluyendo el costo del decorador
     * "Chocolate".
     */
    @Override
    public float getCosto() {
        return super.getCosto() + costo; // Devuelve el costo del condimento más el costo del decorador.
    }
}
