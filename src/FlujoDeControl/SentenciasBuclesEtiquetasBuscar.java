package FlujoDeControl;

public class SentenciasBuclesEtiquetasBuscar {
    public static void main(String[] args) {

        /*
            TODO
              Esta clase Java llamada SentenciasBuclesEtiquetasBuscar
              realiza la búsqueda de cuántas veces aparece una palabra específica ("trigo") dentro de una frase ("tres tristes tigres tragan trigo en un trigal").
              Vamos a analizarla paso a paso:
         */

        String frase ="tres tristes tigres tragan trigo en un trigal";
        String palabra ="trigo";

        int maxfrase = frase.length(); ///longitud de frase
        int maxpalabra =palabra.length(); //longitud de palabra

        int cantidad =0;
        char letra = 'g';

        buscar://Esta es la etiqueta del primer for
        for (int i = 0; i < maxfrase; i++) { //iteramos frase
            int k = i; //En esta variable guardamos el valor de  i
            for (int j = 0; j < maxpalabra; j++) {//iteramos palabra
                /*TODO reaalizamos la validacion correspondiente
                    * Recorremos cada caracter de la frase con el indice nuevo de (k)
                    * != Que sea diferente a la frase en este caso : "trigo"
                    * continue buscar (indica que encotrandose la frase) va a continuar la iteracion del for que tine la etiqueta.
                * */
                if(frase.charAt(k++) != palabra.charAt(j)){
                    continue buscar;
                }
            }
            cantidad ++;
        }

        System.out.println("Encontrado = :"+ cantidad +" veces el caracter '"+letra+"' en la frase");

        //El resultado ---> Encontrado = :1 veces el caracter 'g' en la frase

        /*
         Búsqueda de la palabra:

            El bucle exterior (for (int i = 0; i < maxfrase; i++)) itera a través de cada caracter en la cadena frase.
            Dentro de este bucle, int k = i; guarda la posición actual de i.
            El bucle interno (for (int j = 0; j < maxpalabra; j++)) itera a través de cada caracter en la cadena palabra.
            frase.charAt(k++) != palabra.charAt(j) compara cada caracter de frase con cada caracter de palabra comenzando desde la posición k.
            Si los caracteres no coinciden, continue buscar; salta directamente al siguiente ciclo del bucle for etiquetado buscar.

        */
    }
}
