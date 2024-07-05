package ClaseSystem;

import java.util.Map;

public class EjemploVariablesEntorno {
    public static void main(String[] args) {
        Map<String, String> variablesEntorno = System.getenv();

        for (Map.Entry<String, String> entry : variablesEntorno.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
