import java.util.Scanner;

public class CalculadoraIva {

    public static void main(String[] args){

        double montoSinIva;

        // Solo va una vez por todas las entradas de mi programa:
        Scanner entrada = new Scanner(System.in);

        //Así se usa el registro declarado arriba:
        montoSinIva = entrada.nextDouble();

        double montoConIva;
        final double IVA = 0.16;

        // 100 -> conIVA -> 100 + 100*0.16 = 100 + 16 = 116

        montoConIva = montoSinIva + (montoSinIva*IVA);

        System.out.printf("\n\t El monto con IVA es: %.2f",montoConIva);

    }

}
