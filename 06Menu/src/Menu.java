import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //variable para el control del ciclo y del switch -int o String
        int opcion=0;

        do{
            System.out.println("Bienvenidos!!!\n" +
                    "1. Ingreso al caso 1\n" +
                    "2. Ingreso al caso 2\n" +
                    "3. Ingreso al caso 3\n" +
                    "4. Salir\n");
            opcion = leer.nextInt();

            //Habilita el Switch
            switch (opcion){
                case 1:
                    System.out.println("Hola a todos!");
                    break;

                case 2:
                    System.out.println("Hola tengo sueño :(");
                    break;

                case 3:
                    int a=0;
                    int b=3;
                    System.out.println("La suma de los dos números es:"+(a+b));
                    break;

                case 4:
                    System.out.println("Saliendo......");
                    break;

                default:
                    System.out.println("Error opción no valida");
                    break;
            }

        }while(opcion!=4);


    }
}
