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
import javax.swing.JOptionPane;
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
            stmt = con.prepareStatement("INSERT INTO pessoasfisicas(Nome,CPF,Celular,Sexo)VALUES(?,?,?,?)");
            stmt.setString(1, pf.getNome());
            stmt.setString(2, pf.getCPF());
            stmt.setInt(4, pf.getSexo());
            stmt.setString(3, pf.getCelular());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}
