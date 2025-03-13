import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //definir variables
        String nombres = "";
        String apellidos = "";
        int edad = 0;
        float temp = 0;
        String categoriaTemp="";

        //Capturar la información
        System.out.println("Digite el nombre del paciente: ");
        nombres = leer.next();
        System.out.println("Digite los apellidos del paciente: ");
        apellidos = leer.next();
        System.out.println("Digite la edad del paciente: " + nombres + " " + apellidos);
        edad = leer.nextInt();
        System.out.println("Digite la temperatura del paciente: " + nombres + " " + apellidos);
        temp = leer.nextFloat();

        //Determinar categoría de temperatura
        if (temp >= 38 && temp <= 39) {
            categoriaTemp = "A";
        } else if (temp >= 40 && temp <= 41) {
            categoriaTemp = "B";
        } else if (temp >= 42) {
            categoriaTemp = "C";
        } else {
            categoriaTemp = "D";
        }

        //Switch para mostrar el mensaje según la categoría
        switch (categoriaTemp.charAt(0)) {
            case 'a': case 'A':
                System.out.println("El paciente está en la mala :'(");
                break;
            case 'b': case 'B':
                System.out.println("El paciente está en la mala, corra pal médico :'(");
                break;
            case 'c': case 'C':
                System.out.println("El paciente está en la mala, se va a morir :(******");
                break;
            default:
                System.out.println("Error temperatura no programada");
                break;
        }

    }
}
