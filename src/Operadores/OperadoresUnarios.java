package Operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int i = -5;

        int j=+i;//(1)*i => -5
        System.out.println("valor j:"+j);

        int k=-i;
        System.out.println("valor k:"+k);//k =(-1)*1 => 5

        i=6;
        j=+i;
        System.out.println("j :"+ j);

        k=-i;
        System.out.println("k :"+k);
    }
}
