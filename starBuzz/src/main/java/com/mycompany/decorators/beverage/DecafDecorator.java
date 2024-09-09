/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators.beverage;

/**
 * Decorador concreto que representa una bebida de tipo "Decaf". Extiende la
 * clase base `BaseBeverageDecorator` y añade el costo y el mensaje específico
 * para la bebida "Decaf".
 *
 * @author Eduardo Talavera Ramos | 00000245244 | Fecha: 08/09/2024
 */
public class DecafDecorator extends BaseBeverageDecorator {

    private final float costo = 30.00f; // Costo específico para la bebida "Decaf".

    /**
     * Constructor que recibe una instancia de IBeverage (bebida base) y la
     * envuelve con el decorador "Decaf".
     *
     * @param wrapped La bebida base que será decorada con Decaf.
     */
    public DecafDecorator(IBeverage wrapped) {
        super(wrapped); // Llama al constructor de la clase base (BaseBeverageDecorator).
    }

    /**
     * Método que imprime la adición de "Decaf" a la bebida junto con su costo,
     * y luego llama al método `send` de la bebida decorada.
     *
     * @param msg El mensaje que se desea enviar o imprimir.
     */
    @Override
    public void send(String msg) {
        msg = "* Decaf .......... "; // Modifica el mensaje para incluir "Decaf".
        System.out.println(msg + costo); // Imprime el mensaje con el costo asociado.
        super.send(msg); // Llama al método `send` del decorador original para continuar con la cadena de decoradores.
    }

    /**
     * Método que calcula el costo total de la bebida decorada añadiendo el
     * costo de "Decaf".
     *
     * @return El costo total de la bebida incluyendo el costo del decorador
     * "Decaf".
     */
    @Override
    public float getCosto() {
        return super.getCosto() + costo; // Devuelve el costo de la bebida base más el costo del decorador.
    }
}
