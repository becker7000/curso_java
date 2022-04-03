import java.util.Scanner;

public class Tiempo {

    public static void main(String[] args){

        //Entradas de datos en Java:
        //Debemos hacer código descriptivo:
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\t Escribe una cantidad de minutos: ");
        int minutos =  entrada.nextInt();

        // Ejemplo: 100 minutos = 60 min Horas: 1 minutos (1 hora) + 40 minutos = 1 hora con 40 minutos.
        int horas;
        horas=minutos/60;
        minutos=minutos%60; //100/60=1 sobra 40 minutos

        //Nota: printf -> print format
        System.out.printf("\n\t Los minutos introducidos son equivalentes a: " +
                "\n\t   %d hora(s) con %d minuto(s)",horas,minutos);

    }

}
