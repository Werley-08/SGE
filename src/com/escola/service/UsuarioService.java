package com.escola.service;

import com.escola.dao.UsuarioDAO;
import com.escola.models.Usuario;

import java.sql.ResultSet;

public class UsuarioService {

    UsuarioDAO usuarioDAO;

    public UsuarioService() {
        usuarioDAO = new UsuarioDAO();
    }

    public ResultSet autenticaUsuario(Usuario usuario){
        return usuarioDAO.autenticaUsuario(usuario);
    }
}