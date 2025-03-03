package com.escola.controller;

import com.escola.models.Usuario;
import com.escola.service.UsuarioService;
import com.escola.service.interfaces.IUsuarioService;

import java.sql.ResultSet;

public class UsuarioController{

    IUsuarioService usuarioService;

    public UsuarioController(){
        usuarioService = new UsuarioService();
    }

    public ResultSet autenticaUsuario(Usuario usuario){
        return usuarioService.autenticaUsuario(usuario);
    }
}