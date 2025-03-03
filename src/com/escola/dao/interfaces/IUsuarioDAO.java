package com.escola.dao.interfaces;

import com.escola.models.Usuario;

import java.sql.ResultSet;

public interface IUsuarioDAO{

    ResultSet autenticaUsuario(Usuario usuario);
}
