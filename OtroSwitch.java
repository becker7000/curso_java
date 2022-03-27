public class OtroSwitch {

    public static void main(String[] args){

        //Tipo de dato caracter (256):
        char letra;
        letra='@';

        switch(letra){

            case 'a': case 'e':
            case 'i': case 'o': case 'u':
                System.out.print("\n\t Hola soy una vocal en minuscula");
                System.out.printf("\n\t Soy la letra %c",letra);
                break;
            case 'A': case 'E': case 'I':
            case 'O': case 'U':
                System.out.print("\n\t Hola soy una vocal en mayuscula");
                System.out.printf("\n\t Soy la letra %c",letra);
                break;
            default:
                System.out.print("\n\t No soy una vocal");
                System.out.printf("\n\t Soy el simbolo %c",letra);

        }

    }

}
