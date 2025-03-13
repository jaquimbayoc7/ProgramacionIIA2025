import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int inicio=1;
        int finalizacion=0;
        System.out.println("Digite cuantos pacientes va a intervenir");
        finalizacion= leer.nextInt();

        //While - Mientras - //Do ..While - Haga Mientras
        System.out.println("Ciclo while");
        while(inicio <= finalizacion){
            System.out.println("Este es el ciclo número: "+inicio);
            inicio++;
        }
        //do-- while
        inicio=1;
        System.out.println("Ciclo do while");
        do{
            System.out.println("Este es el ciclo número: "+inicio);
            inicio++;
        }while(inicio <= finalizacion);


        System.out.println("Ciclo For");
        //For - Para
        for (int ini = 0; ini < finalizacion; ini++) {
            System.out.println("Este es el ciclo número: "+inicio);
        }
    }
}
