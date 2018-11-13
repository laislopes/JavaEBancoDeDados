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
import model.bean.Pessoa;
import model.bean.PessoaFisica;

/**
 *
 * @author danie
 */
public class PessoaDAO {
    
    public void create(Pessoa p){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO clientes(Endereco,Numero,Cidade,Bairro,Estado,CEP,Telefone,Email,DataDoCadastro)VALUES(?,?,?,?,?,?,?,?,CURRENT_TIMESTAMP)");
            stmt.setString(1, p.getEndereco());
            stmt.setInt(2, p.getNumero());
            stmt.setString(3, p.getCidade());
            stmt.setString(4, p.getBairro());
            stmt.setString(5, p.getUf());
            stmt.setString(6, p.getCep());
            stmt.setString(7, p.getTelefone());
            stmt.setString(8, p.getEmail());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}
