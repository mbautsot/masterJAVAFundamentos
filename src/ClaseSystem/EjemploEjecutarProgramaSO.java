package ClaseSystem;

import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) throws InterruptedException, IOException {

        Runtime rt = Runtime.getRuntime();

        Process proceso;

        System.out.println(System.getProperty("os.name"));

        try {
            if(System.getProperty("os.name").startsWith("Mac OS X")){
                proceso = rt.exec("open /System/Applications/TextEdit.app");
            }else{
                System.out.println("Este ejemplo solo es compatible con macOS.");
                return;
            }
            proceso.waitFor();
        }catch (RuntimeException e){
            System.err.println("Comando invelido "+ e.getMessage());
        }
        System.out.println("SE ha cerrado aplicacion");

    }
}
