package com.escola.service;

import com.escola.dao.UsuarioDAO;
import com.escola.dao.interfaces.IUsuarioDAO;
import com.escola.models.Usuario;
import com.escola.service.interfaces.IUsuarioService;

import java.sql.ResultSet;

public class UsuarioService implements IUsuarioService {

    IUsuarioDAO usuarioDAO;

    public UsuarioService() {
        usuarioDAO = new UsuarioDAO();
    }

    @Override
    public ResultSet autenticaUsuario(Usuario usuario){
        return usuarioDAO.autenticaUsuario(usuario);
    }
}