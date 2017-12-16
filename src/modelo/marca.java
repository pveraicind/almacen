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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class marca {
    
    private int idmarca;
    private String marca;

    public marca(int idmarca, String marca) {
        this.idmarca = idmarca;
        this.marca = marca;
    }

     public marca() {
       
    }

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
                public ArrayList<marca> getListadomarcas() throws SQLException{
        ArrayList<marca> listmarca = null;
        String sql="SELECT idmarca, nombremarca FROM marca";
        PreparedStatement preparedStatement;
        try {
            listmarca=new ArrayList<>();
            preparedStatement = ConeBD.conectar().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            marca marca = new marca();
            marca.setIdmarca(Integer.parseInt(resultSet.getString("IdMarca")));
            marca.setMarca(resultSet.getString("NombreMarca"));


            listmarca.add(marca);
        }
        } catch (SQLException ex) {
            Logger.getLogger(producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listmarca; 
                }
    
}
