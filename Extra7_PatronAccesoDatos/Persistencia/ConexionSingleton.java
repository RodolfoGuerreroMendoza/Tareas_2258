package Extra7_PatronAccesoDatos.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSingleton {
    private String baseDatos;
    public static ConexionSingleton _instance;
    public Connection connection;
    private ConexionSingleton(String database){
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
    public static ConexionSingleton get_instance(String baseDatos) {
        if (_instance == null) {
            _instance = new ConexionSingleton(baseDatos);

        } else {
            System.out.println("Ya fue creada.");
        }
        return _instance;
    }
    public Connection getConnection(){
        return connection;
    }
}