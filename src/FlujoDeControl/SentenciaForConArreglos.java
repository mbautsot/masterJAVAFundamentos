package FlujoDeControl;

public class SentenciaForConArreglos {
    public static void main(String[] args) {

        String[] nombres = {"Nicolas","Lilian","Marcos","Santiago","Loky","Drogon","Sofia"};

        for (int i = 0; i < nombres.length; i++) {
            if(nombres[i].equalsIgnoreCase("Marcos")||
            nombres[i].equalsIgnoreCase("Drogon")) {
                continue;
            }
            System.out.println(i+".-"+nombres[i]);
        }
    }
}
