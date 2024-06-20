public class Boleans {
    public static void main(String[] args) {
        boolean isBolean=true;
        System.out.println("-->" +isBolean);

        boolean isBolean2=Boolean.FALSE.booleanValue();
        System.out.println("--->"+isBolean2);

        System.out.println("------------------------");

        int numDecimal =500;
        System.out.println("numero decimal corresponde a :"+ numDecimal);
        System.out.println("numro decimal "+ numDecimal+" a binario es :" + Integer.toBinaryString(numDecimal));
        ////TODO para indicar que un numero es binario se debe de anteponer el valor (0b) para indicar que es binario
        int numBinario = 0b111110100;
        //TODO el compilador va a tomarlo como el numero 500
        System.out.println("numero binario en decimal:" +numBinario);

        System.out.println("numero decimal "+numDecimal+" a octal es :"+ Integer.toOctalString(numDecimal));

        //TODO si se agrega un 0 antes de el numero :0764 automaticamente el compilar detecta que es octal
        int numOctal = 0764;
        System.out.println("numero decimal a octal :"+numOctal);

        System.out.println("numero decimal :"+numDecimal+" a hexadecimal :"+ Integer.toHexString(numDecimal));
        //TODO se antepone el valor (0x) antes de de la cantidad para que el compilador interprete que es hexadecimal
        int numExadecimal=0x1f4;
        System.out.println("numero decimal a hexadecimal :" +numExadecimal);
    }
}
