/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators.beverage;

/**
 * Decorador concreto que representa una bebida de tipo "Expresso". Extiende la
 * clase base `BaseBeverageDecorator` y añade el costo y el mensaje específico
 * para la bebida "Expresso".
 *
 * @author Eduardo Talavera Ramos | 00000245244 | Fecha: 08/09/2024
 */
public class ExpressoDecorator extends BaseBeverageDecorator {

    private final float costo = 45.00f; // Costo específico para la bebida "Expresso".

    /**
     * Constructor que recibe una instancia de IBeverage (bebida base) y la
     * envuelve con el decorador "Expresso".
     *
     * @param wrapped La bebida base que será decorada con Expresso.
     */
    public ExpressoDecorator(IBeverage wrapped) {
        super(wrapped); // Llama al constructor de la clase base (BaseBeverageDecorator).
    }

    /**
     * Método que imprime la adición de "Expresso" a la bebida junto con su
     * costo, y luego llama al método `send` de la bebida decorada.
     *
     * @param msg El mensaje que se desea enviar o imprimir.
     */
    @Override
    public void send(String msg) {
        msg = "* Expresso .......... "; // Modifica el mensaje para incluir "Expresso".
        System.out.println(msg + costo); // Imprime el mensaje con el costo asociado.
        super.send(msg); // Llama al método `send` del decorador original para continuar con la cadena de decoradores.
    }

    /**
     * Método que calcula el costo total de la bebida decorada añadiendo el
     * costo de "Expresso".
     *
     * @return El costo total de la bebida incluyendo el costo del decorador
     * "Expresso".
     */
    @Override
    public float getCosto() {
        return super.getCosto() + costo; // Devuelve el costo de la bebida base más el costo del decorador.
    }
}
