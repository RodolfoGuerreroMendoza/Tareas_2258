package Tarea4_Clases;

public class Mandarina {
    private String tipo;
    private String color;
    private int diametro;
    private int cantidadSemillas;
    private boolean tieneRamas;

    public Mandarina(String tipo, String color, int diametro, int cantidadSemillas, boolean tieneRamas) {
        this.tipo = tipo;
        this.color = color;
        this.diametro = diametro;
        this.cantidadSemillas = cantidadSemillas;
        this.tieneRamas = tieneRamas;
    }
    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getDiametro() {
        return diametro;
    }

    public int getCantidadSemillas() {
        return cantidadSemillas;
    }

    public boolean isTieneRamas() {
        return tieneRamas;
    }

    @Override
    public String toString() {
        return "Mandarina{" +
                "tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", diametro=" + diametro +
                ", cantidadSemillas=" + cantidadSemillas +
                ", tieneRamas=" + tieneRamas +
                '}';
    }
    public boolean esDulce() {
        return Math.random() > 0.6;
    }
    public boolean esGrande() {
        if (diametro > 5) {
            return true;
        }
        return false;
    }

    public boolean tieneSemillas() {
        if (cantidadSemillas > 0) {
            return true;
        }
        return false;
    }
}
