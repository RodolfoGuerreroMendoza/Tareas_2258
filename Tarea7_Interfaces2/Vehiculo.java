package Tarea7_Interfaces2;

public interface Vehiculo {
    public static final int Velocidad_MAXIMA = 160;
    public static final char CLASIFICACION_EFICIENCIA = 'A';

    public boolean encender();
    public boolean apagar();
    public void avanzar();
    public void frenar();
}
