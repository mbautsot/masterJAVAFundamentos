package FlujoDeControl;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1:
        //TODO Etiqueta para identificar el for , debe de ir a un lado o arriba de for
        for (int i = 0; i < 5; i++) {
            bucle2:
            for (int j = 0; j < 5; j++) {
                System.out.println();
                if (i == 2) { //TODO SE descartara est indice , pero se continuara con la iteracion
                    continue bucle1; //Se continua con la iteracion
                }
                System.out.print("indice : [ i = " + i + ", j = "+ j +"]");
            }

        }

    }
}
