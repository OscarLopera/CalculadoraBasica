package co.com.sofkaU;

import utils.NumMenor;

public class Main {

    public static void main(String[] args) {

        Potencia pow = new Potencia();
        pow.numero = 20;
        pow.imprimir();
        System.out.println("Bienvenidos al menu");

        double n1 = 3, n2 = 5.2;
        double numMenor = NumMenor.buscarNumMenor(n1, n2);
        System.out.println(numMenor);
        //Esto es una prueba;
        // Prueba 22
    }

}
