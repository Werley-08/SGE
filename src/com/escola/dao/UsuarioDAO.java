package com.escola.dao;

import com.escola.bd_conexao.ConexaoDAO;
import com.escola.dao.interfaces.IUsuarioDAO;
import com.escola.models.Usuario;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO implements IUsuarioDAO {
    
    Connection conn;

    @Override
    public ResultSet autenticaUsuario(Usuario usuario){
        
        conn = new ConexaoDAO().conectaBD();
        
        try{
            
            String sql = "select * from usuario where nome_usuario = ? and senha_usuario = ? ";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuario.getNomeusuario());
            pstm.setString(2, usuario.getSenhaUsuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}