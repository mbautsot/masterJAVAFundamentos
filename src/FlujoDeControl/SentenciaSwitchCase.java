package FlujoDeControl;

public class SentenciaSwitchCase {

    public static void main(String[] args) {

        int num =3;

        /*TODO solo soporta char, byte, short,int y sus wraper
            String, or an enum'
        */

        switch (num){
            case 0:
                System.out.println("El num es cero");
                break;
            case 1:
                System.out.println("El num es uno");
                break;

            case 2:
                System.out.println("El num es dos");
                break;

            case 3:
                System.out.println("El num es tres");
                break;

            case 4:
                System.out.println("El num es cuatro");
                break;
        }

        String nombre="Marcos";

        switch (nombre){
            case "Mauricio":
                System.out.println("Hola Mauricio");
                break;
            case "Marcos":
                System.out.println("Hola Marcos");
                break;
            case "Eduardo":
                System.out.println("Hola Eduardo");
                break;
            default:
                System.out.println("Usuario desconocido");
        }
    }
}
