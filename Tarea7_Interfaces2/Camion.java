package Tarea7_Interfaces2;

public class Camion implements Vehiculo{
    private String comubstible;
    private double peso;

    public Camion() {
    }

    public Camion(String comubstible, double peso) {
        this.comubstible = comubstible;
        this.peso = peso;
    }

    public String getComubstible() {
        return comubstible;
    }

    public void setComubstible(String comubstible) {
        this.comubstible = comubstible;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "comubstible='" + comubstible + '\'' +
                ", peso=" + peso +
                '}';
    }
    public void transportar(){
        System.out.println("Transportando...");
    }

    @Override
    public boolean encender() {
        System.out.println("Encendiendo el camión de combustible" + this.comubstible);
        return Math.random() >= 0.2;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando el camión de combustible " + this.comubstible);
        return Math.random() >= 0.05;
    }

    @Override
    public void avanzar() {
        System.out.println("El camión está en marcha....");
    }

    @Override
    public void frenar() {
        System.out.println("El camión empieza a frenar....");
    }
}
