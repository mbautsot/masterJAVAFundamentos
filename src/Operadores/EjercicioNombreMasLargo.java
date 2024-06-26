package Operadores;

import javax.swing.*;

public class EjercicioNombreMasLargo {
    public static void main(String[] args) {


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
    }
}
