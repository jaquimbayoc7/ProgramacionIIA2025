import java.util.Scanner;

public class Arreglo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cad="";
        //Primer paso para crear un arreglo - Tamaño y/o capacidad
        int tam=0;
        //Segundo paso pedir el tamaño al usuario - ¿Cuánto queremos que almacene?
        System.out.println("Digite la cantidad de datos a guardar");
        tam = leer.nextInt();
        //Tercer paso - crear el arreglo con el tamaño que le pedimos al usuario
        String nombres [] = new String[tam];
        //Cuarto recorrer el arreglo para asignar valores
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Este es el dato en la posición: "+i);
            nombres[i]= leer.next();
        }
        //Quinto Mostrar la información
        for (int i = 0; i < nombres.length; i++) {
           // System.out.println("Este es el dato en la posición: "+i +" Valor:"+nombres[i]);
            cad+="Este es el dato en la posición:" +i +" Valor:"+nombres[i]+"\n";
        }
        System.out.println(cad);
    }
}
