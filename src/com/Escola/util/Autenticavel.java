package com.Escola.util;

public class Autenticavel{
    
    private String nomeUsuario;
    private String senhaUsuario;

    public Autenticavel(String nomeUsuario, String senhaUsuario){
        
        setNomeUsuario(nomeUsuario);
        setSenhaUsuario(senhaUsuario);
    }

    public String getNomeusuario(){ return this.nomeUsuario; }
    
    public String getSenhaUsuario(){ return this.senhaUsuario; }
    
    public void setNomeUsuario(String nomeUsuario){ this.nomeUsuario = nomeUsuario; }
    
    public void setSenhaUsuario(String senhaUsuario){ this.senhaUsuario = senhaUsuario;}
}