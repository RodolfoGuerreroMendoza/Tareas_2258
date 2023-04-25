package Tarea7_Interfaces2;

public class DriverVehiculo {
    public static void main(String[] args) {
        Camion camion =  new Camion("Diesel", 6);
        System.out.println(camion);
        System.out.println(camion.encender());
        camion.avanzar();
        camion.frenar();
        System.out.println(camion.apagar());

        System.out.println("--------------Motocicleta------------------");
        Motocicleta motocicleta = new Motocicleta(250, "Brixton");
        System.out.println(motocicleta);
        motocicleta.encender();
        motocicleta.avanzar();
        motocicleta.hacerCaballito();
        motocicleta.frenar();
        motocicleta.apagar();
    }
}
