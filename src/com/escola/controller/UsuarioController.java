package com.escola.controller;

import com.escola.models.Usuario;
import com.escola.service.UsuarioService;

import java.sql.ResultSet;

public class UsuarioController{

    UsuarioService usuarioService;

    public UsuarioController(){
        usuarioService = new UsuarioService();
    }

    public ResultSet autenticaUsuario(Usuario usuario){
        return usuarioService.autenticaUsuario(usuario);
    }
}