package AplicacionSwing.Formula1.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dataSource{
    private String baseDatos;
    public static dataSource _instance;
    public Connection connection;
    private dataSource(String database){
        this.baseDatos = database;
        try{
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:"+this.baseDatos);
        } catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static dataSource getInstance(String baseDatos) {
        if (_instance == null) {
            _instance = new dataSource(baseDatos);

        } else {
            System.out.println("Ya fue creada.");
        }
        return _instance;
    }
    public Connection getConnection(){
        return connection;
    }
}