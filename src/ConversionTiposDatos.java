public class ConversionTiposDatos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numero = Integer.parseInt(numeroStr);
        System.out.println("numero : "+ numero);

        String numeroStr2 = "23546e-3";
        double numro2 = Double.parseDouble(numeroStr2);
        System.out.println("numero2 : "+numro2);

        String boleanStr = "T";
        boolean bolean1 = Boolean.parseBoolean(boleanStr);
        System.out.println("bolean :" + bolean1);

        System.out.println("-------------------------");

        var varNumero ="45";
        int numeroVar = Integer.parseInt(varNumero);
        System.out.println("-> "+ numeroVar);


        var varBoolean ="True";
        boolean booleanVar = Boolean.parseBoolean(varBoolean);
        System.out.println("-> "+ booleanVar);


        System.out.println("String conversiones ***************************");

        int otroNumero = 1000;
        String otroNumeroStr = String.valueOf(otroNumero);
        String otroNumeroStr2 = Integer.toString(otroNumero);
        System.out.println("otroNumeroStr :"+ otroNumeroStr +" , " + otroNumeroStr2);

        System.out.println("******************** ***************************");

        int num = 32768;
        //TODO forzar la conversion para ello se utliza el CAST esto es agregar entre parentesis el tipo de conversion (short)
        //TODO NOTA: short es mas pequeño que un int por lo tanto puede haber perdida de datos, queda  a criterio pro no es conveniente
        // Va a perder datos como a continuacion se presenta.
        short numshort= (short)num; ///-32768
        System.out.println("maximo soportado :" + Short.MAX_VALUE); ///32767
        System.out.println("short cast :" +numshort);



    }
}
