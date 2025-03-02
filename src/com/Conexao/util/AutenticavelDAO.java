package com.Conexao.util;

import com.Escola.util.Autenticavel;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author franc
 */
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
