package Operadores;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class OperadoresLogicosLoginArray {
    public static void main(String[] args) {

        HashMap<String, String> usrPass = new HashMap<>();
        usrPass.put("Marcos","1234");
        usrPass.put("Santiago","3456");

        ///Solicitamos el user y pass
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa Usuario :");
        String usr = scan.nextLine();
        System.out.println("Ingresa Password :");
        String pass = scan.nextLine();

        /*TODO
            AtomicBoolean es una clase en Java que proporciona una variable booleana que puede ser leída y escrita de manera atómica.
            La inicialización false establece que inicialmente no se ha autenticado al usuario.
         */

        /*TODO utilizando un lambda


        AtomicBoolean isAutenticado = new AtomicBoolean(false);

        usrPass.forEach((user , password) ->{
           if(user.equals(usr) && password.equals(pass)){
                isAutenticado.set(true);
           }
        });

        System.out.println("isAutenticado :"+ isAutenticado);

    if(isAutenticado.get()){
        System.out.println("Bienvenido usuario :"+ usr );
    }else {
        System.out.println("Lo siento te debes de autenticar.");
    }
    */
    ///Otra forma de recorrer un HashMap
    boolean isAutenticado = false;
        for(Map.Entry<String,String> entry : usrPass.entrySet()){
           // System.out.println("Usuario :"+ entry.getKey());
           // System.out.println("Password :"+ entry.getValue());

            if(entry.getKey().equals(usr) && entry.getValue().equals(pass)){
                isAutenticado = true;
                break;
            }
        }

        if(isAutenticado){
            System.out.println("Bienvenido usuario :"+ usr );

        }else {
            System.out.println("Error usuario no autenticado.");
        }


    }
}
