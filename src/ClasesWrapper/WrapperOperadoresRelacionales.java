package ClasesWrapper;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(128);
        Integer num2 = num1;

        System.out.println("num1 :" + num1);
        System.out.println("num2 :" + num2);

        System.out.println("Son el mismo objeto : "+(num1 == num2));
        System.out.println("---------------------------------------");
        num2= 128;
        System.out.println("num1 :" + num1);
        System.out.println("num2 :" + num2);

        System.out.println("Son el mismo objeto : "+(num1 == num2));

        System.out.println("Tienen el mismo valor ?: "+num1.equals(num2));
        System.out.println("Tienen el mismo valor ?: "+(num1.intValue() == num2.intValue()));
        System.out.println("-------------------PECULIARIDAD EN JAVA ---------------------");


        //TODO SI ES 127 VALIDA POR LE VALOR



        Integer num3 = Integer.valueOf(127);
        Integer num4 = num1;

        System.out.println("num3:" + num3);
        System.out.println("num4 :" + num4);

        System.out.println("Son el mismo objeto : "+(num3 == num4));
        System.out.println("---------------------------------------");
        num4= 127;
        System.out.println("num3 :" + num3);
        System.out.println("num4 :" + num4);

        System.out.println("Son el mismo objeto : "+(num3 == num4)); ////TODO ACA YA VALIDA POR EL VALOR Y NO POR EL OBJETO

        System.out.println("Tienen el mismo valor ?: "+num3.equals(num4));
        System.out.println("Tienen el mismo valor ?: "+(num3.intValue() == num3.intValue()));
    }


}
