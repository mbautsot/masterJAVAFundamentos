package Cadenas;

import java.util.ArrayList;
import java.util.Arrays;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String str = "trabalenguas";
        System.out.println("str -->" + str);
        //TODO length()  e un metodo en (String)
        System.out.println("length str :" +  str.length());///metodo);

        char[] arreglo = str.toCharArray();
        ///TODO length es un atributo en (char[])
       int length = arreglo.length;//atributo

        for (int i = 0; i < length; i++) {
            System.out.println("arreglo :"+ arreglo[i]);
        }

        System.out.println("*************************************************************");


        //TODO metodo SPLIT regresa un arreglo ,
        // la letra (a) es el separador y es de tipo String[]
        // ya que pude contener mas de un caracter

        String[] arraystr = str.split("a");
        int length2 = arraystr.length;

        for (int x = 0; x < length2; x++) {
            System.out.println("arreglo 2 :"+arraystr[x]);
        }

        System.out.println("*********************************");

        String nombreArchivo = "foto.jpg";

        //TODO si se indica el (.) solo para realizar el split
        // NO ES CORRECTO HACERLO DE ESTA FORMA en expresiones regulares es incorrecto hacerlo de esta forma
        //String[] extensionArchivo = nombreArchivo.split(".");

        //TODO  Esta es la forma correcta "\\." para indicar que se realizara la separacion desde el (.)
        // se puede tambien [.] para hacerlo de forma implicita indicando que seria este caracter, puede tener un conjunto de caracteres
        //TODO recibe una exprecion regular.
        String[] extensionArchivo = nombreArchivo.split("\\.");

        int lengthExt = extensionArchivo.length;

        for (int j = 0; j < lengthExt; j++) {
            System.out.println("ext :"+ extensionArchivo[j]);
        }

        System.out.println("obtenemos la extencion: " + (extensionArchivo[lengthExt-1]));


    }
}
