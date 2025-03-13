import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //While - Mientras - do--- while (haga mientras)
        /*int inicio=1;
        int finalizacion=0;

        System.out.println("Digite la cantidad de usuarios a evaluar");
        finalizacion = leer.nextInt();

        do{
            System.out.println("Este es el ciclo #: "+inicio);
            //contador
            inicio++;
        }while(inicio <= finalizacion);*/

        //for - para
        int finalizacion=0;

        System.out.println("Digite la cantidad de usuarios a evaluar");
        finalizacion = leer.nextInt();

        for (int inicio = 1; inicio <= finalizacion; inicio++) {
            System.out.println("Este es el ciclo #: "+inicio);
        }

    }
}
