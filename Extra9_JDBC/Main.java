package Extra9_JDBC;

import Extra9_JDBC.Controlador.ControladorLibro;
import Extra9_JDBC.Vista.Ventana;

public class Main {
    public static void main(String[] args) {
        Ventana ventana = new Ventana("MVC y JDBC");
        ControladorLibro controlador = new ControladorLibro(ventana);
    }
}
