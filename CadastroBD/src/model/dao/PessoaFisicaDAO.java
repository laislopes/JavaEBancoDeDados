/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.PessoaFisica;

/**
 *
 * @author danie
 */
public class PessoaFisicaDAO {
    
    public void create(PessoaFisica pf){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO pessoasfisicas select 0,?,?,?,?");
            stmt.setString(2, pf.getNome());
            stmt.setString(3, pf.getCPF());
            stmt.setString(4, pf.getCelular());
            stmt.setInt(0, 0);
        } catch (SQLException ex) {
            Logger.getLogger(PessoaFisicaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
