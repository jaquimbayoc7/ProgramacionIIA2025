import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Variable para capacidad de almacenamiento
        int cantDatos=0;
        //Capacidad del arreglo dinámica
        System.out.println("Digite la cantidad de datos a guardar");
        cantDatos = leer.nextInt();
        //creación de arreglos
        String ArrNombres [] = new String[cantDatos];
        float ArrNumeros[] = new float[cantDatos];
        boolean ArrEstados[] = new boolean[cantDatos];
        //Cargar datos
        for (int i = 0; i < cantDatos; i++) {
            System.out.println("Este es el dato en la posición: "+i);
            ArrNombres[i] = leer.next();
        }
        //Mostrar datos
        for (int i = 0; i < cantDatos; i++) {
            System.out.println("Este es el dato en la posición: "+ArrNombres[i]);
        }


    }
}
