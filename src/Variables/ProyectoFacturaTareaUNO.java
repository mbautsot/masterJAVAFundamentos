package Variables;

import java.util.Scanner;

public class ProyectoFacturaTareaUNO {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa nombre Factura :");
        String nombreFact =scan.nextLine();
        System.out.println("Ingresa descripción Factura:");
        String descripcion = scan.nextLine();

        ///Productos
        System.out.println("Precio primer producto :");
        double precioP1 = scan.nextDouble();
        System.out.println("Precio segundo producto :");
        double precioP2 = scan.nextDouble();

        double impuesto = ((precioP1+precioP2) * 19) /100;
        double total = precioP1 + precioP2 + impuesto;

        System.out.println("La factura producto de oficina tiene un total bruto de "+ (precioP1+precioP2)+", con un impuesto de \n"+ impuesto + " y el monto después de impuesto es de "+ total);
    }
}
