package com.DAO;

import com.conexao.ConexaoDAO;
import com.models.Autenticavel;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AutenticavelDAO{
    
    Connection conn;
    
    public ResultSet autenticaUsuario(Autenticavel autenticavel){
        
        conn = new ConexaoDAO().conectaBD();
        
        try{
            
            String sql = "select * from usuario where nome_usuario = ? and senha_usuario = ? ";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, autenticavel.getNomeusuario());
            pstm.setString(2, autenticavel.getSenhaUsuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}