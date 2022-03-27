public class MenuOpciones {

    public static void main(String[] args){

        /*
        * La estructura switch es una estructura de control de tipo selectiva
        * que se usa cuando ya tenemos 3 opciones o mas, generamente acepta en
        * su argumento dos tipos de datos: enteros o caracteres.
        * */

        int op;
        op=3;

        switch(op) {

            case 1:
                System.out.print("\n\t Hola, soy la primera opcion");
                break;
            case 2:
                System.out.print("\n\t Hola, soy la segunda opcion");
                break;
            case 3:
                System.out.print("\n\t Hola, soy la tercera opcion");
                break;
            default:
                System.out.print("\n\t Soy una opcion no contemplada");
        }


    }

}
