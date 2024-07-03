package FlujoDeControl;

public class SentenciaDoWhile {
    public static void main(String[] args) {
        int i=0;
        //TODO WHILE primero PRE -prueba PRIMERO EVALUDA Y DESPUES EJECUTA
        while (i<=5){
            System.out.println("i -->" + i);
            i++;
        }

        //TODO DO-WHILE es POST - prueba , primero ejecuta al menos una sola vez y despues valida
        boolean prueba = true;
        int j=0;
        do { //TODO HACER ALGO
            if(j ==10){
                prueba = false; //TODO se cambia a false para que en el while salga.
            }
            System.out.println("Se ejecuta hasta que se cumpla condicion :" + j);
            j++;
        }while (prueba); //TODO HASTA QUE LA CONDICION SEA TRUE;

        }

}
