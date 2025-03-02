/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Conexao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class ConexaoDAO{
    
    public Connection conectaBD(){
        
        Connection conn = null;
        
        try{
            
            String url = "jdbc:mysql://localhost:3306/bancoescola?user=root&password=";
            
            conn = DriverManager.getConnection(url);
            
            
            
        }catch (SQLException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
        return conn;
        
    }
}
