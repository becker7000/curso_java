public class Dado {

    /*
    * Este programa simula el comportamiento de un dado
    * Así que puedes venir y lanzar el dado.
    * */

    public static void main(String[] args){

        int dado;
        //Casting: es la propiedad de transforma de un tipo
        // de dato a otro:
        // 0+1=1, 1+1=2, 2+1=3, 3+1=4, 4+1=5, 5+1=6
        dado=((int)(Math.random()*6))+1;

        //Inicializando la varible de tipo DadoTexto.
        DadoTexto texto= DadoTexto.UNO;

        switch (dado){
            case 1:
                texto=DadoTexto.UNO;
                break;
            case 2:
                texto=DadoTexto.DOS;
                break;
            case 3:
                texto=DadoTexto.TRES;
                break;
            case 4:
                texto=DadoTexto.CUATRO;
                break;
            case 5:
                texto=DadoTexto.CINCO;
                break;
            case 6:
                texto=DadoTexto.SEIS;
                break;
        }

        System.out.println("El resultado de lanzar es dado es: "+texto);

    }

}
