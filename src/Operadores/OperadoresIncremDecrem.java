package Operadores;

public class OperadoresIncremDecrem {
    public static void main(String[] args) {

        /*TODO PREINCREMENTO
            ++a Incrementa a en uno, y luego devuelve a
        */
        int i = 1;
        System.out.println("antes i: "+i);
        int j = ++i;
       // System.out.println("i: "+i); //TODO => 1+1 = 2.
        System.out.println("j: "+j); //TODO (i =2) , despues se asigna a j.

        /*TODO POSTINCREMENTO
            a++ Devuelve a, y luego incrementa a en uno.
          */

        i = 2;
        j = i++; //TODO => 2+1 = 3
        System.out.println("post i :" + i); ///3
        System.out.println("post j :" + j); /// 2 Promero se asigna y despues se incrementa.
        System.out.println("post j:"+ j);

        /*TODO PRE-DECREMENTO
            a-- Decremento a en uno, luego devuelve a
        * */
        i = 3;
        j = --i; //3-2
        System.out.println("pre-decremento j :" + j); // 2

        /*TODO POST-DECREMENTO
            --a Devuelve a, luego decrementa a en uno
        * */

        i = 4;
        j = i--;
        System.out.println("post-decremento :"+ j);


        System.out.println("j :"+ ++j);
        System.out.println("j :"+ j++);
        System.out.println("valor real:"+ j);

    }
}
