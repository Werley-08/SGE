/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Escola.util;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public abstract class Pessoa{
    
    private String nome;
    private int idade;
    private String genero;
    private String contato;
    private String CPF;
    private int id;
    
    public Pessoa(String nome, int idade, String genero, String contato, String CPF){
        
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.contato = contato;
        this.CPF = CPF;
        
    }
    
    // Métodos Abstratos-------------------------------------------------------------
    
    public abstract void adicionar(Pessoa pessoa);
    
    public abstract void remover(int id);
    
    public abstract void atualizar(Pessoa pessoa, int id);
    
    public abstract ArrayList<Pessoa> buscar();
    
    // Métodos Concretos ------------------------------------------------------------
    // Métodos Gets
    
    public String getNome(){
        
        return this.nome;
        
    }
    
    public int getIdade(){
        
        return this.idade;
        
    }
    
    public String getGenero(){
        
        return this.genero;
        
    }
    
    public String getContato(){
        
        return this.contato;
        
    }
    
    public String getCPF(){
        
        return this.CPF;
        
    }
    
    public int getId(){
        
        return this.id;
        
    }
    
    // Métodos Sets
    
    public void setNome(String nome){
        
        this.nome = nome;
        
    }
    
    public void setIdade(int idade){
        
        this.idade = idade;
        
    }
    
    public void setGenero(String genero){
        
        this.genero = genero;
        
    }
    
    public void setContato(String contato){
        
        this.contato = contato;
        
    }
    
    public void setCPF(String CPF){
        
        this.CPF = CPF;
        
    }
    
    public void setId(int id){
        
        this.id = id;
        
    }
  
}
