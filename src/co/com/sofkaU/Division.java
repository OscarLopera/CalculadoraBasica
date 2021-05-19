package co.com.sofkaU;

public class Division {
    private double numero1;
    private double numero2;
    private double resultado;

    public String getDivision(double numero1, double numero2, double resultado){
        resultado = numero1 / numero2;
        return "La division es: "+resultado ;
    }

}
