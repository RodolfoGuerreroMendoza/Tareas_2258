package Extra10_JOptionPane.Controlador;

import Extra10_JOptionPane.Vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controlador extends MouseAdapter{
    private Ventana view;

    public Controlador(Ventana view) {
        this.view = view;
        this.view.getBtnMensaje().addMouseListener(this);
        this.view.getBtnEntrada().addMouseListener(this);
        this.view.getBtnOpcion().addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == view.getBtnMensaje()){
            JOptionPane.showMessageDialog(view, "Hola :3","Mensaje (1)",JOptionPane.WARNING_MESSAGE);
        }
        if (e.getSource() == view.getBtnEntrada()){
            String datos = JOptionPane.showInputDialog(view,"Ejemplo de entrada","Personalizado",JOptionPane.QUESTION_MESSAGE);
            this.view.getLblresultado().setText(datos);
        }
        if (e.getSource() == view.getBtnOpcion()){

            int respuesta = JOptionPane.showConfirmDialog(view, "Estas seguro de borrarlo?","Comfirmacion",JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_NO_OPTION) {
                view.getLblresultado().setText("Borrando...");
            }else{
                view.getLblresultado().setText("No se borraron");
            }
        }
    }
}
