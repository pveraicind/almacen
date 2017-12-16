/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conection.ConeBD;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USUARIO
 */
public class producto {
    
    private int idproducto;
    private String nombreproducto;
    private int precio;
    private int cantidad;
    private int marcaid;
    private String tipo;
    public producto(int idproducto, String nombreproducto, int precio, int cantidad, int marcaid) {
        this.idproducto = idproducto;
        this.nombreproducto = nombreproducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.marcaid = marcaid;
        
    }

    public producto() {
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getMarcaid() {
        return marcaid;
    }

    public void setMarcaid(int marcaid) {
        this.marcaid = marcaid;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
         public void agregarprodcuto( producto producto) throws SQLException{
    
        System.out.println("Insertar registro...");
        Statement dec;
        dec=ConeBD.conectar().createStatement();
        String query1="insert into producto (idproducto, nombreproducto, precio,cantidad,marca_idmarca) VALUES (inc_idprod.NEXTVAL, '"+producto.getNombreproducto()+"', '"+producto.getPrecio()+"','"+producto.getCantidad()+"','"+producto.getMarcaid()+"')";
        dec.executeUpdate(query1);
        
    }
  
     
         
}
