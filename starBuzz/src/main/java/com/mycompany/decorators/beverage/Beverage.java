/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorators.beverage;

/**
 * Implementación concreta de la interfaz `IBeverage` que representa una bebida
 * base. Esta clase proporciona una implementación simple de los métodos
 * definidos en `IBeverage`, sin aplicar ningún decorador adicional.
 *
 * @author Eduardo Talavera Ramos | 00000245244 | Fecha: 08/09/2024
 */
public class Beverage implements IBeverage {

    private float costo; // Costo de la bebida base.

    /**
     * Método que maneja el envío de mensajes relacionados con la bebida. En
     * esta implementación, el método no realiza ninguna acción.
     *
     * @param msg El mensaje que se desea enviar o imprimir.
     */
    @Override
    public void send(String msg) {
        // No realiza ninguna acción en esta implementación.
    }

    /**
     * Método que devuelve el costo de la bebida base.
     *
     * @return El costo de la bebida base.
     */
    @Override
    public float getCosto() {
        return costo; // Devuelve el costo de la bebida base.
    }

    /**
     * Establece el costo de la bebida base.
     *
     * @param costo El costo a establecer para la bebida base.
     */
    public void setCosto(float costo) {
        this.costo = costo; // Asigna el valor del costo a la bebida base.
    }
}
