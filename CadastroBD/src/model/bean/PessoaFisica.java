package model.bean;

import java.util.ArrayList;



public class PessoaFisica extends Pessoa {
    
    private String nome;
    private String CPF;
    private String sexo;
    private String celular;
    
    
    
    public PessoaFisica(String CPF){
        
        this.CPF = CPF;
        
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
   
    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
   
   
    
            
}
