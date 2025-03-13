import javax.swing.*;

public class Arreglos {
    public static void main(String[] args) {
        //definir las variables para el menu
        int opcion=0;
        int tam =0;
        // pedir el tamaño del arreglo
        tam = Integer.parseInt(JOptionPane.showInputDialog(null,"" +
                "Ingrese la cantidad de productos a guardar"));
        //Creamos el arreglo  simultáneos
        String [] productos = new String[tam];
        float [] precios = new float[tam];
        int [] cantidades = new int[tam];
        float[]totales = new float[tam];
        //menu interactivo
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "" +
                    "1. Cargar Datos de los productos\n" +
                    "2. Procesar productos y resultados\n" +
                    "3. Salir"));
            switch(opcion){
                case 1:
                    JOptionPane.showMessageDialog(null, "" +
                            "Cargar Productos!!!");
                    for (int i = 0; i < tam; i++) {
                        productos[i]=JOptionPane.showInputDialog(null, "" +
                                "Ingrese el nombre del producto");
                        cantidades[i]= Integer.parseInt(JOptionPane.showInputDialog(null, "" +
                                "Ingrese la cantidad del producto"));
                        precios[i]= Float.parseFloat(JOptionPane.showInputDialog(null,"" +
                                "Ingrese el precio del producto" ));
                        totales[i]= precios[i] * cantidades[i];
                    }
                    break;
                case 2:
                    String cad="";
                    for (int i = 0; i < tam; i++) {
                        cad+="Este es el producto: "+productos[i]+"\n" +
                                "Con el precio: "+precios[i]+"\n" +
                                "Cantidad comprada: "+cantidades[i]+"\n" +
                                "Total de compra: "+ totales[i]+"\n";
                    }
                    JOptionPane.showMessageDialog(null, cad);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "" +
                            "Salirrr.......!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "" +
                            "Error Opción no válida!");
                    break;
            }
        }while(opcion!=3);
    }
}
