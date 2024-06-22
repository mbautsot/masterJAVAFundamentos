package Cadenas;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a="a";
        String b="b";
        String c="c";

        /*
            TODO NO PERMITE CREAR UN STRING
             *ANEXAR ELEMENTOS CON SU METODO APPEND
             *CON EL METODO TO STRING GENRARMOS EL STRING COMPLETO.
             *ES MUTABLE
         */

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i =0; i < 5000; i++){
            //c = c.concat(b).concat(a).concat("\n"); //Inicio :1718941125713 -> FIn :1718941125848
            // c+=b+a+"\n";  //Inicio :1718941059458 -> FIn :1718941059549

            /*
            sb.append(a); //Inicio :1718941008055 -> FIn :1718941008056
            sb.append(b);
            sb.append(c);
            sb.append("\n");
             */
        }

        long fin = System.currentTimeMillis();
        System.out.println("Inicio :"+inicio+" -> FIn :" + fin);
        System.out.println("c ="+ c);


    }
}
