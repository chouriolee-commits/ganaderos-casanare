package src.main.java;

import java.util.Scanner;

public class Main {

    static ArbolBST arbol = new ArbolBST();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Datos iniciales
        arbol.insertar(104, "Holstein",     550.0, 4);
        arbol.insertar(101, "Angus",        620.5, 6);
        arbol.insertar(110, "Brahman",      480.0, 3);
        arbol.insertar(99,  "Hereford",     510.0, 5);
        arbol.insertar(106, "Simmental",    700.2, 2);

        int opcion;
        do {
            System.out.println("\n==== MENÚ - REGISTRO DE RESES ====");
            System.out.println("1. Insertar res");
            System.out.println("2. Consultar res por código");
            System.out.println("3. Modificar res");
            System.out.println("4. Mostrar recorrido Pre-Orden");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = Integer.parseInt(sc.nextLine().trim());

            switch (opcion) {
                case 1 -> {
                    System.out.print("Código: ");
                    int codigo = Integer.parseInt(sc.nextLine().trim());
                    System.out.print("Raza: ");
                    String raza = sc.nextLine().trim();
                    System.out.print("Peso (kg): ");
                    double peso = Double.parseDouble(sc.nextLine().trim());
                    System.out.print("Edad (años): ");
                    int edad = Integer.parseInt(sc.nextLine().trim());
                    arbol.insertar(codigo, raza, peso, edad);
                    System.out.println("Res insertada.");
                }
                case 2 -> {
                    System.out.print("Código a buscar: ");
                    int codigo = Integer.parseInt(sc.nextLine().trim());
                    NodoBST nodo = arbol.buscar(codigo);
                    if (nodo == null) {
                        System.out.println("No se encontró ninguna res con ese código.");
                    } else {
                        System.out.println("Código: " + nodo.codigo);
                        System.out.println("Raza:   " + nodo.raza);
                        System.out.println("Peso:   " + nodo.peso + " kg");
                        System.out.println("Edad:   " + nodo.edad + " años");
                    }
                }
                case 3 -> {
                    System.out.print("Código de la res a modificar: ");
                    int codigo = Integer.parseInt(sc.nextLine().trim());
                    NodoBST nodo = arbol.buscar(codigo);
                    if (nodo == null) {
                        System.out.println("No se encontró ninguna res con ese código.");
                    } else {
                        System.out.print("Nueva raza (" + nodo.raza + "): ");
                        nodo.raza = sc.nextLine().trim();
                        System.out.print("Nuevo peso (" + nodo.peso + "): ");
                        nodo.peso = Double.parseDouble(sc.nextLine().trim());
                        System.out.print("Nueva edad (" + nodo.edad + "): ");
                        nodo.edad = Integer.parseInt(sc.nextLine().trim());
                        System.out.println("Datos actualizados.");
                    }
                }
                case 4 -> arbol.preOrden();
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}