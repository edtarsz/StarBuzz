/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.demo;

import com.mycompany.decorators.beverage.Beverage;
import com.mycompany.decorators.beverage.DarkRoastDecorator;
import com.mycompany.decorators.beverage.DecafDecorator;
import com.mycompany.decorators.beverage.ExpressoDecorator;
import com.mycompany.decorators.beverage.HouseBlendDecorator;
import com.mycompany.decorators.beverage.IBeverage;
import com.mycompany.decorators.condiment.ChocolateDecorator;
import com.mycompany.decorators.condiment.MilkDecorator;
import com.mycompany.decorators.condiment.SoyDecorator;
import com.mycompany.decorators.condiment.WhippedCreamDecorator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase principal que simula un sistema de pedidos para una cafetería usando el
 * patrón Decorator. Los usuarios pueden seleccionar una bebida base y añadir
 * condimentos para personalizar su pedido.
 *
 * @author Eduardo Talavera Ramos | 00000245244 | Fecha: 08/09/2024
 */
public class StarBuzz {

    public static void main(String[] args) {
        // Se usa try-with-resources para asegurarse de que el Scanner se cierra automáticamente
        try (Scanner scanner = new Scanner(System.in)) {
            // Lista para almacenar las bebidas seleccionadas
            List<IBeverage> carrito = new ArrayList<>();
            boolean continuar = true;

            // Bucle principal del menú
            while (continuar) {
                System.out.println("----------------------------------");
                System.out.println("Menu principal:");
                System.out.println("1. Agregar bebida base");
                System.out.println("2. Mostrar pedido");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opcion: ");

                int opcion = scanner.nextInt(); // Captura la opción del usuario
                scanner.nextLine(); // Limpiar el buffer del Scanner

                // Procesa la opción seleccionada por el usuario
                switch (opcion) {
                    case 1 -> {
                        // Selecciona la bebida base
                        IBeverage bebidaBase = seleccionarBebida(scanner);

                        // Si no se selecciona una bebida válida, no se agrega nada al carrito
                        if (bebidaBase == null) {
                            System.out.println("No se selecciono una bebida valida.");
                            break;
                        }
                        carrito.add(bebidaBase); // Agrega la bebida seleccionada al carrito
                    }
                    case 2 ->
                        mostrarPedido(carrito); // Muestra el pedido actual
                    case 3 -> {
                        continuar = false; // Termina el bucle y la ejecución
                        System.out.println("Gracias por su compra!!!");
                    }
                    default ->
                        System.out.println("Opcion no valida. Intente de nuevo."); // Mensaje para opción inválida
                }
            }
        }
    }

    /**
     * Método para seleccionar una bebida base del menú.
     *
     * @param scanner El scanner para capturar la entrada del usuario.
     * @return La bebida seleccionada con todos los condimentos aplicados.
     */
    private static IBeverage seleccionarBebida(Scanner scanner) {
        System.out.println("----------------------------------");
        System.out.println("Seleccione el tipo de bebida base:");
        System.out.println("1. House Blend");
        System.out.println("2. Dark Roast");
        System.out.println("3. Expresso");
        System.out.println("4. Decaf");
        System.out.print("Opcion: ");
        int tipoBebida = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del Scanner

        // Selecciona la bebida base según la opción elegida por el usuario
        IBeverage bebidaBase;
        switch (tipoBebida) {
            case 1 ->
                bebidaBase = new HouseBlendDecorator(new Beverage());
            case 2 ->
                bebidaBase = new DarkRoastDecorator(new Beverage());
            case 3 ->
                bebidaBase = new ExpressoDecorator(new Beverage());
            case 4 ->
                bebidaBase = new DecafDecorator(new Beverage());
            default -> {
                System.out.println("Opcion no valida.");
                return null;
            }
        }

        // Selecciona los condimentos que se añadirán a la bebida
        List<IBeverage> condimentos = seleccionaCondimentos(scanner, bebidaBase);

        // Aplica los condimentos a la bebida base
        IBeverage bebidaDecorada = bebidaBase;
        for (IBeverage condimento : condimentos) {
            bebidaDecorada = condimento; // Se encadenan los decoradores
        }
        return bebidaDecorada; // Devuelve la bebida decorada
    }

    /**
     * Método para seleccionar los condimentos que se añadirán a una bebida.
     *
     * @param scanner El scanner para capturar la entrada del usuario.
     * @param bebidaBase La bebida base a la cual se le añadirán los
     * condimentos.
     * @return Una lista con los condimentos seleccionados.
     */
    private static List<IBeverage> seleccionaCondimentos(Scanner scanner, IBeverage bebidaBase) {
        boolean agregarCondimentos = true;
        List<IBeverage> condimentos = new ArrayList<>();

        // Bucle para añadir múltiples condimentos
        while (agregarCondimentos) {
            System.out.println("----------------------------------");
            System.out.println("Seleccione condimentos (puede seleccionar multiples):");
            System.out.println("1. Milk");
            System.out.println("2. Soy");
            System.out.println("3. Chocolate");
            System.out.println("4. Whipped Cream");
            System.out.println("5. Terminar de agregar condimentos");
            System.out.print("Opcion: ");
            int tipoCondimento = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del Scanner

            // Añade el condimento seleccionado a la bebida
            switch (tipoCondimento) {
                case 1 -> {
                    bebidaBase = new MilkDecorator(bebidaBase); // Añade Milk
                    condimentos.add(bebidaBase);
                }
                case 2 -> {
                    bebidaBase = new SoyDecorator(bebidaBase); // Añade Soy
                    condimentos.add(bebidaBase);
                }
                case 3 -> {
                    bebidaBase = new ChocolateDecorator(bebidaBase); // Añade Chocolate
                    condimentos.add(bebidaBase);
                }
                case 4 -> {
                    bebidaBase = new WhippedCreamDecorator(bebidaBase); // Añade Whipped Cream
                    condimentos.add(bebidaBase);
                }
                case 5 ->
                    agregarCondimentos = false; // Termina la selección de condimentos
                default ->
                    System.out.println("Opcion no valida.");
            }
        }
        return condimentos; // Devuelve la lista de condimentos seleccionados
    }

    /**
     * Método para mostrar el pedido actual y el costo total.
     *
     * @param carrito Lista de bebidas seleccionadas por el usuario.
     */
    private static void mostrarPedido(List<IBeverage> carrito) {
        float costoTotal = 0;

        if (carrito.isEmpty()) {
            System.out.println("El carrito esta vacio.");
            return; // Si no hay bebidas en el carrito, no muestra nada más
        }

        System.out.println("----------------------------------");
        System.out.println("Pedido:");
        for (IBeverage bebida : carrito) {
            costoTotal += bebida.getCosto(); // Calcula el costo total sumando el precio de cada bebida
            bebida.send("Bebida:"); // Envía la descripción de la bebida
        }
        System.out.printf("Costo total: %.2f\n", costoTotal); // Muestra el costo total formateado
    }
}
