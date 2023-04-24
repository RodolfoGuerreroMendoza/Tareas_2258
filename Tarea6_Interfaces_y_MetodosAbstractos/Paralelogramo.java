package org.Tarea6_Interfaces_y_MetodosAbstractos;

public class Paralelogramo implements Figura{
    private double altura;
    private double base;

    public Paralelogramo() {
    }

    public Paralelogramo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "paralelogramo{" +
                "altura=" + altura +
                ", base=" + base +
                '}';
    }

    @Override
    public double calcularArea() {
        return this.altura * this.base;
    }
}
