package Cadenas;

import javax.swing.*;

public class EntradaDatosDialogo {
    public static void main(String[] args) {
        int numDecimal = 0;
        String numeroStr = JOptionPane.showInputDialog("Ingresa numero para realizar conversion:");

        try{
            numDecimal = Integer.parseInt(numeroStr);

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Ingresa un numero valido");
            main(args);
            System.exit(0);
        }

        //System.out.println("numero decimal corresponde a :"+ numDecimal);
        String msgDecimalToBnario ="numro decimal "+ numDecimal+" a binario es :" + Integer.toBinaryString(numDecimal);
        ////TODO para indicar que un numero es binario se debe de anteponer el valor (0b) para indicar que es binario
       // int numBinario = 0b111110100;
        //TODO el compilador va a tomarlo como el numero 500
        //System.out.println("numero binario en decimal:" +numBinario);

        //System.out.println("numero decimal "+numDecimal+" a octal es :"+ Integer.toOctalString(numDecimal));
        String msgDecimalToOctal ="numero decimal "+numDecimal+" a octal es :"+ Integer.toOctalString(numDecimal);
        //TODO si se agrega un 0 antes de el numero :0764 automaticamente el compilar detecta que es octal
       // int numOctal = 0764;
       // System.out.println("numero decimal a octal :"+numOctal);

      //  System.out.println("numero decimal :"+numDecimal+" a hexadecimal :"+ Integer.toHexString(numDecimal));
        String msgDecimalToHexadecimal ="numero decimal :"+numDecimal+" a hexadecimal :"+ Integer.toHexString(numDecimal);
        //TODO se antepone el valor (0x) antes de de la cantidad para que el compilador interprete que es hexadecimal
        // int numExadecimal=0x1f4;
        //System.out.println("numero decimal a hexadecimal :" +numExadecimal);

        ////mostramos el mensaje
        String mensaje = "numero decimal "+ msgDecimalToBnario;
        mensaje += "\n"+msgDecimalToOctal;
        mensaje += "\n"+msgDecimalToHexadecimal;

        JOptionPane.showMessageDialog(null,mensaje);
    }
}
