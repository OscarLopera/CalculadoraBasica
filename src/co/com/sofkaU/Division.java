package co.com.sofkaU;

public class Division {
    private double numero1;
    private double numero2;
    private double resultado;

<<<<<<< HEAD


=======
>>>>>>> 3a6febd38e8c4efbaf3fdaec198e455f1d17e71b
    public String getDivision(double numero1, double numero2, double resultado){
        if(numero2 == 0){
            return "No se puede dividir por cero";
        }else {
            resultado = numero1 / numero2;
            return "La division es: "+resultado ;
        }
    }
}
