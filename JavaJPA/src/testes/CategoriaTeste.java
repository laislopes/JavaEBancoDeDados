/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.bean.Categoria;
import Connection.ConnectionFactory;

/**
 *
 * @author danie
 */
public class CategoriaTeste {
 
    public static void main(String[] args) {
        
        Categoria c = new Categoria();
        c.setDescricao("Comidas");
        
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        
        em.close();
        
    }
}
