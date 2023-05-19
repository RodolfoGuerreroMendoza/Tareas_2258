package Extra7_PatronAccesoDatos;

import Extra7_PatronAccesoDatos.Modelo.Libro;
import Extra7_PatronAccesoDatos.Persistencia.DemoLibroDB;
import Extra7_PatronAccesoDatos.Persistencia.LibroDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        //DemoLibroDB demo = new DemoLibroDB();
        //demo.insertarStatement();
        //System.out.println("Con prepared");
        //demo.insertarPreparedStatement();
        //Libro libro = new Libro(0,"El juego","Desconocido");
        //if (demo.insertarLibro(libro)){
            //System.out.println("Se inserto correctamente");
        //}else{
            //System.out.println("No se inserto");
        //}
        //System.out.println(demo.buscarLibroPorId(5));
        //System.out.println("----------------------------------------");
        //for (Libro tmp: demo.obtenerTodos()) {
            //System.out.println("Libro: " + tmp);
            //System.out.println("Titulo: " +tmp.getTitulo());
        //}
        LibroDAO libroDAO = new LibroDAO();
        //Libro libro = new Libro(1,"El perfume", "Patrick Süskind");
        //try{
            //if (libroDAO.update(libro)){
                //System.out.println("Se modifico correctamente");
            //}else{
                //System.out.println("No se pudo modificar");
            //}
        //}catch (SQLException sqle){
            //System.out.println("Error al modificar");
        //}

            //try{
                //if (libroDAO.delete("11")) {
                    //System.out.println("Se elimino correctamente");
                //}else {
                    //System.out.println("No se pudo eliminar");
                //}
            //}catch(SQLException sqle){
            //System.out.println("Error al eliminar");
            //}

        try{
          Libro res = (Libro) libroDAO.buscarPorId("1");
            System.out.println(res);
            System.out.println("-----------------------------");
            for (Object lib: libroDAO.obtenerTodo()) {
                System.out.println((Libro)lib);
            }

        }catch(SQLException sqle){
            System.out.println("Error ");
            System.out.println(sqle.getMessage());
        }
    }
}
