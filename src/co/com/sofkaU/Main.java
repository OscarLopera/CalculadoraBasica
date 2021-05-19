package co.com.sofkaU;

import utils.NumMenor;
import java.util.*;
public class Main {

    public static void main(String[] args){

            Scanner entrada = new Scanner(System.in);

        dibujoMenu();
        System.out.println("Bienvenidos al menu");
        System.out.printf("Porfavor digita la opción que quiere ver\nOpcion 1: Factorial\nOpcion 2: Potenciación\nOpcion 3: Dividir\nOpcion 4: Numero menor\n");
        String opcion = entrada.nextLine();

        switch (opcion){
            case "1":
                System.out.printf("Seleccionaste la opción 1");

                break;

            case "2":
                System.out.printf("Seleccionaste la opción 2");
                break;

            case "3":
                System.out.printf("Seleccionaste la opción 3");
                Division div =  new Division();

                System.out.println(div.getDivision(2,2));
                break;

            case "4":
                System.out.println("Seleccionaste la opción 4");
                double n1 = 3, n2= 5.2;
                double numMenor= NumMenor.buscarNumMenor(n1,n2);
                System.out.println(numMenor);
                break;

            default:
                System.out.printf("Seleccionaste la opción diferente");
                break;

        }



    //Esto es una prueba;
        // Prueba 2
    }
    private static void dibujoMenu() {
        System.out.print("\n" +
                "▐▓█▀▀▀▀▀▀▀▀▀█▓▌░▄▄▄▄▄░\n" +
                "▐▓█░░▀░░▀▄░░█▓▌░█▄▄▄█░\n" +
                "▐▓█░░▄░░▄▀░░█▓▌░█▄▄▄█░\n" +
                "▐▓█▄▄▄▄▄▄▄▄▄█▓▌░█████░\n" +
                "░░░░▄▄███▄▄░░░░░█████░\n");
    }
}
