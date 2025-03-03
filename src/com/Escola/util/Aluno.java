package com.Escola.util;

public class Aluno extends Pessoa{
    
    private int matricula;
    private String serie;

    public Aluno(){
        super();
    }
    
    public Aluno(String nome, int idade, String genero, String contato, String CPF, int matricula, String serie){
        
        super(nome, idade, genero, contato, CPF);
        this.matricula = matricula;
        this.serie = serie;
    }

    public int getMatricula(){ return this.matricula; }
    
    public String getSerie(){ return this.serie; }
    
    public void setMatricula(int matricula){ this.matricula = matricula; }
    
    public void setSerie(String serie){ this.serie = serie; }
}