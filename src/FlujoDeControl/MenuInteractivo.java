package FlujoDeControl;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MenuInteractivo {
    public static void main(String[] args) {


        int opcionIndice = 0;
        boolean continuar = true; //ESTA VARIABLE NOS PRERMITIRA CONTINUAR CON EL MENU HASTA QUE SE SELECCIONE 5 (SALIR)
        //Creamos nuestro Map l cal va contener las opciones
        Map<String,Integer> opciones = new HashMap();
        opciones.put("Actualizar",1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        while (continuar) {
            Object[] opArreglo = opciones.keySet().toArray();

            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());
                System.out.println("--->" + opcionIndice);


                switch (opcionIndice){

                    case 1:
                        JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null, "Usuario elimino correctamente");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Usuario agrego correctamente");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Usuario listo correctamente");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Haz salido con exito!");
                        continuar = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción inválida");
                        break;
                }


            }
        }///TODO WHILE
    }
}
