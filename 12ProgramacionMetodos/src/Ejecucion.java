import javax.swing.*;

public class Ejecucion {
    public static void main(String[] args) {
        Operaciones obj = new Operaciones("", "", 0, 0, 0, false);
        int opcion=0;

        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "" +
                    "1. Cargar los datos del usuario\n" +
                    "2. Realizar calculos con información del usuario\n" +
                    "3. Salir......\n"));

            switch(opcion){
                case 1:
                    obj.setNomapellidos(JOptionPane.showInputDialog(null, "" +
                            "Digite los nombres y apellidos"));
                    obj.setIdent(JOptionPane.showInputDialog(null, "" +
                            "Digite la cédula del usuario"));
                    obj.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "" +
                            "Digite la edad del usuario")));
                    obj.setAlcohol(Boolean.parseBoolean(JOptionPane.showInputDialog(null, "" +
                            "Digite true si consume alcohol y false si no consume")));
                    obj.setTemp(Float.parseFloat(JOptionPane.showInputDialog(null, "" +
                            "Digite la temperatura del usuario")));
                    obj.setSalud(Integer.parseInt(JOptionPane.showInputDialog(null, "" +
                            "Digite 1 - Enfermo 15 días o más, 2 - Enfermo 8 días o 3 - Actualmente Enfermo")));
                    break;

                case 2:
                    //objeto para llamar el método de consumo de alcohol y
                    // otro objeto que llama el valor del atributo
                    JOptionPane.showMessageDialog(null, obj.consumoAlcohol(obj.isAlcohol()));
                    JOptionPane.showMessageDialog(null, obj.estadoSalud(obj.getSalud()));
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo.....");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción No válida (1-3)");
                    break;
            }

        }while(opcion!=3);
    }
}
