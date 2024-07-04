package ClasesWrapper;

public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = {10,11,12};
        System.out.println("iniciamos el método main ");
        for (int i=0; i<edad.length;i++){

            System.out.println("Edad[i] :" +edad[i]);
        }
        System.out.println("Despues de llamar test");
        test(edad);
        System.out.println("Despues de llamar test");

        for (int i=0; i<edad.length;i++){
            System.out.println("Edad modificado ? [i] :" +edad[i]);
        }
        System.out.println("Finaliza metodo main ");


    }

    public static void test(int[] edadArr){
        System.out.println("iniciamos método test");

        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i]=edadArr[i]+20;
        }
        System.out.println("Finaliza método test");



    }
}
