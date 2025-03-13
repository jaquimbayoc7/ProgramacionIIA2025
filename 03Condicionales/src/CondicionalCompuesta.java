import java.util.Scanner;


public class CondicionalCompuesta {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //definir variables
        String nombres="";
        String apellidos="";
        int edad=0;
        float temp=0;
        //Capturar la información
        System.out.println("Digite el nombre del paciente: ");
        nombres = leer.next();
        System.out.println("Digite los apellidos del paciente: ");
        apellidos = leer.next();
        System.out.println("Digite la edad del paciente: "+nombres+" "+apellidos);
        edad = leer.nextInt();
        System.out.println("Digite la temperatura del paciente: "+nombres+" "+apellidos);
        temp= leer.nextFloat();
        //Condicionales
        if(temp>=38 & temp<=39){
            System.out.println("El paciente está en la mala :'(");
        }else if(temp>=40 & temp<=41){
            System.out.println("El paciente está en la mala, corra pal médico :'(");
        }else if(temp>=42){
            System.out.println("El paciente está en la mala, se va a morir :(******");
        }else{
            System.out.println("Error temperatura no programada");
        }

    }
}
