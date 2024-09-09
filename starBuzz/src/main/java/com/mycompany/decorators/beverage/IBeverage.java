/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.decorators.beverage;

/**
 * Interfaz que define el contrato para las bebidas en el sistema. Proporciona
 * métodos para enviar información sobre la bebida y obtener su costo.
 *
 * @author Eduardo Talavera Ramos | 00000245244 | Fecha: 08/09/2024
 */
public interface IBeverage {

    /**
     * Envía un mensaje relacionado con la bebida. Este método puede ser usado
     * para imprimir o registrar información sobre la bebida.
     *
     * @param msg El mensaje que se desea enviar o imprimir.
     */
    public void send(String msg);

    /**
     * Obtiene el costo de la bebida. Este método debe ser implementado por
     * todas las clases que representan una bebida para devolver el costo
     * asociado.
     *
     * @return El costo de la bebida como un valor flotante.
     */
    public float getCosto();
}
