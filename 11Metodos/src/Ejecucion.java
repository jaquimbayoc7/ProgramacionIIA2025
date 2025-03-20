import javax.swing.*;

public class Ejecucion {
    public static void main(String[] args) {
        Operaciones objOp= new Operaciones(0,0,0);
        int opcion=0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Suma\n" +
                    "2. Resta\n" +
                    "3. Multiplicación\n" +
                    "4. División\n" +
                    "5. Salir\n"));
            switch (opcion){
                case 1:
                    objOp.setNumerouno(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el " +
                            "numero uno")));
                    objOp.setNumerodos(Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el " +
                            "numero dos")));
                    JOptionPane.showMessageDialog(null, objOp.Suma());
                    break;

                case 2:
                    float c=0;
                    float d=0;
                    c = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el " +
                            "numero uno"));
                    d = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el " +
                            "numero dos"));
                    JOptionPane.showMessageDialog(null,objOp.Resta(c,d));
                    break;

            }

        }while(opcion!=5);

    }
}
