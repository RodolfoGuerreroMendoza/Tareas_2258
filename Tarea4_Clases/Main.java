package Tarea4_Clases;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mandarina");
        System.out.println("-----------------------------------------");
        System.out.print("Ingrese el tipo de mandarina: ");
        String tipo = scanner.nextLine();
        System.out.print("Ingrese el color de mandarina: ");
        String color = scanner.nextLine();
        System.out.print("Ingrese el diámetro de mandarina: ");
        double diametro = scanner.nextDouble();
        System.out.print("Ingrese la cantidad de semillas de mandarina: ");
        int cantidadSemillas = scanner.nextInt();
        System.out.print("Ingrese si la mandarina tiene ramas (true/false): ");
        boolean tieneRamas = scanner.nextBoolean();

        Mandarina mandarina = new Mandarina(tipo, color, (int) diametro, cantidadSemillas, tieneRamas);
        System.out.println(mandarina);

        System.out.println("Tipo de mandarina: " + mandarina.getTipo());
        System.out.println("Color de mandarina: " + mandarina.getColor());
        System.out.println("Diametro de mandarina: " + mandarina.getDiametro());
        System.out.println("Cantidad de semillas de mandarina: " + mandarina.getCantidadSemillas());
        System.out.println("Tiene ramas: " + mandarina.isTieneRamas());

        System.out.println("La mandarina es dulce: " + mandarina.esDulce());
        System.out.println("La mandarina es grande: " + mandarina.esGrande());
        System.out.println("La mandarina tiene semillas: " + mandarina.tieneSemillas());
        System.out.println("-----------------------------------------");

        System.out.println("Perico");
        System.out.println("-----------------------------------------");
        System.out.print("Ingrese el nombre del perico: ");
        String nombre = scanner.next();
        System.out.print("Ingrese la edad del perico: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese el color del perico: ");
        String colorPerico = scanner.next();
        System.out.print("Ingrese la comida favorita del perico: ");
        String comidaFavorita = scanner.next();
        System.out.print("Ingrese si el perico puede hablar (true/false): ");
        boolean puedeHablar = scanner.nextBoolean();

        Perico perico = new Perico(nombre, edad, colorPerico, comidaFavorita, puedeHablar);
        System.out.println(perico);

        System.out.println("Nombre del perico: " + perico.getNombre());
        System.out.println("Edad del perico: " + perico.getEdad());
        System.out.println("Color del perico: " + perico.getColor());
        System.out.println("Comida favorita del perico: " + perico.getComidaFavorita());
        System.out.println("Puede hablar el perico? " + perico.isPuedeHablar());

        System.out.println("El perico es adulto: " + perico.esAdulto());
        System.out.println("Le gusta al perico: " + perico.getComidaFavorita());
        System.out.println("El perico puede volar: " + perico.puedeVolar());
    }
}
