package Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "Marcos";
        String pasword = "12345";

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa usuario :");
        String usr = scan.nextLine();
        System.out.println("Ingresa password");
        String pass = scan.nextLine();

        boolean isAutenticado = false;

        if(username.equals(usr) && pasword.equals(pass)){
            isAutenticado = true;
        }else {
            System.out.println("Usuario y contraseña incorrectos");
        }

        if(isAutenticado){
            System.out.println("Bienvenido usuario :"+ username );
        }else {
            System.out.println("Lo siento te debes de autenticar.");
        }
    }
}
