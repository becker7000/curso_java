public class AreaCirculo {

    public static void main(String[] args){

        /*
        * Sintaxis basica de una variable en Java:
        * */
        float radio = 4;
        float area;
        final float PI = (float) 3.141592;

        /*
        * Hay 3 tipos de instrucciones siempre:
        *  1) Entrada/Salida    2) Calculo   3) Control
        * */
        area = PI*radio*radio;

        /*
        * Secuencias de escape: son códigos que serán sustituidos.
        * por un caracter del código ASCII.
        * Invisibles: \n, \t, \a, \r Visibles: \xA9
        * */

        System.out.printf("\n\t El area del circulo es: %.2f",area);

    }

}
