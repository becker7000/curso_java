public class TestCirculo {

    //Este es el ejecutable

    public static void main(String[] args){

        //Sintáxis para crear un objeto de la clase círculo:
        Circulo cir01 = new Circulo(3.5);
        System.out.print(cir01); //Mando a imprimir un circulo que hice
        cir01.calcularArea();
        cir01.calcularPerimetro();

        Circulo cir02 = new Circulo(4.8);
        System.out.print(cir02);
        cir02.calcularArea();
        cir02.calcularPerimetro();

    }

}
