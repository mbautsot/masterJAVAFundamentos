public class EjemploStringExtensionArchivo {

    public static void main(String[] args) {

        String archivo = "hondaCb750.jpg";

        //TODO obtener la extension del archivo con distintos metodos.

        ///lastIndexOf , retorna indice donde encontro la ultima ocurrencia en este caso el es punto
        int index = archivo.lastIndexOf(".");
        System.out.println("index :"+ index); //10
        //substring
        System.out.println("substring :" + archivo.substring(index+1)); /// (11) jpg
    }
}
