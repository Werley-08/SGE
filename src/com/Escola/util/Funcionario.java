package com.Escola.util;

public class Funcionario extends Pessoa{
    
    private String cargo;
    private String salario;
    private int identificacao;
    
    public Funcionario(String nome, int idade, String genero, String contato, String CPF, String cargo, String salario, int identificacao){
        
        super(nome, idade, genero, contato, CPF);
        this.cargo = cargo;
        this.salario = salario;
        this.identificacao = identificacao;
    }
    
    public String getCargo(){ return this.cargo; }
    
    public String getSalario(){ return this.salario; }
    
    public int getIdentificacao(){ return this.identificacao; }
    
    public void setcargo(String cargo){ this.cargo = cargo; }
    
    public void setSalario(String salario){ this.salario = salario; }
    
    public void setIdentificacao(int identificacao){ this.identificacao = identificacao; }
}