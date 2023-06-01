package Extra10_JOptionPane;

import Extra10_JOptionPane.Controlador.Controlador;
import Extra10_JOptionPane.Vista.Ventana;

public class Main {
    public static void main(String[] args) {
        Ventana ventana = new Ventana("JOptionPane");
        Controlador control = new Controlador(ventana);
    }
}
