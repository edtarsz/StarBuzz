/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.demo;

import com.mycompany.decorators.beverage.Beverage;
import com.mycompany.decorators.beverage.DarkRoastDecorator;
import com.mycompany.decorators.beverage.HouseBlendDecorator;
import com.mycompany.decorators.beverage.IBeverage;
import com.mycompany.decorators.condiment.MilkDecorator;
import com.mycompany.decorators.condiment.SoyDecorator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Eduardo Talavera Ramos | 00000245244 | Fecha: 25/08/2024
 */
public class StarBuzz {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<IBeverage> carrito = new ArrayList<>();
            boolean continuar = true;

            while (continuar) {
                System.out.println("----------------------------------");
                System.out.println("Menu principal:");
                System.out.println("1. Agregar bebida base");
                System.out.println("2. Mostrar pedido");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opcion: ");

                int opcion = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer del scanner

                switch (opcion) {
                    case 1 -> {
                        IBeverage bebidaBase = seleccionarBebida(scanner);

                        if (bebidaBase == null) {
                            System.out.println("No se selecciono una bebida valida.");
                            break;
                        }
                        carrito.add(bebidaBase);
                    }
                    case 2 ->
                        mostrarPedido(carrito);
                    case 3 -> {
                        continuar = false;
                        System.out.println("Gracias por su compra!");
                    }
                    default ->
                        System.out.println("Opcion no valida. Intente de nuevo.");
                }
            }
        }
    }

    // Se envian scanners para limpiar el buffer
    private static IBeverage seleccionarBebida(Scanner scanner) {
        System.out.println("----------------------------------");
        System.out.println("Seleccione el tipo de bebida base:");
        System.out.println("1. Dark Roast");
        System.out.println("2. House Blend");
        System.out.print("Opcion: ");
        int tipoBebida = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer

        // Seleccionar la bebida base
        IBeverage bebidaBase;
        switch (tipoBebida) {
            case 1 ->
                bebidaBase = new DarkRoastDecorator(new Beverage());
            case 2 ->
                bebidaBase = new HouseBlendDecorator(new Beverage());
            default -> {
                System.out.println("Opcion no valida.");
                return null;
            }
        }

        // Ahora seleccionamos los condimentos y decoramos la bebida base
        List<IBeverage> condimentos = seleccionaCondimentos(scanner, bebidaBase);

        // Aplicamos todos los condimentos a la bebida base
        IBeverage bebidaDecorada = bebidaBase;
        for (IBeverage condimento : condimentos) {
            bebidaDecorada = condimento;  // Los decoradores deberían funcionar encadenando la bebida
        }

        return bebidaDecorada;  // Devuelve la bebida con todos los condimentos aplicados
    }

    private static List<IBeverage> seleccionaCondimentos(Scanner scanner, IBeverage bebidaBase) {
        // Añadir condimentos a la bebida seleccionada
        boolean agregarCondimentos = true;
        List<IBeverage> condimentos = new ArrayList<>();
        while (agregarCondimentos) {
            System.out.println("----------------------------------");
            System.out.println("Seleccione condimentos (puede seleccionar multiples):");
            System.out.println("1. Milk");
            System.out.println("2. Soy");
            System.out.println("3. Terminar de agregar condimentos");
            System.out.print("Opcion: ");
            int tipoCondimento = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (tipoCondimento) {
                case 1 -> {
                    bebidaBase = new MilkDecorator(bebidaBase);  // Decoramos la bebida base con Milk
                    condimentos.add(bebidaBase);  // Añadimos el decorador a la lista
                }
                case 2 -> {
                    bebidaBase = new SoyDecorator(bebidaBase);  // Decoramos la bebida base con Soy
                    condimentos.add(bebidaBase);  // Añadimos el decorador a la lista
                }
                case 3 ->
                    agregarCondimentos = false;
                default ->
                    System.out.println("Opcion no valida.");
            }
        }
        return condimentos;
    }

    private static void mostrarPedido(List<IBeverage> carrito) {
        float costoTotal = 0;
        if (carrito.isEmpty()) {
            System.out.println("El carrito esta vacio.");
            return;
        }

        System.out.println("----------------------------------");
        System.out.println("Pedido:");
        for (IBeverage bebida : carrito) {
            costoTotal += bebida.getCosto();
            bebida.send("Bebida:");
        }
        System.out.printf("Costo total: %.2f\n", costoTotal);
    }
}
