package Operadores;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class EjercicioNombreMasLargo {
    public static void main(String[] args) {

        int i =0;
        List<String> nombres = new ArrayList<>();
        while (i<3){
            String nombreCompleto = JOptionPane.showInputDialog("Ingresa Nombre con Apellido:");
            if (nombreCompleto == null || nombreCompleto.trim().isEmpty() || nombreCompleto.split(" ").length < 2) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un nombre completo válido (Nombre y Apellido).");
                continue; // Solicita nuevamente si la entrada no es válida
            }
            nombres.add(nombreCompleto.trim());
            i++;
        }

        String nombreMasLargo = "";
        int longitudMasLarga = 0;


        for (String nombreCompleto : nombres) {
            String[] partes = nombreCompleto.split(" ");
            int longitudNombre = partes[0].length();
            System.out.println("nombre :" + longitudNombre);
            int longitudApellido = partes[1].length();
            System.out.println("nombre :" + longitudApellido);

            int longitudTotal = longitudNombre + longitudApellido;
            System.out.println("longitudTotal :" + longitudTotal +" --->" +nombreCompleto);


            if (longitudTotal > longitudMasLarga) {
                longitudMasLarga = longitudTotal;
                nombreMasLargo = nombreCompleto;
            }else{
                nombreMasLargo = "Hay un empate en la longitud de los nombres.";
            }
        }

        String resultado = "El nombre más largo es: " + nombreMasLargo;
        JOptionPane.showMessageDialog(null, resultado);

        /*
        String nombre_completo1 = JOptionPane.showInputDialog("Ingresa primer Nombre con Apellido");
       // System.out.println("Nombre completo :"+ nombre_completo1);

        String[] nombre_split1 = nombre_completo1.split(" ");

        char[] nom = nombre_split1[0].trim().toCharArray();
        char[] apell = nombre_split1[1].trim().toCharArray();

        int longitud_nombre1 = nom.length + apell.length;

      //  System.out.println("longitud_nombre1 :" +longitud_nombre1);

        String nombre_completo2 = JOptionPane.showInputDialog("Ingresa Segundo Nombre con Apellido");
       // System.out.println("Nombre completo :"+ nombre_completo2);

        String[] nombre_split2 = nombre_completo2.split(" ");

        char[] nom2 = nombre_split2[0].trim().toCharArray();
        char[] apell2 = nombre_split2[1].trim().toCharArray();

        int longitud_nombre2 = nom2.length + apell2.length;

       // System.out.println("longitud_nombre2 :" +longitud_nombre2);


        String nombre_completo3 = JOptionPane.showInputDialog("Ingresa Tercer Nombre con Apellido");
       // System.out.println("Nombre completo :"+ nombre_completo3);

        String[] nombre_split3 = nombre_completo3.split(" ");

        char[] nom3 = nombre_split3[0].trim().toCharArray();
        char[] apell3 = nombre_split3[1].trim().toCharArray();

        int longitud_nombre3 = nom3.length + apell3.length;

       // System.out.println("longitud_nombre3 :" +longitud_nombre3);

        String resultado = "";

        if(longitud_nombre1 > longitud_nombre2 && longitud_nombre1 > longitud_nombre3){
                resultado =nombre_completo1+" Tiene el nombre mas largo";
        } else if (longitud_nombre2 > longitud_nombre1 && longitud_nombre2 > longitud_nombre3) {
            resultado =nombre_completo2+" Tiene el nombre mas largo";
        } else if (longitud_nombre3 > longitud_nombre1 && longitud_nombre3 > longitud_nombre2) {
            resultado =nombre_completo3+" Tiene el nombre mas largo";
        }else {
            resultado = "Hay un empate en la longitud de los nombres.";
        }


        JOptionPane.showMessageDialog(null,resultado);

         */
    }
}
