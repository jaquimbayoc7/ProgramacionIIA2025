import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Ciclo While -Mientras
        int inicio=0;

        int finalizacion=0;

        System.out.println("Digite la cantidad de personas a evaluar:");
        finalizacion = leer.nextInt();

      /*  while(inicio <= finalizacion){
            System.out.println("Este es el ciclo número: "+inicio);
            inicio++;
        }

        do{
            System.out.println("Este es el ciclo número: "+inicio);
            inicio++;
        }while(inicio <= finalizacion);*/

        //vamos a hacer el ciclo for
        for (int i = 0; i <= finalizacion; i++) {
            System.out.println("Este es el ciclo número: "+i);
        }
    }
}
