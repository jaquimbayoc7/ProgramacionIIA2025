import java.util.Scanner;

public class MenuLetras {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Definición de variables - Globales para todo el ejercicio
        String priNombre="";
        String segNombre="";
        String priApellido="";
        String segApellido="";

        int cantHoras=0;
        float VALORHORA=130000;
        float salario=0;

        float PORSALUD=0.12f;
        float PORPENSION=0.16f;
        float PORARL=0.05f;
        float PORCAJA=0.04f;

        float valorSalud=0;
        float valorPension=0;
        float valorArl=0;
        float valorCaja=0;

        float deducciones=0;

        float salReal=0;

        String opcion="";

        ///Menú - do- while - Switch
        do{
            System.out.println("Bienvenidos a la Nómina Corhuila\n" +
                    "A. Capturar la información de la nómina\n" +
                    "B. Realizar cálculos de prestaciones y deducciones\n" +
                    "C. Mostrar Nómina\n" +
                    "D. Salir\n");
            opcion = leer.next();
            //casos - switch
            switch(opcion.charAt(0)){
                case 'a': case 'A':
                    System.out.println("Digite el primer nombre de la persona");
                    priNombre= leer.next();
                    System.out.println("Digite el segundo nombre de la persona");
                    segNombre = leer.next();
                    System.out.println("Digite el primer apellido de la persona");
                    priApellido = leer.next();
                    System.out.println("Digite el segundo apellido de la persona");
                    segApellido = leer.next();
                    System.out.println("Digite la cantidad de horas laboradas");
                    cantHoras = leer.nextInt();
                    break;
                case 'b': case 'B':
                    //Valor Salario
                    salario = cantHoras * VALORHORA;
                    //Valor Pensión
                    valorPension = salario * PORPENSION;
                    //Valor Salud
                    valorSalud = salario * PORSALUD;
                    //Valor ARL
                    valorArl = salario * PORARL;
                    //Valor Caja
                    valorCaja = salario * PORCAJA;
                    //Deducciones
                    deducciones = valorArl+valorCaja+valorPension+valorSalud;
                    //Salario real
                    salReal= salario - deducciones;
                    System.out.println("Salario y prestaciones calculadas....:)");
                    break;
                case 'c': case 'C':
                    System.out.println("El resultado del cálculo prestacional es:\n" +
                            "1. Salario Real: $."+salReal+"\n" +
                            "2. Deducciones: $."+deducciones+"\n" +
                            "3. Valor Salud: $."+valorSalud+"\n" +
                            "4. Valor Pensión: $."+valorPension+"\n" +
                            "5. Valor Arl: $."+valorArl+"\n" +
                            "6. Valor Caja: $."+valorCaja+"\n" +
                            "7. Salario Inicial:$."+salario+"\n"+
                            "8. Cálculo para la persona: "+priNombre+" "+segNombre+" " +
                            ""+priApellido+" "+segApellido);
                    break;
                case 'd': case 'D':
                    System.out.println("Saliendo.....");
                    break;
                default:
                    System.out.println("Error Opción No Valida...");
                    break;
            }

        }while(!opcion.equalsIgnoreCase("d"));

    }
}
