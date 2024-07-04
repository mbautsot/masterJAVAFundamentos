package ClasesWrapper;

import Variables.Boleans;

public class WrapperBolean {
    public static void main(String[] args) {

        Boolean b1=false;
        boolean b2=true;

        boolean b3 =true;
        Boolean b4=false;

        //Si lo validamos
        System.out.println("validacion --->" + (b1 == b2)); //false //NO VALIDA EL VALOR SI NO L OBJETO
        System.out.println("validacion 2 -->" + b1.equals(b2));// false
        System.out.println("validacion 3-->" +  Boolean.compare(b1,b2)); //-1
        System.out.println("primitivos val 4 " + (b2 == b3));
        System.out.println("Wrapper val 5 -->"+ b1.equals(b4));///Valor de los Wrapper

    }
}
