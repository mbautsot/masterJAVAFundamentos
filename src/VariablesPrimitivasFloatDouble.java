public class VariablesPrimitivasFloatDouble {

    public static void main(String[] args) {
        /*TODO:
            Debemos de agregar la letra f para indicar que es (float)
            si no se agrega pasa a ser   double
         */

        float num1 = 1.0f;
        System.out.println("valor float :" + num1);

        /*TODO
            Agregar caracter (e) exponente
            se va  recorrer el punto las posiciones las cuales sea el exponente.
            -Si es POSITIVO se recorre derecha
            -Si es NEGATIVO se recorre izquierda

        */
        float num2 = 3.4e3f; /// ejemplo: 3400.0
        System.out.println("valor float exponente:" + num2);

        //float num3 = 3.4e-3f; /// 0.0034
        float num3 =0.0000000034f; //se compacta a anotacion : 3.4E-9

        //System.out.println("valor float exponente negativo:" + num3);
        System.out.println("float corresponde a un byte : "+ Float.BYTES);
        System.out.println("float corresponde a bites : "+ Float.SIZE);
        System.out.println("maximo valor float : "+ Float.MAX_VALUE);
        System.out.println("minimo valor float : "+ Float.MIN_VALUE);
        System.out.println("maximo  float exponent : "+ Float.MAX_EXPONENT);
        System.out.println("maximo  float exponent : "+ Float.MIN_EXPONENT);

        System.out.println("---------------------------------------------");

        /*
            TODO:
             Para double se podria agregar (d) a el final de el numro pero NO ES NECESARIO
             Ya que desde que se agrega el (.) lo toma como un double
        */

        double doublenum= 3.4508;
        System.out.println("valor double :" + doublenum);

        System.out.println("double corresponde a un byte : "+ Double.BYTES);
        System.out.println("double corresponde a bites : "+ Double.SIZE);
        System.out.println("maximo valor double : "+ Double.MAX_VALUE);
        System.out.println("minimo valor double : "+ Double.MIN_VALUE);
        System.out.println("maximo  double exponent : "+ Double.MAX_EXPONENT);
        System.out.println("maximo  double exponent : "+ Double.MIN_EXPONENT);


        System.out.println("------------------------------------------------");


    }
}
