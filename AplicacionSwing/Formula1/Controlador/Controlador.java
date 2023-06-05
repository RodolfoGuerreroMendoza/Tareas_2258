package AplicacionSwing.Formula1.Controlador;

import AplicacionSwing.Formula1.Modelo.ModelFormula;
import AplicacionSwing.Formula1.Modelo.ModelTabla;
import AplicacionSwing.Formula1.Vista.Ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class Controlador extends MouseAdapter{
    private Ventana view;
    private ModelTabla modelo;

    public Controlador(Ventana view) {
        this.view = view;
        modelo = new ModelTabla();
        this.view.getTblFormula1().setModel(modelo);
        this.view.getTblFormula1().addMouseListener(this);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getBtnModificar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        //Btn C
        if(e.getSource() == view.getBtnCargar()){
            System.out.println("Cargar fue presionado...");
            modelo.cargarDatos();
            this.view.getTblFormula1().setModel(modelo);
            this.view.getTblFormula1().updateUI();
        }

        //Btn A
        if (e.getSource() == view.getBtnAgregar()){
            System.out.println("Agregar fue presionado...");
            ModelFormula modelForm = new ModelFormula();
            modelForm.setId(0);
            try{
                modelForm.setEdad(Integer.parseInt(this.view.getTxtEdad().getText()));
                modelForm.setPiloto(this.view.getTxtPiloto().getText());
                modelForm.setEquipo(this.view.getTxtEquipo().getText());
                modelForm.setMonoplaza(this.view.getTxtMonoplaza().getText());
                modelForm.setPodios(Integer.parseInt(this.view.getTxtPodios().getText()));
                modelForm.setuRL(this.view.getTxtImagen().getText());
                if(modelo.agregarPiloto(modelForm)){
                    JOptionPane.showMessageDialog(view,"Se agrego correctamente","Aviso",JOptionPane.INFORMATION_MESSAGE);
                    this.view.getTblFormula1().updateUI(); //Actualiza la tabla
                }else{
                    JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos. Favor revisar la conexion","Error inesperado", JOptionPane.ERROR_MESSAGE);
                }
                this.view.limpiarEntradas();
            }catch(Exception ex){
                System.out.println(ex.getStackTrace());
                JOptionPane.showMessageDialog(view,"Introduzca la informacion en un formato valido","Formato no valido", JOptionPane.ERROR_MESSAGE);
            }
        }
        //Btn E
        if (e.getSource() == this.view.getBtnEliminar()){
            System.out.println("Eliminar fue presionado...");
            int row = this.view.getTblFormula1().getSelectedRow();
            String ind = String.valueOf(this.modelo.getValueAt(row,0));
            System.out.println(ind);
            int respuesta = JOptionPane.showConfirmDialog(view, "¿Quieres borrar el elemento?", "Selecciona una opcion", JOptionPane.YES_NO_OPTION);
            if(respuesta == JOptionPane.YES_NO_OPTION){
                modelo.borrarPiloto(ind);
                JOptionPane.showMessageDialog(view, "Se borro correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(view, "No fue eliminado", "Error al eliminar", JOptionPane.ERROR_MESSAGE);
            }
            modelo.cargarDatos();
            this.view.getTblFormula1().setModel(modelo);
            this.view.getTblFormula1().updateUI();
            this.view.limpiarEntradas();
        }

        //Btn M
        if (e.getSource() == this.view.getBtnModificar()) {
            System.out.println("Modificar fue presionado...");
            int row = this.view.getTblFormula1().getSelectedRow();
            String index = String.valueOf(this.modelo.getValueAt(row, 0));
            System.out.println(index);
            ModelFormula modelFormula = new ModelFormula();
            try{
                modelFormula.setEdad(Integer.parseInt(this.view.getTxtEdad().getText()));
                modelFormula.setPiloto(this.view.getTxtPiloto().getText());
                modelFormula.setEquipo(this.view.getTxtEquipo().getText());
                modelFormula.setMonoplaza(this.view.getTxtMonoplaza().getText());
                modelFormula.setPodios(Integer.parseInt(this.view.getTxtPodios().getText()));
                modelFormula.setuRL(this.view.getTxtImagen().getText());
                modelFormula.setId(Integer.parseInt(index));
                System.out.println(modelFormula);
                if(modelo.modificarPiloto(modelFormula)){
                    JOptionPane.showMessageDialog(view, "Se modifico correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    this.view.getTblFormula1().updateUI();
                }else {
                    JOptionPane.showMessageDialog(view, "No se modifico. Revisa la conexion", "Error al insertar", JOptionPane.ERROR_MESSAGE);
                    this.view.getTblFormula1().updateUI();
                }
                modelo.cargarDatos();
                this.view.getTblFormula1().setModel(modelo);
                this.view.getTblFormula1().updateUI();
                this.view.limpiarEntradas();
            }catch(Exception ex){
                System.out.println(ex.getStackTrace());
                JOptionPane.showMessageDialog(view,"Introduzca la informacion en un formato valido","Formato no valido", JOptionPane.ERROR_MESSAGE);
            }

        }

        //Evento mostrar imagen
        if (e.getSource() == view.getTblFormula1()){
            System.out.println("Un elemento fue seleccionado");
            int row = this.view.getTblFormula1().getSelectedRow(); //Renglón seleccionado
            ModelFormula form = modelo.getModForIndex(row);
            try{
                this.view.getLblImagen().setIcon(form.getImagen());
            }catch (MalformedURLException mfor){
                System.out.println(e.toString());
            }
        }
    }
}