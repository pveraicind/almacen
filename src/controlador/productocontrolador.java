/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.marca;
import modelo.producto;

/**
 *
 * @author USUARIO
 */
public class productocontrolador {
    
    private producto producto;
    private marca marca;
    

    public void agregarprduct (producto producto){
    
  
        try {
            producto.agregarprodcuto(producto);
        } catch (SQLException ex) {
            Logger.getLogger(productocontrolador.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
           public ArrayList <marca> getListadomarca() throws SQLException{
                marca = new marca();
        return marca.getListadomarcas(); 
    }
    
}
