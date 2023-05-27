package Extra8_Conexiones_Bases.Controlador;

import Extra8_Conexiones_Bases.Modelo.ModeloTabla;
import Extra8_Conexiones_Bases.Vista.Ventana;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorLibro extends MouseAdapter {
    private Ventana view;
    private ModeloTabla modelo;

    public ControladorLibro(Ventana view) {
        this.view = view;
        this.view.getBtnCargar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getBtnCargar()){
            modelo = new ModeloTabla();
            modelo.cargarDatos();
            this.view.getTblLibro().setModel(modelo);
            this.view.getTblLibro().updateUI();

        }
    }
}
