package Tarea1_String;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce de la siguiente forma tus datos: Nombre, profesión y nacionalidad.");
        String entrada = teclado.nextLine();
        System.out.println("Datos proporcionados: " + entrada);

            String[] separado = entrada.trim().toUpperCase().split(" "); {
            System.out.println("Nombre: " + separado[0]);
            System.out.println("Profesión: " + separado[1]);
            System.out.println("Nacionalidad: " + separado[2]);
        }
    }
}
