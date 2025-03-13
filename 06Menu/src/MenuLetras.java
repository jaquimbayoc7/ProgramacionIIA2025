import java.util.Scanner;

public class MenuLetras {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Variable que controla el ciclo - String
        String opcion="";

        do{
            System.out.println("Bienvenidos!!\n" +
                    "A. Ingrese al caso A\n" +
                    "B. Ingrese al caso B\n" +
                    "C. Ingrese al caso C\n" +
                    "D. Salir\n");
            opcion = leer.next();

            //switch
            switch (opcion.charAt(0)){
                case 'a': case 'A':
                    System.out.println("Hola a todos!");
                    break;

                case 'b': case 'B':
                    System.out.println("Hola ingreso al caso B");
                    break;

                case 'c': case 'C':
                    System.out.println("Hola ingreso al caso C");
                    break;

                case 'd': case 'D':
                    System.out.println("Saliendo.........");
                    break;

                default:
                    System.out.println("Error opción no valida");
                    break;
            }

        }while(!opcion.equalsIgnoreCase("D"));

    }
}
