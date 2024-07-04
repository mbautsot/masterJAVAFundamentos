package ClasesWrapper;

class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarPorReferenciaNombres {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Marcos");

        System.out.println("persona :" + persona.leerNombre());
        System.out.println("Antes de llamar test");
        test(persona);
        System.out.println("persona modificada:" + persona.leerNombre());
        System.out.println("Finaliza persona se modifica");

    }

    public static void test(Persona persona){
        System.out.println("iniciamos método test");
        persona.modificarNombre("Santiago");
        System.out.println("Finaliza método test");

    }
}
