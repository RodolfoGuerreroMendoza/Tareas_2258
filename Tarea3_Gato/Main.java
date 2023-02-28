package Tarea3_Gato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa una cadena de 9 caracteres (solo X, O o _): ");
        String entrada = input.nextLine();
            if (entrada.length() != 9 ) {
                System.out.println("La cadena ingresada no es válida, revise el número de caracteres.");
                return;
            }
        String marco =
                "-------------\n"
                + "| " + entrada.charAt(0) + " | " + entrada.charAt(1) + " | " + entrada.charAt(2) + " |\n"
                + "----+---+----\n"
                + "| " + entrada.charAt(3) + " | " + entrada.charAt(4) + " | " + entrada.charAt(5) + " |\n"
                + "----+---+----\n"
                + "| " + entrada.charAt(6) + " | " + entrada.charAt(7) + " | " + entrada.charAt(8) + " |\n"
                + "-------------\n";

        System.out.println("Cadena ingresada: " + entrada);
        System.out.println("Juego: \n" + marco);
        input.close();
    }
}