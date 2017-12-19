/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.detallefactura;
import modelo.marca;
import modelo.producto;

/**
 *
 * @author USUARIO
 */
public class ventacontrolador {
              public ArrayList <producto> getListadoprod() throws SQLException{
                  producto producto = new producto();
        return producto.getListadoproductos() ; 
    }
              
              public ArrayList <detallefactura> getListadet(int id) throws SQLException{
                  detallefactura detail = new detallefactura();
        return detail.getdetalle(id) ; 
    }
}
