public class MayorEdad {

    public static void main(String[] args){

        int edad;
        edad = 19;

        /*
        * if es una estructura de control de tipo selectiva
        * que ejecuta un bloque de código dependiendo se cumpla
        * una condición.
        * Tiene un complemento llama else que se ejecuta en caso
        * de que la condición dada en el if no se cumpla.
        * */

        if(edad>18)
            System.out.print("\n\t Puedes volver votar!");
        else if (edad<18)
            System.out.print("\n\t Lo sentimos, aún no puedes votar!");
        else
            System.out.print("\n\t Puedes votar por primera vez");

        /*
        * Nota: Cuando usamos else if debemos pensar que funciona como
        * los elefantitos que siempre viajan agarrados 1er elentante: (trompa-cola)- 2do elefante (trompa-cola)
        * o sea es decir: trompa(if)-cola(else)-trompa(if)-cola(else)-trompa(if)-cola(else).
        * */

    }

}
