package com.mycompany.mavenproject1;



import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public int id;
    public String marca;
    public String modelo;
    public int año;
    public String tipo;
    public String numeroChasis;
    public String color;

    // Constructor
    public Main(int id, String marca, String modelo, int año, String tipo, String numeroChasis, String color) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
        this.numeroChasis = numeroChasis;
        this.color = color;
    }

    // Getter y setter 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //para mostrar registro
    public void mostrarRegistro() {
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Tipo: " + tipo);
        System.out.println("Número de Chasis: " + numeroChasis);
        System.out.println("Color: " + color);
    }

    // Metodo para buscar
    public static void buscarRegistro(int n, ArrayList<Main> registro) {
        for(Main re : registro) {   //for each es para recorrer el array
            if (n == re.getId()) {
                System.out.println("Registro encontrado:");
                re.mostrarRegistro();
                return; //salir cuando se encuentra el registro
            }
        }
        System.out.println("Registro no encontrado.");  
    }

  //para editar el registro
    public static void editarRegistro(int n, ArrayList<Main> registro) {
        Scanner sc = new Scanner(System.in); 
        for(Main re : registro) {
            if (n == re.getId()) {
                System.out.println("Registro encontrado:");
                int id = 0;
                while (true) {        
                    try {
                        System.out.print("ID: ");
                        id = Integer.parseInt(sc.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: ID debe ser un número entero.");
                    }
                }
                re.setId(id); 
                System.out.print("Marca: ");
                String marca = sc.nextLine();
                while (marca.isEmpty()) { // para saber si el campo no esta vacio
                    System.out.println("Error: Marca no puede estar vacía."); 
                    System.out.print("Marca: ");
                    marca = sc.nextLine();
                }
                re.setMarca(marca);
            }
        }
    }
}