import java.util.Scanner;

public class EjercicioSwitch {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String nombre="";
        String apellidos="";
        float temp=0;
        int edad=0;
        //Controlar el switch para ingresar a cada caso
        int opcion=0;

        //Capturar los datos básicos del paciente
        System.out.println("Digite el nombre del paciente");
        nombre = leer.next();

        System.out.println("Digite el apellido del paciente");
        apellidos = leer.next();

        System.out.println("Digite la temperatura del paciente"+nombre+" "+apellidos);
        temp= leer.nextFloat();

        System.out.println("Bienvenid@s al manejo de temperatura y edad:\n" +
                "1. Edad entre 0 años y 5 años\n" +
                "2. Edad entre 6 años y 15 años\n" +
                "3. Edad entre 16 años a 30 años\n" +
                "4. Mayores de 31 años");
        opcion = leer.nextInt();

        //activar el switch
        switch(opcion){
            case 1:
                if(temp>=38){
                    System.out.println("Está en la mala");
                }else{
                    System.out.println("No está enfermo, esta melo :)");
                }
                break;

            case 2:
                if(temp>=38){
                    System.out.println("En la mala, pero aguanta un poquito");
                }else{
                    System.out.println("No está enfermo, esta melo :)");
                }
                break;
            case 3:
                if(temp>=38){
                    System.out.println("Sobrevive");
                }else{
                    System.out.println("No está enfermo, esta melo :)");
                }
                break;
            case 4:
                if(temp>=38){
                    System.out.println("Corre te vas a morir :'(");
                }else{
                    System.out.println("No está enfermo, esta melo :)");
                }
                break;
            default:
                System.out.println("Error opción no encontrada");
                break;
        }

    }
}
