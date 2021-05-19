package co.com.sofkaU;

public class Potencia {

    int numero = 10;

    public double calcularPotencia(float numero) {
        return Math.pow(numero, 2);
    }

    public void imprimir() {
         System.out.println(calcularPotencia(numero));
    }


}
