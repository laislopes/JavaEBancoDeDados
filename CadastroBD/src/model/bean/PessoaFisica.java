package model.bean;



public class PessoaFisica extends Pessoa {
    
    private String nome;
    private String CPF;
    private int sexo = 0;
    
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
    
   public int getSexo() {
        return this.sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
   
   
    
            
}
