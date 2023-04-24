package org.Tarea6_Interfaces_y_MetodosAbstractos;

import java.util.Scanner;

public class DriverFigura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de la altura: ");
        double alto = scanner.nextDouble();
        System.out.println("Ingrese el valor de la base: ");
        double base = scanner.nextDouble();

        Paralelogramo paralelogramo = new Paralelogramo((double) alto, (double) base);
        System.out.println("El área del paralelogramo es de: " + paralelogramo.calcularArea());

        System.out.println("------------------------------");

        System.out.println("Ingrese el valor del radio: ");
        double radio = scanner.nextDouble();

        Circulo circulo = new Circulo((double) radio);
        System.out.println("El área del círculo es de: " + circulo.calcularArea());
    }
}
