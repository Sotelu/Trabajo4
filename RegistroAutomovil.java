package com.mycompany.mavenproject1;


import java.util.Scanner;
import java.util.ArrayList;

public class RegistroAutomovil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Main> registro = new ArrayList<>();
        int opc = 0;
        do {
            System.out.println(" MENU ");
            System.out.println("1. Crear un nuevo registro");
            System.out.println("2. Buscar un registro");
            System.out.println("3. Editar un registro");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opc = scanner.nextInt();
            scanner.nextLine();
         
            switch (opc) {
                case 1:
                    System.out.print("ID: ");
                    int id = 0;
                    while (true) { 
                        try {
                            id = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Error: ID debe ser un número entero.");
                        }
                    }
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    while (marca.isEmpty()) { 
                        System.out.println("Error: Marca no puede estar vacía.");
                        System.out.print("Marca: ");
                        marca = scanner.nextLine();
                    }

                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    while (modelo.isEmpty()) {
                        System.out.println("Error: Modelo no puede estar vacio.");
                        System.out.print("Modelo: ");
                        modelo = scanner.nextLine();
                    }

                    int año = 0;
                    while (true) {
                        try {
                            System.out.print("Año: ");
                            año = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Año debe ser un número entero.");
                        }
                    }

                    System.out.print("Tipo: ");
                    String tipo = scanner.nextLine();
                    while (tipo.isEmpty()) {
                        System.out.println("Error: Tipo no puede estar vacio.");
                        System.out.print("Tipo: ");
                        tipo = scanner.nextLine();
                    }

                    System.out.print("Número de Chasis: ");
                    String numeroChasis = scanner.nextLine();
                    while (numeroChasis.isEmpty()) {
                        System.out.println("Error: Número de Chasis no puede estar vacio.");
                        System.out.print("Número de Chasis: ");
                        numeroChasis = scanner.nextLine();
                    }

                    System.out.print("Color: ");
                    String color = scanner.nextLine();
                    while (color.isEmpty()) {
                        System.out.println("Error: Color no puede estar vacio.");
                        System.out.print("Color: ");
                        color = scanner.nextLine();
                    }

                    Main nuevoAuto = new    Main(id, marca, modelo, año, tipo, numeroChasis, color);
                    registro.add(nuevoAuto);  

                    System.out.println("Datos ingresados correctamente");
                    break;
                case 2:
                    System.out.print("Ingrese el id para buscar: ");
                    int n1 = scanner.nextInt();
                    Main.buscarRegistro(n1, registro);
                    break;
                case 3:
                    System.out.print("Ingrese el id para buscar: ");
                    int n2 = scanner.nextInt();
                    Main.editarRegistro(n2, registro);
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion inválida. Ingresa una opcion válida.");
            }
            
        } while(opc != 4);
    }
}
{