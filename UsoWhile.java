public class UsoWhile {

    public static void main(String[] args){

        /*
        * Este programa hace la suma de Gauss con una while
        * ejemplo: 1+2+3+4+...+100
        *
        * Usamos while cuando sabemos la condicion que se tiene
        * que cumplir para que ya no se repita el cuerpo de codigo.
        * */

        //Tipo de dato entero:
        int contador=1;
        int suma=0; // Las sumas se inicializan en cero.


        while(contador<=100){

            suma+=contador; //Operadores de asignacion:
            // +=, -=, *=, /=, %=
            contador++; //Operador de incremento
            //Incrementa la variable contador en 1.

        }

        //Codigos de formato: %d(enteros), %c(caracteres), %f(flotantes/double)
        System.out.printf("\n\t La suma da: %d",suma);

    }

}
