package Operadores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OperadoresLogicosLoginTernario {
    public static void main(String[] args) {

        ArrayList<String> usuarios = new ArrayList<>();
        usuarios.add("Marcos");
        usuarios.add("Santiago");

        ArrayList<String> password = new ArrayList<>();
        password.add("1234");
        password.add("XMSD");

        ///Solicitamos el user y pass
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa Usuario :");
        String usr = scan.nextLine();
        System.out.println("Ingresa Password :");
        String pass = scan.nextLine();

        boolean isAutenticado = false;
        System.out.println("usuarios :"+usuarios.size());
        for (int i = 0; i <= usuarios.size(); i++) {
            isAutenticado = (usuarios.get(i).equals(usr) && password.get(i).equals(pass))?true:false;
            break;
        }

        if(isAutenticado){
            System.out.println("Bienvenido usuario :"+ usr );

        }else {
            System.out.println("Error usuario no autenticado.");
        }
    }
}
