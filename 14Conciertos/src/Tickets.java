import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Tickets {
    //Arreglo de la clase Ubicaciones
    private Ubicaciones[] ubicaciones;

    //Constructor
    public Tickets() {
        inicializarUbicaciones();
    }
    //Método para cargar datos al arreglo de la clase Ubicaciones
    private void inicializarUbicaciones(){
        ubicaciones = new Ubicaciones[4];
        ubicaciones[0]= new Ubicaciones("LPU PIT1 *", 2000, 781000);
        ubicaciones[1]= new Ubicaciones("LPU PIT2", 2000, 781000);
        ubicaciones[2]= new Ubicaciones("PLATEA 1", 12000, 600000);
        ubicaciones[3]= new Ubicaciones("PLATEA 2", 14000, 359000);
    }

    //Método de arranque de la App
    public void MenuApp(){
        boolean ejecuccion = true;

        while(ejecuccion){
            int opcion = MostrarMenuPrincipal();

            switch(opcion){
                case 0: //Calcular Valor Boletas
                    //calcularTickets();
                break;
                case 1: //Ver Ubicaciones
                    verUbicaciones();
                    break;
                case 2://salir
                    ejecuccion= false;
                    break;
                case JOptionPane.CLOSED_OPTION:
                    ejecuccion=false;
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "!Gracias por utilizar el sistema de Boletas¡"
                ,"Concierto Linkin Park", JOptionPane.INFORMATION_MESSAGE);
    }
    //Opciones Menú Principal
    private int MostrarMenuPrincipal(){
        String [] opciones = {"Calcular Boletas", "Ver Ubicaciones", "Salir"};

        return JOptionPane.showOptionDialog(null, "Sistema de Boletas Concierto Linkin Park",
                "Menu Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

    }
    //Método ver Ubicaciones
    private void verUbicaciones(){
        StringBuilder infoUbicaciones = new StringBuilder("Ubicaciones Disponibles\n\n");
        //Impresión de datos del Arreglo
        for(Ubicaciones ubicacion : ubicaciones){
            NumberFormat formateador = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
            infoUbicaciones.append("- Aforo:")
                           .append(ubicacion.getCapacidad())
                           .append("- Precio:")
                           .append(formateador.format(ubicacion.getPrecio()))
                           .append("\n");
        }
        JOptionPane.showMessageDialog(null, infoUbicaciones.toString(), "" +
                "Ubicaciones Disponibles", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        Tickets sistema = new Tickets();
        sistema.MenuApp();
    }

}
