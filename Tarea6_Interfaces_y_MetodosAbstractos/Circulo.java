package org.Tarea6_Interfaces_y_MetodosAbstractos;

public class Circulo implements Figura{
    private double radio;
    private double Pi = 3.1416;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    @Override
    public double calcularArea() {
        return this.Pi * this.radio * this.radio;
    }
}
