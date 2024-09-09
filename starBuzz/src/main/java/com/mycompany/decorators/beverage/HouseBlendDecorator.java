/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators.beverage;

/**
 * Decorador concreto que representa una bebida de tipo "House Blend". Extiende
 * la clase base `BaseBeverageDecorator` y añade el costo y el mensaje
 * específico para la bebida "House Blend".
 *
 * @author Eduardo Talavera Ramos | 00000245244 | Fecha: 08/09/2024
 */
public class HouseBlendDecorator extends BaseBeverageDecorator {

    private final float costo = 38.00f; // Costo específico para la bebida "House Blend".

    /**
     * Constructor que recibe una instancia de IBeverage (bebida base) y la
     * envuelve con el decorador "House Blend".
     *
     * @param wrapped La bebida base que será decorada con House Blend.
     */
    public HouseBlendDecorator(IBeverage wrapped) {
        super(wrapped); // Llama al constructor de la clase base (BaseBeverageDecorator).
    }

    /**
     * Método que imprime la adición de "House Blend" a la bebida junto con su
     * costo, y luego llama al método `send` de la bebida decorada.
     *
     * @param msg El mensaje que se desea enviar o imprimir.
     */
    @Override
    public void send(String msg) {
        msg = "* House Blend .......... "; // Modifica el mensaje para incluir "House Blend".
        System.out.println(msg + costo); // Imprime el mensaje con el costo asociado.
        super.send(msg); // Llama al método `send` del decorador original para continuar con la cadena de decoradores.
    }

    /**
     * Método que calcula el costo total de la bebida decorada añadiendo el
     * costo de "House Blend".
     *
     * @return El costo total de la bebida incluyendo el costo del decorador
     * "House Blend".
     */
    @Override
    public float getCosto() {
        return super.getCosto() + costo; // Devuelve el costo de la bebida base más el costo del decorador.
    }
}
