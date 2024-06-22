public class EjemploStringMetodos {
    public static void main(String[] args) {

        String cadena = "Marcos";

        System.out.println("length :"+ cadena.length());
        System.out.println("uppercase :"+ cadena.toUpperCase());
        System.out.println("minusculas :"+ cadena.toLowerCase());
        System.out.println("equals :"+ cadena.equals("Marcos"));
        System.out.println("equalsIgnoreCase :"+ cadena.equalsIgnoreCase("Mar"));
        System.out.println("equalsIgnoreCase :"+ cadena.equalsIgnoreCase("Mar"));
        System.out.println("equalsIgnoreCase :"+ cadena.compareTo("Martin"));
        System.out.println("equalsIgnoreCase :"+ cadena.compareTo("Marcos"));
        System.out.println("chatAt "+ cadena.charAt(0));
        System.out.println("ultimo caracter -> chatAt "+ cadena.charAt(cadena.length()-1));

        System.out.println("substring : "+ cadena.substring(2));
        System.out.println("substring 2 : "+ cadena.substring(0 ,3));
        System.out.println("substring 2 : "+ cadena.substring(0,cadena.length()-1));

        String cadena2 ="paraxapa";
        System.out.println("replace :" + cadena2.replace("ra","--"));

        System.out.println("indexof (primera ocurrencia) :" + cadena2.indexOf('r'));//recibe cadena o caracter

        /*TODO  el resultado es -1 (SI ES NEGATIVO ES POR QUE NO ENCUENTRA ESTE CARACTER O CADENA)
           en este ejemplo esto es por que no encuentra XE tanto minuscula o MAYUSCULA
            Puede recibir string o char
        * */

        System.out.println("indexof (primera ocurrencia) :" + cadena2.indexOf("xe"));//recibe cadena o caracter

        //TODO el resultado es 4 ya que en esta posicion encuentra la (x) tanto minuscula o MAYUSCULA
        System.out.println("indexof (primera ocurrencia) :" + cadena2.indexOf("x"));//recibe cadena o caracter


        //TODO Buscara la ultima ocurrencia de el caracter (r)
        System.out.println("lastIndexOf (primera ocurrencia) :" + cadena2.lastIndexOf('r'));//recibe cadena o caracter


        //TODO regresa un true si contiene este caracter o cadena
        System.out.println("contains :" + cadena2.contains("XA"));

        //TODO si comienza con
        System.out.println("contains :" + cadena2.startsWith("pa"));

        //TODO finaliza con
        System.out.println("contains :" + cadena2.startsWith("pa"));

        //TODO quitar espacios en ambos lados tanto derecha he izquierda.
        System.out.println("trim "+ "  -ELimina spacios-    ".trim());


    }
}
