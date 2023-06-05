package AplicacionSwing.Formula1;

import AplicacionSwing.Formula1.Controlador.Controlador;
import AplicacionSwing.Formula1.Vista.Ventana;

public class Main {
    public static void main(String[] args) {
        Ventana ventana = new Ventana("Formula 1");
        Controlador control = new Controlador(ventana);
    }
}