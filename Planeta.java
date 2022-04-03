public class Planeta {

    //ATRIBUTOS:
    private String nombre;
    private int posicion;

    //CONSTRUCTOR:
    public Planeta(String nombre, int posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    //METODOS (COMPORTAMIENTO)
    @Override
    public String toString() {
        return " \n\t Planeta{" +
                "Nombre = '" + nombre + '\'' +
                ", Posicion respecto del Sol = " + posicion +
                '}';
    }
}
