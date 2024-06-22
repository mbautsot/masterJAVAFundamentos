package Cadenas;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        //Creamos nustro objeto de Scanner
        Scanner scan = new Scanner(System.in);

        //En este arreglo guardare los nombres de los integrantes familia
        String[] nombres = new String[3];

        for (int i = 0; i < nombres.length; i++) {
            String nombre="";
            while (nombre.isBlank()){
                System.out.println("Escribe el nombre de un integrante de tu familia :");
                nombre = scan.nextLine();

                ///Tomamos el segundo caracter y lo convertimos a mayuscula.
                char[] nom =  nombre.toCharArray();

                int length = nom.length;
                nombre = String.valueOf(nom[1]).toUpperCase().concat(".").concat(nombre.substring(length-2));


                if(nombre.isBlank()){
                    System.out.println("Error: El nombre no puede estar vacío. Por favor, inténtalo de nuevo.");
                }
            }
            nombres[i] = nombre;
        }

        String integrantes ="";
        for (int i = 0; i < 3; i++) {
            integrantes+=nombres[i].concat("_");
        }
        System.out.println(integrantes.substring(0,integrantes.length()-1));


    }
}
