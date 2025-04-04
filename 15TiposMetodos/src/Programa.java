import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        Atributos obj = new Atributos(0,0,"");

        int opcion=0;

        do{
            opcion= Integer.parseInt(JOptionPane.showInputDialog(null, "" +
                    "1. Sumar\n" +
                    "2. Restar\n" +
                    "3. Multiplicar\n" +
                    "4. Dividir\n" +
                    "5. Salir...."));
            switch (opcion){
                case 1:
                    //Método de ejecución void con parámetros
                    obj.setNumero(Float.parseFloat(JOptionPane.showInputDialog(null, "" +
                            "Digite el valor del número")));
                    obj.setNumerodos(Float.parseFloat(JOptionPane.showInputDialog(null, "" +
                            "Digite el valor del número dos")));
                    obj.Sumar(obj.getNumero(), obj.getNumerodos());
                    break;
                case 2:
                    //Métodos de retorno con parámetros
                    obj.setNumero(Float.parseFloat(JOptionPane.showInputDialog(null, "" +
                            "Digite el valor del número")));
                    obj.setNumerodos(Float.parseFloat(JOptionPane.showInputDialog(null, "" +
                            "Digite el valor del número dos")));
                    JOptionPane.showMessageDialog(null,obj.Restar(obj.getNumero(), obj.getNumerodos()));
                    break;
                case 3:
                    //Métodos void sin parámetros
                    obj.setNumero(Float.parseFloat(JOptionPane.showInputDialog(null, "" +
                            "Digite el valor del número")));
                    obj.setNumerodos(Float.parseFloat(JOptionPane.showInputDialog(null, "" +
                            "Digite el valor del número dos")));
                    obj.Multi();
                    break;

            }

        }while(opcion!=5);
    }
}
