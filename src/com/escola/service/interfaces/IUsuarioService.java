package com.escola.service.interfaces;

import com.escola.models.Usuario;

import java.sql.ResultSet;

public interface IUsuarioService{

    ResultSet autenticaUsuario(Usuario usuario);
}
