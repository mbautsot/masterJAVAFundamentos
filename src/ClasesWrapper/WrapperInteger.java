package ClasesWrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        /*TODO
            Uso en las clases Wrapper
            Las clases envoltorio (Wrapper classes) en Java son clases que encapsulan tipos primitivos
            dentro de un objeto. Estas clases son útiles cuando se necesita trabajar con tipos primitivos
            como objetos, por ejemplo, al trabajar con colecciones que solo pueden contener objetos (no tipos primitivos).
            Las principales clases envoltorio en Java son:
                Integer para int
            */

        Integer intObjeto = 1234;

        System.out.println("equals "+ intObjeto.equals(1234));
        System.out.println("comparTo "+intObjeto.compareTo(3456)); //-1 false

    }
}
