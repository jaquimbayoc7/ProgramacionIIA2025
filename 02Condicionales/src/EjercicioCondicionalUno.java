//Importar librería Scanner - Capturar datos
import java.util.Scanner;

public class EjercicioCondicionalUno {
    //Métodoprincipal
    public static void main(String[] args) {
        //Librería Scanner lista e instanciada
        Scanner leer = new Scanner(System.in);
        //Definir variables
        String nombres="";
        String apellidos="";
        int edad =0;
        float temp=0;
        //Capturar Datos
        System.out.println("Digite el nombre del paciente:");
        nombres = leer.next();

        System.out.println("Digite los apellidos del paciente");
        apellidos = leer.next();

        System.out.println("Digite la edad del paciente: "+nombres+" "+apellidos);
        edad = leer.nextInt();

        System.out.println("Digite la temperatura del paciente "+nombres+" "+apellidos);
        temp = leer.nextFloat();

        /*//Condicionales - proceso
        if(edad>0 & edad<5 & temp>=38){
            System.out.println("En la mala :'(");
        }else if(edad>5 & edad<=15 & temp>=38){
            System.out.println("En la mala, pero aguanta un poquito");
        }else if(edad>15 & edad<=31 & temp>=38){
            System.out.println("Sobrevive");
        }else{
            System.out.println("Realizar revisión periódica de temperatura");
        }*/

        // Evaluación usando estructura anidada
        String mensaje = "Realizar revisión periódica de temperatura";

        if (temp >= 38) {
            if (edad > 0 && edad < 5) {
                mensaje = "En la mala :'(";
            } else {
                if (edad <= 15) {
                    mensaje = "En la mala, pero aguanta un poquito";
                } else if (edad <= 31) {
                    mensaje = "Sobrevive";
                }
            }
        }

        System.out.println(mensaje);
    }


}
