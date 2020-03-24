
package main.java.com.mycompany.perro;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

/**
 *
 * @author Jeimmy Solandry Naranjo, Sebastian Velazquez, Mario Dorado
 */
public class PruebaBDPerros {
    public static void main(String[] args) throws Exception{
    
        //Crear tabla de perros
        String urlBD = "jdbc:sqlite:data/perros.db";
        
        // Crear la conexion a la base de datos 
        ConnectionSource fuente = new JdbcConnectionSource(urlBD);
        
        // Crear el DAO = representante de la tabla
        Dao<Perro, Integer> tablaPerros = DaoManager.createDao(fuente, Perro.class);
        
        //Crear la base de datos y la tabla
        TableUtils.createTable(tablaPerros);
        
        System.out.println("La tabla fue creada con exito!");
    }
    
}
