package Extra8_Conexiones_Bases;

import Extra8_Conexiones_Bases.Controlador.ControladorLibro;
import Extra8_Conexiones_Bases.Vista.Ventana;
public class Main {
    public static void main(String[] args) {
        Ventana ventana = new Ventana("MVC y JDBC");
        ControladorLibro controlador = new ControladorLibro(ventana);
    }
}
