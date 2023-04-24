package org.Tarea6_Interfaces_y_MetodosAbstractos.HerenciaMultiple;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro para darse de alta en el sistema...");
        System.out.println("Ingrese su nombre o el/la deportista: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese su # de cuenta: ");
        int cuenta = scanner.nextInt();
        System.out.println("Ingrese el promedio obtenido: ");
        double promedio = scanner.nextDouble();
        System.out.println("Ingrese el id de su tarjeta: ");
        int id = scanner.nextInt();
        System.out.println("Ingrese actividad artística");
        String arte = scanner.nextLine();

        System.out.println("----------Actividad dentro de las instalaciones----------");

        A_D_A ada = new A_D_A(nombre, edad, cuenta, promedio, id, arte);
        ada.setDeporte("Basketball");
        ada.ensayar();
        ada.presentacion();
        ada.inspirado();

        System.out.println(nombre + " Se aburrió y decidió hacer deporte...");
        ada.entrenar(ada.getDeporte());
        ada.repeticiones();
        ada.competir();

        System.out.println("A "+ nombre + " le dió hambre, busca que comer...");
        System.out.println("Qué debería comer"+ " "+ nombre+" "+"?");
        String comida = scanner.nextLine();
        ada.caminar();
        ada.sentarse();
        System.out.println(nombre + " saborea su " + comida);
        ada.comer();
    }
}
