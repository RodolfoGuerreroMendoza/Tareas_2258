package AplicacionSwing.Formula1.DAO;

import AplicacionSwing.Formula1.Modelo.ModelFormula;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FormulaDAO implements InterfazDAO {
    public FormulaDAO() {
    }

    @Override //Insertar
    public boolean insertar(Object obj) throws SQLException {
        String  sqlInsert = "INSERT INTO Formula1(Edad, Piloto, Equipo, Monoplaza, Podios, _URL) VALUES(?, ?, ?, ?, ?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = dataSource.getInstance("ProyectoF1.db").getConnection().prepareStatement(sqlInsert);
        pstm.setInt(1, ((ModelFormula)obj).getEdad());
        pstm.setString(2, ((ModelFormula)obj).getPiloto());
        pstm.setString(3, ((ModelFormula)obj).getEquipo());
        pstm.setString(4, ((ModelFormula)obj).getMonoplaza());
        pstm.setInt(5, ((ModelFormula)obj).getPodios());
        pstm.setString(6, ((ModelFormula)obj).getuRL());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override //Actualizar
    public boolean update(Object obj) throws SQLException {
        String  sqlUpdate = "UPDATE Formula1 SET Edad = ?, Piloto = ?, Equipo = ?, Monoplaza = ?, Podios = ?, _URL = ? WHERE ID = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = dataSource.getInstance("ProyectoF1.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setInt(1, ((ModelFormula)obj).getEdad());
        pstm.setString(2, ((ModelFormula)obj).getPiloto());
        pstm.setString(3, ((ModelFormula)obj).getEquipo());
        pstm.setString(4, ((ModelFormula)obj).getMonoplaza());
        pstm.setInt(5, ((ModelFormula)obj).getPodios());
        pstm.setString(6, ((ModelFormula)obj).getuRL());
        pstm.setInt(7,((ModelFormula)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override //Borrar elemento
    public boolean delete(String id) throws SQLException {
        String sqlDelete = "DELETE FROM Formula1 WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = dataSource.getInstance("ProyectoF1.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1,Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM Formula1";
        ArrayList<ModelFormula> resultado = new ArrayList<>();
        Statement stm = dataSource.getInstance("ProyectoF1.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while (rst.next()){
            resultado.add(new ModelFormula(rst.getInt(1), rst.getInt(2), rst.getString(3), rst.getString(4),rst.getString(5), rst.getInt(6), rst.getString(7)));
        }
        return resultado;
    }
}