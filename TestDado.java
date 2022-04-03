public class TestDado {

    //Aquí probamos nuestra clase Dado:

    public static void main(String[] args){

        Dado d1 = new Dado("Alejandro");
        Dado d2 = new Dado("Manuel");

        for(int i=1;i<=10;i++){
            System.out.printf("\n\t+-------Tirada # %d-------+\n",i);
            d1.tirarDado();
            d2.tirarDado();
        }

    }

}
