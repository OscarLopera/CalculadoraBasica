package utils;

public class NumMenor {


    public static double buscarNumMenor(double n1, double n2){
        if(n1 < n2){
            return n1;
        } else if (n2 < n1){
            return n2;
        }else {
            System.out.println("los numeros son iguales");
            return n1;
        }
    }
}
