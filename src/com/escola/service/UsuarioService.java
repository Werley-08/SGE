package com.escola.service;

import com.escola.dao.UsuarioDAO;
import com.escola.dao.interfaces.IUsuarioDAO;
import com.escola.models.Usuario;

import java.sql.ResultSet;

public class UsuarioService {

    IUsuarioDAO usuarioDAO;

    public UsuarioService() {
        usuarioDAO = new UsuarioDAO();
    }

    public ResultSet autenticaUsuario(Usuario usuario){
        return usuarioDAO.autenticaUsuario(usuario);
    }
}