import java.util.Scanner;

public class MenuArreglos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Control del menú, ciclo, switch
        int opcion=0;
        int tam=0;
        float VALORHORA=130000;

        System.out.println("Digite la cantidad de trabajadores a calcular");
        tam = leer.nextInt();

        String nombres[] = new String[tam];
        String apellidos[] = new String[tam];
        int cantHoras[] = new int[tam];
        float salarios[] = new float[tam];

        do{
            System.out.println("Bienvenidos al calculo de salarios\n" +
                    "1. Datos del trabajador\n" +
                    "2. Calcular Salarios\n" +
                    "3. Mostrar información\n" +
                    "4. Salir...");
            opcion = leer.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Cargar datos básicos");
                    for (int i = 0; i < tam; i++) {
                        System.out.println("Ingrese el dato #: "+i);
                        nombres[i]= leer.next();
                        apellidos[i] = leer.next();
                        System.out.println("Ingrese la cantidad de horas del empleado: "+nombres[i]+" "+apellidos[i]);
                        cantHoras[i]= leer.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Calcular salarios");
                    for (int i = 0; i < tam; i++) {
                        salarios[i] = cantHoras[i]* VALORHORA;
                    }
                    System.out.println("Salarios calculados");
                    break;
                case 3:
                    for (int i = 0; i < tam; i++) {
                        System.out.println("Este es el salario del trabajador: "+nombres[i]+" "+apellidos[i]+"\n" +
                                "$."+salarios[i]);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo.....");
                    break;
                default:
                    System.out.println("Error opción no valida!!!");
                    break;
            }

        }while(opcion!=4);

    }
}
