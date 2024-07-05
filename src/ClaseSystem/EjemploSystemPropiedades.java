package ClaseSystem;

import java.io.FileInputStream;
import java.util.Properties;

public class EjemploSystemPropiedades {
    public static void main(String[] args) {

        try {
           // FileInputStream file = new FileInputStream("src/ClaseSystem/config.properties/");
            FileInputStream file = new FileInputStream("/ClaseSystem/config.properties/");

            Properties p = new Properties(System.getProperties());///TODO Cargamos todas las propiedades del sistema
            p.load(file);

            //TODO Vamos a agregar una nueva propiedad a nuentro properties
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");


            System.setProperties(p);//TODO Aca guardamos la nueva propiedad
            System.out.println("-----------------------------------------------------------------------");
            System.getProperties().list(System.out);///TODO lista todas las cnfiguraciones del sistema
            System.out.println("-----------------------------------------------------------------------");


            System.out.println("Obtener las propiedades guardadas");

            Properties ps = System.getProperties();
            System.out.println("propiedad personalizada  :" + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println("puerto servidor  :" + ps.getProperty("config.puerto.servidor"));


        }catch (Exception e){
            System.err.println("No existe archivo " + e); ///Se ve en otro color rojo
            System.exit(1);///Cuando se interrumpe el programaa
        }
    }
}
