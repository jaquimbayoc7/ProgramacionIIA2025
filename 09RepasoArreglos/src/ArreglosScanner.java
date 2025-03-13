import java.util.Scanner;

public class ArreglosScanner {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //definir las variables para el menu
        int opcion=0;
        int tam =0;
        // pedir el tamaño del arreglo
        System.out.println("Ingrese la cantidad de productos a guardar");
        tam = leer.nextInt();
        //Creamos el arreglo  simultáneos
        String [] productos = new String[tam];
        float [] precios = new float[tam];
        int [] cantidades = new int[tam];
        float[]totales = new float[tam];
        //menu interactivo
        do{
            System.out.println("" +
                    "1. Cargar Datos de los productos\n" +
                    "2. Procesar productos y resultados\n" +
                    "3. Salir");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Cargar Productos!!!");
                    for (int i = 0; i < tam; i++) {
                        System.out.println("Ingrese el nombre del producto:"+i);
                        productos[i]= leer.next();
                        System.out.println( "Ingrese la cantidad del producto"+i);
                        cantidades[i]= leer.nextInt();
                        System.out.println("Ingrese el precio del producto"+i);
                        precios[i]= leer.nextFloat();
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
                    System.out.println(cad);
                    break;
                case 3:
                    System.out.println( "Salirrr.......!");
                    break;
                default:
                    System.out.println( "Error Opción no válida!");
                    break;
            }
        }while(opcion!=3);
    }
}
