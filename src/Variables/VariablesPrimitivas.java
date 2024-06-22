package Variables;

public class VariablesPrimitivas {

    public static void main(String[] args) {
            /*
        TODO NOTA:
             En Java, los tipos primitivos son los tipos de datos más básicos que están predefinidos en el lenguaje.
             * Son los bloques de construcción fundamentales para almacenar valores simples y no son objetos.
             * Los tipos primitivos en Java tienen un tamaño fijo y se almacenan directamente en la memoria.
               -Hay 8 tipos de datos primitivos en Java, cada uno con sus propias características y rango de valores:
             1.-  byte
             Descripción: Entero de 8 bits con signo.
             Rango: -128 a 127.
             Uso: Para ahorrar espacio en grandes arreglos, principalmente en lugar de int.

             */

            byte b = -128;
            System.out.println("Valor byte :"+b);
            System.out.println("Tipo byte corresponde en byte a :" + Byte.BYTES);
            System.out.println("Tipo byte corresponde en bites a :" + Byte.SIZE);
            System.out.println("Valor maximo :" + Byte.MAX_VALUE);
            System.out.println("Valor minimo :" + Byte.MIN_VALUE);
            System.out.println("********************************");


        /*
        TODO:
            short
            Descripción: Entero de 16 bits con signo.
            Rango: -32768 a 32767.
            Uso: Similar a byte, para ahorrar espacio en grandes arreglos en lugar de int.

         */

        short s = 32767;
        System.out.println("Valor short :" + s);
        System.out.println("Tipo short corresponde en byte a :" + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a :" + Short.SIZE);
        System.out.println("Valor maximo :" + Short.MAX_VALUE);
        System.out.println("Valor minimo :" + Short.MIN_VALUE);
        System.out.println("********************************");

        /*
        TODO:
            int
            Descripción: Entero de 32 bits con signo.
            Rango: -2^31 a 2^31 - 1.
                    (-2147483648 a 2147483647)
            Uso: Valor entero por defecto.
         */

        int i = 2147483647;
        System.out.println("Valor int :"+ i);
        System.out.println("Tipo int corresponde en byte a :" + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a :" + Integer.SIZE);
        System.out.println("Valor maximo :" + Integer.MAX_VALUE);
        System.out.println("Valor minimo :" + Integer.MIN_VALUE);
        System.out.println("********************************");
        /*
        TODO:
            long
            Descripción: Entero de 64 bits con signo.
            Rango: -2^63 a 2^63 - 1.
            Uso: Cuando se necesita un rango más amplio que int.

         */
        long l = 23198138291L;
        System.out.println("Valor long :"+ l);
        System.out.println("Tipo long corresponde en byte a :" + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a :" + Long.SIZE);
        System.out.println("Valor maximo :" + Long.MAX_VALUE);
        System.out.println("Valor minimo :" + Long.MIN_VALUE);
        System.out.println("********************************");

        /*
        TODO:
            float
            Descripción: Número en punto flotante de 32 bits.
            Rango: Aproximadamente ±3.40282347E+38F (6-7 dígitos decimales de precisión).
            Uso: Para ahorrar memoria en grandes arreglos de números decimales.
         */

        float f = 10.5f;
        System.out.println("Valor float :"+ f);
        System.out.println("Tipo float corresponde en byte a :" + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a :" + Float.SIZE);
        System.out.println("Valor maximo :" + Float.MAX_VALUE);
        System.out.println("Valor minimo :" + Float.MIN_VALUE);
        System.out.println("********************************");

        /*
        TODO:
            double
            Descripción: Número en punto flotante de 64 bits.
            Rango: Aproximadamente ±1.79769313486231570E+308 (15 dígitos decimales de precisión).
            Uso: Valor por defecto para números decimales.

         */

        double d = 10.5;
        System.out.println("Valor double: "+ d);
        System.out.println("Tipo double corresponde en byte a :" + Double.BYTES);
        System.out.println("Tipo double corresponde en bites a :" + Double.SIZE);
        System.out.println("Valor maximo :" + Double.MAX_VALUE);
        System.out.println("Valor minimo :" + Double.MIN_VALUE);
        System.out.println("********************************");

        /*
        TODO:
            boolean
            Descripción: Valor lógico.
            Valores posibles: true o false.
            Uso: Para representar valores de verdad.

         */

        boolean flag = true;
        System.out.println("Valor boolean :"+ flag);


        /*
        TODO:char
            Descripción: Carácter Unicode de 16 bits.
            Rango: '\u0000' (o 0) a '\uffff' (o 65,535 inclusive).
            Uso: Para almacenar caracteres.
            *DEBE DE ESTAR DENTRO DE COMILLAS SIMPLES
         */

        char c = '2';
        System.out.println("Valor char: "+ c);
        System.out.println("Tipo char corresponde en byte a :" + Character.BYTES);
        System.out.println("Tipo char corresponde en bites a :" + Character.SIZE);
        System.out.println("Valor maximo :" + Character.MAX_VALUE);
        System.out.println("Valor minimo :" + Character.MIN_VALUE);
        System.out.println("********************************");
    }

    /*
    TODO: IMPORTANTE:
        Características de los Tipos Primitivos
        *Tamaño Fijo: Cada tipo primitivo tiene un tamaño fijo en memoria, lo que garantiza el mismo uso de memoria en todas las plataformas.
        *No Son Objetos: Los tipos primitivos no son objetos, por lo tanto, no tienen métodos ni propiedades.
        *Valores Predeterminados: En campos de clase no inicializados, cada tipo primitivo tiene un valor predeterminado (0 para numéricos, false para boolean, '\u0000' para char).
        *Alto Rendimiento: Dado que los tipos primitivos se manejan directamente en memoria, son más eficientes en términos de rendimiento y uso de recursos.
     */
}
