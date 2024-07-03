package FlujoDeControl;

import java.util.HashMap;
import java.util.stream.IntStream;

public class SentenciasFor {
    public static void main(String[] args) {

        HashMap<String,String> usrs = new HashMap<>();
        usrs.put("Drogon","Pug");
        usrs.put("Loky","Pitbull");

        for (int i = 0; i < usrs.size(); i++) {
              System.out.println("--->" + usrs.keySet() +" -- "+usrs.values());
           // System.out.println("-->" + usrs.values());
        }
    }
}
