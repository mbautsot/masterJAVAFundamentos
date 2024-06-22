package Cadenas;

public class EjemploStringValidar {

    public static void main(String[] args) {

        String curso = null;

        boolean isNull = curso == null;
        System.out.println("-->" + isNull);

        //if(isNull == false){///Esto no es correcto
        if(isNull){
           // System.out.println(curso.toUpperCase());
            curso ="";//"Programcion Java";
        }

        /*TODO
            NO SE PUEDE CONCATENAR SI LA REFERENCIA ES NULL
            *En este caso curso ==null
         */
        //System.out.println(curso.concat(" Bienvenido a el curso desde cero!!"));///NullPointerException
        //System.out.println("Bienvenido a el curso desde cero!!"+ "Marcos");
        System.out.println(curso.concat(" Bienvenido a el curso desde cero!!"));

        boolean isVacio = curso.length()==0; ///De esta forma se puede validar si una cadena s vacia
        System.out.println("-->" +curso.length());
        if (!isVacio){
            System.out.println(curso);
            System.out.println("Bienvenido curso");
        }

        //TODO///Es identico a el ejemplo anterior length ==0 ya que el metodo isEmpty realiza la misma operacio
        boolean isVacio2 = curso.isEmpty();
        System.out.println("Empty-->" + isVacio2);

        /*TODO isBlank es mas estricto ya que valida lo siguiente :
            -Que sea distinto de empty, que sea distinto de spacios en blanco
            Regresa : TRUE
         */

        String curso1 = "";
        boolean isVacio3 = curso1.isBlank();

        if (isVacio3) { //TRUE
            System.out.println("Blak--> :" +  isVacio3);
        }

    }
}
