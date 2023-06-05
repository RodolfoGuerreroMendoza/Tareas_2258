package AplicacionSwing.Formula1.Modelo;

import AplicacionSwing.Formula1.DAO.FormulaDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModelTabla implements TableModel {
    public static final int COLUMS = 7;
    private ArrayList<ModelFormula> datos;
    private FormulaDAO mf1;

    public ModelTabla() {
        mf1 = new FormulaDAO();
        datos = new ArrayList<>();
    }

    public ModelTabla(ArrayList<ModelFormula> datos) {
        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMS;
    }

    @Override
    public String getColumnName(int rowIndex) {
        switch(rowIndex){
            case 0:
                return "ID";
            case 1:
                return "Edad";
            case 2:
                return "Piloto";
            case 3:
                return "Equipo";
            case 4:
                return "Monoplaza";
            case 5:
                return "Podios";
            case 6:
                return "URL";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex) {
        switch(rowIndex){
            case 0:
                return Integer.class;
            case 1:
                return Integer.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return Integer.class;
            case 6:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModelFormula formula1 = datos.get(rowIndex);
        switch(columnIndex){
            case 0:
                return formula1.getId();
            case 1:
                return formula1.getEdad();
            case 2:
                return formula1.getPiloto();
            case 3:
                return formula1.getEquipo();
            case 4:
                return formula1.getMonoplaza();
            case 5:
                return formula1.getPodios();
            case 6:
                return formula1.getuRL();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                break;
            case 1:
                datos.get(rowIndex).setEdad((int) aValue);
                break;
            case 2:
                datos.get(rowIndex).setPiloto((String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setEquipo((String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setMonoplaza((String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setPodios((int) aValue);
                break;
            case 6:
                datos.get(rowIndex).setuRL((String) aValue);
                break;
            default:
                System.out.println("Sin modificar");
                break;
        }
    }
    // Url y mostrar imagen
    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    //Cargar datos de la tabla
    public void cargarDatos() {
        try {
            datos = mf1.obtenerTodo();
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
    }
    //Agregar datos a la tabla
    public boolean agregarPiloto(ModelFormula modelof1){
        boolean res = false;
        try{
            if(mf1.insertar(modelof1)){
                datos.add(modelof1);
                res = true;
            }else{
                res = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return res;
    }
    public boolean modificarPiloto(ModelFormula modelof1){
        boolean res = false;
        try{
            if(mf1.update(modelof1)){
                res = true;
            }else{
                res = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return res;
    }
    public boolean borrarPiloto(String index){
        boolean res = false;
        try{
            if(mf1.delete(index)){
                res = true;
            }else{
                res = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return res;
    }
    //Mostrar imagen
    public ModelFormula getModForIndex(int idx) {
        return datos.get(idx);
    }
}