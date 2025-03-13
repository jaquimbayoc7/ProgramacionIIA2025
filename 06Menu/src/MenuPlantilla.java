import java.util.Scanner;

public class MenuPlantilla {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Definir variables
        String priNombre="";
        String segNombre="";
        String priApellido="";
        String segApellido="";

        int cantHoras=0;
        float totalSalario=0;
        float VALORHORA=130000;

        float PORSALUD=0.12f;
        float PORPENSION=0.12f;
        float PORARL = 0.05f;
        float PORCAJA = 0.06f;

        float valorSalud=0;
        float valorPension=0;
        float valorArl=0;
        float valorCaja=0;

        int opcion=0;

        do{
            System.out.println("Calculo de Salario y Prestaciones!!!\n" +
                    "1. Capturar de información del empleado\n" +
                    "2. Calcular prestaciones y salario\n" +
                    "3. Mostrar resultados\n" +
                    "4. Salir\n");
            opcion = leer.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Digite el primer nombre del trabajador:");
                    priNombre= leer.next();
                    System.out.println("Digite el segundo nombre del trabajador:");
                    segNombre= leer.next();
                    System.out.println("Digite el primer apellido del trabajador:");
                    priApellido = leer.next();
                    System.out.println("Digite el segundo apellido del trabajador:");
                    segApellido = leer.next();

                    System.out.println("Digite la cantidad de horas laboradas:");
                    cantHoras = leer.nextInt();

                    break;
                case 2:
                    //cálculo del salario
                    totalSalario = cantHoras*VALORHORA;
                    //Porcentaje de Salud
                    valorSalud = totalSalario * PORSALUD;
                    //Porcentaje de pensión
                    valorPension = totalSalario * PORPENSION;
                    //Porcentaje de ARL
                    valorArl = totalSalario * PORARL;
                    //porcentaje de Caja
                    valorCaja = totalSalario* PORCAJA;
                    System.out.println("Salario y prestaciones calculados!!!!!");
                    break;
                case 3:
                    System.out.println("Las prestaciones sociales y el salario del trabajador son:\n" +
                            "1. Nombres y apellidos: "+priNombre+" "+segNombre+" "+priApellido+" "+segApellido+"\n" +
                            "2. Aporte Salud: $."+valorSalud+"\n" +
                            "3. Aporte Pensión: $."+valorPension+"\n" +
                            "4. Aporte ARL: $."+valorArl+"\n" +
                            "5. Aporte Caja: $."+valorCaja+"\n"+
                            "6. Salario: $."+totalSalario);
                    //Validar bono
                    if(totalSalario>=1500000){
                        System.out.println("Ganaste Bono!!!!");
                    }else{
                        System.out.println("No ganaste Bono :(");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo.......");
                    break;
                default:
                    System.out.println("Error Opción No valida......");
                    break;
            }

        }while(opcion!=4);
    }
}
