public class Circulo {

    //Esta es una clase.
    //El Scope es el ambito o lugar donde es reconocida una varible.
    //Los atributos siempre van privados.
    private double radio;

    //Constructor es un método que me permite crear de la nada un circulo.
    public Circulo(double radio) {
        this.radio = radio;
    }

    //Comportamiento:
    public void calcularArea(){ //Función o método:
        System.out.printf("\n\t El área del círculo es: %.3f",Math.PI*Math.pow(this.radio,2));
    }

    public void calcularPerimetro(){
        System.out.printf("\n\t El perímetro de círculo es: %.3f",Math.PI*2*this.radio);
    }

    @Override //Sobreescribir
    public String toString() {
        return "\n\t Circulo{" +
                "radio=" + radio +
                '}';
    }
}
