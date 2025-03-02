package com.Escola.util;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author franc
 */
public class Autenticavel{
    
    private String nomeUsuario;
    private String senhaUsuario;
    
    /**
     *
     * @param nomeUsuario
     * @param senhaUsuario
     */
    public Autenticavel(String nomeUsuario, String senhaUsuario){
        
        setNomeUsuario(nomeUsuario);
        setSenhaUsuario(senhaUsuario);
        
    }
    
    // Métodos gets
    
    public String getNomeusuario(){
        
        return this.nomeUsuario;
        
    }
    
    public String getSenhaUsuario(){
        
        return this.senhaUsuario;
        
    }
    
    // Métodos sets
    
    public void setNomeUsuario(String nomeUsuario){
        
        this.nomeUsuario = nomeUsuario;
        
    }
    
    public void setSenhaUsuario(String senhaUsuario){
        
        this.senhaUsuario = senhaUsuario;
        
    }
    
}
