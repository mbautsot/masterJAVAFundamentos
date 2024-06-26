package Operadores;

public class PrecedenciaOpradores {
    public static void main(String[] args) {

        int a=7;
        int b=8;
        int c=9;

        double prom = (a+b+c)/3d;
        System.out.println("Promedio :"+prom);

        prom =(a+b+c) /3d * 10;

        prom=--a + b++ + c /3d * 10;
        System.out.println("prom : "+ prom);
    }
}
