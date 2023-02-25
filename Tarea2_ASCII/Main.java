package Tarea2_ASCII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una cadena de caracteres: ");
        String cadena = input.nextLine();
        boolean consecutivo = true;
        for (int i = 0; i < cadena.length() - 1; i++) {
            char c1 =  cadena.charAt(i);
            char c2 =  cadena.charAt(i + 1);
            if ((int) c2 - (int) c1 != 1) {
                consecutivo = false;
                break;
            }
        }
            System.out.println(consecutivo);
    }
}

