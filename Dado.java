public class Dado {

    //ATRIBUTOS:
    private String jugador;
    private int dado;

    //CONTRUCTOR:
    public Dado(String jugador) {
        this.jugador = jugador;
    }

    //COMPORTAMIENTO:
    public void tirarDado(){

        //Nos genera un aleatorio entre 1 y 6:
        this.dado=((int)(Math.random()*6))+1;

        //Inicializando la varible de tipo DadoTexto.
        DadoTexto texto = DadoTexto.TRES;
        //Este valor va a cambiar

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
        System.out.println("\n\tEl resultado de lanzar el dado de "+this.jugador+" es: "+texto);
    }
}