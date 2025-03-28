
import javax.swing.*;
public class Programa {
    public static void main(String[] args) {
        //Crear el objeto
        Vehiculo objVehiculo = new Vehiculo("", "", "");

        objVehiculo.setModelo(JOptionPane.showInputDialog(null,"" +
                "Digite el modelo del auto"));
        objVehiculo.setMarca("MAZDA");
        objVehiculo.setPlaca("LUR456");

        JOptionPane.showMessageDialog(null, "Este es el modelo:" +
                ""+objVehiculo.getModelo()+"\nEsta es la marca:"+objVehiculo.getMarca()+"" +
                "\nEsta es la placa:"+objVehiculo.getPlaca());
    }
}
