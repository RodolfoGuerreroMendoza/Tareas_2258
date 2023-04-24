package org.Tarea6_Interfaces_y_MetodosAbstractos.HerenciaMultiple;

public class A_D_A extends Alumno implements Deportista, Artista {
    private int id;
    private String deporte;
    private String arte;

    public A_D_A() {
    }

    public A_D_A(String nombre, int edad, int no_cuenta, double promedio, int id, String arte) {
        super(nombre, edad, no_cuenta, promedio);
        this.id = id;
        this.deporte = deporte;
        this.arte = arte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return super.toString() +
        "A_D_A{" +
                "id=" + id +
                ", deporte='" + deporte + '\'' +
                ", arte='" + arte + '\'' +
                '}';
    }
    public int ensayar() {
        System.out.println(getNombre() + " está ensayando " + this.arte);
        return 0;
    }

    @Override
    public boolean presentacion() {
        System.out.println(getNombre() + " está presentando su obra? ");
        if (Math.random() > 0.2) {
            System.out.println(true);
        }
        return false;
    }
    @Override
    public boolean inspirado() {
        System.out.println(getNombre()+ " se encuentra inspirado? ");
        if (Math.random() > 0.5) {
            System.out.println(false);
        }
        return true;
    }

    @Override
    public boolean entrenar(String deporte) {
        System.out.println(getNombre() + " está entrenando" +" " + this.deporte + "?");
        if (Math.random() > 0.2) {
            System.out.println(true);
        }
        return false;
    }

    @Override
    public boolean competir() {
        System.out.println(getNombre() + " está compitiendo? ");
        if (Math.random() > 0.5) {
            System.out.println(false);
        }
        return true;
    }

    @Override
    public int repeticiones() {
        if (Math.random() > 0.51) {
           System.out.println(getNombre() + " Entrena muy duro");
           return 0;
        }
        System.out.println(getNombre() + " Entrena lo necesario");
        return 0;
    }
}