package ClasesWrapper;

public class AutoboxingInteger {
    public static void main(String[] args) {

        /*
            TODO
                Autoboxing :El autoboxing es el proceso automático mediante el cual Java convierte un tipo primitivo en su correspondiente clase envoltorio (Wrapper class).
                Esto ocurre de manera automática cuando se asigna un valor de tipo primitivo a una variable de tipo Wrapper class, o cuando se pasa un tipo primitivo como argumento a un método que espera un argumento de tipo Wrapper class.
         */

        Integer[] enteros = {Integer.valueOf(1),2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int suma = 0;

        //AUTOBOXING
        for (Integer i: enteros) {
            if(i.intValue()%2==0){
                suma+=i.intValue();
            }
        }
        System.out.println("Suma :" + suma);

        ///UNBOXING
        suma = 0;
        for (Integer i: enteros) {
            if(i%2==0){
                suma+=i;
            }
        }
        System.out.println("Suma UNBOXING :" + suma);

    }
}
