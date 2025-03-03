package com.Conexao.util;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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