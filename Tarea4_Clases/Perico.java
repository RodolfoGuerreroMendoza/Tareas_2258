package Tarea4_Clases;

public class Perico {
    private String nombre;
    private int edad;
    private String color;
    private String comidaFavorita;
    private boolean puedeHablar;

    public Perico(String nombre, int edad, String color, String comidaFavorita, boolean puedeHablar) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.comidaFavorita = comidaFavorita;
        this.puedeHablar = puedeHablar;
    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getColor() {
        return color;
    }

    public String getComidaFavorita() {
        return comidaFavorita;
    }

    public boolean isPuedeHablar() {
        return puedeHablar;
    }

    @Override
    public String toString() {
        return "Perico{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                ", comidaFavorita='" + comidaFavorita + '\'' +
                ", puedeHablar=" + puedeHablar +
                '}';
    }
    public boolean esAdulto() {
        if (edad >= 2) {
            return true;
        }
        return false;
    }

    public boolean leGusta(String comida) {
        if (comidaFavorita.equalsIgnoreCase(comida)) {
            return true;
        }
        return false;
    }
    public boolean puedeVolar() {
        if (edad < 5) {
            return false;
        }
        return true;
    }
}
