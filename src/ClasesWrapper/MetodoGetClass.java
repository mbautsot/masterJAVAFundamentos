package ClasesWrapper;

import java.lang.reflect.Method;

public class MetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola que tal!";

        Class strClass = texto.getClass();

        System.out.println("strClass.getSuperclass() = " + strClass.getSuperclass());

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass.getPackageName() = " + strClass);


        for (Method metodo: strClass.getMethods()) {
            System.out.println("metodo getName() " +metodo.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass = " +intClass);

        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());

        for (Method metodo: intClass.getMethods()) {
            System.out.println("metodo  Integer getName() " +metodo.getName());
        }
    }
}
