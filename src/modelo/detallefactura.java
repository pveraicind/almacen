/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conection.ConeBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class detallefactura {
    private int idproducto;
    private int idfactura;
    private int cantidad;
    private ArrayList<detallefactura> listdetalle;
     public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    private void venta (producto producto, factura factura){
    
        try {
            System.out.println("Insertar registro...");
            Statement dec;
            dec=ConeBD.conectar().createStatement();
            String query1="insert into detalle_factura (producto_idproducto, factura_num_factura,cantidad) values ("+producto.getIdproducto()+","+factura.getNumerofactura()+","+this.cantidad+")";
            dec.executeUpdate(query1);
            producto.disminuirstock(producto,this.cantidad );
        } catch (SQLException ex) {
            Logger.getLogger(detallefactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public ArrayList<detallefactura> getdetalle(int idfactura){
       
        String sql="SELECT producto_idproducto, factura_num_factura,cantidad FROM detalle_factura where factura_num_factura="+idfactura;
        PreparedStatement preparedStatement;
        try {
            listdetalle = new ArrayList<>();
            preparedStatement = ConeBD.conectar().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            detallefactura detallefactura = new detallefactura();
           
            detallefactura.setIdproducto(Integer.parseInt(resultSet.getString("idproducto")));
 
            detallefactura.setIdfactura(Integer.parseInt(resultSet.getString("idfactura")));
            detallefactura.setCantidad(Integer.parseInt(resultSet.getString("cantidad")));

            listdetalle.add(detallefactura);
        }
        } catch (SQLException ex) {
            Logger.getLogger(producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.listdetalle; 
                }
            
        
        
  
    

}
