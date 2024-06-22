package Variables;

public class Characters {
    public static void main(String[] args) {
        //TODO se agrega la u para indicar que es unicode
        char caracter = '\u0040';
        char decimal = 64;
        char simbolo = '@';

        System.out.println("valor caracter: "+ caracter); //arroba
        System.out.println("valor decimal: "+ decimal); //arroba
        System.out.println("valor simbolo: "+ simbolo);

        System.out.println("validaciones 1:"+ (caracter == decimal));
        System.out.println("validaciones 2:"+ (simbolo == decimal));


        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador ='\t';
        char saltoLinea ='\n';
        char retorno = '\r';

        System.out.println("-----------------------------------------------");
        System.out.println("Esp"+ espacio+"cio");
        System.out.println("Retroceso"+retroceso);
        System.out.println("tabulador"+tabulador+"---");
        System.out.println("salto linea"+saltoLinea+"***");
        System.out.println("esto se elimina"+retorno);
        System.out.println("-----------------------------------------------");
        System.out.println("char corresponde a un byte : "+ Character.BYTES);
        System.out.println("char corresponde a bites : "+ Character.SIZE);
        System.out.println("maximo valor char : "+ Character.MAX_VALUE);
        System.out.println("minimo valor char : "+ Character.MIN_VALUE);



    }
}
