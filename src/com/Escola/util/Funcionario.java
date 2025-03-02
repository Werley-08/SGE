/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Escola.util;

import com.Conexao.util.ConexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class Funcionario extends Pessoa{
    
    private String cargo;
    private String salario;
    private int identificacao;
    
    /// Váriáveis do BD
    
    Connection conn;                
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Pessoa> funcionarios;
    
    public Funcionario(String nome, int idade, String genero, String contato, String CPF, String cargo, String salario, int identificacao){
        
        super(nome, idade, genero, contato, CPF);
        this.cargo = cargo;
        this.salario = salario;
        this.identificacao = identificacao;
        
        funcionarios = new ArrayList<>();
    }
    
    @Override
    public void adicionar(Pessoa pessoa){
        
        String sql = "insert into funcionario (nome_func, idade_func, genero_func, contato_func, cpf_func, cargo_func, salario_func, identificacao_func) values (?, ?, ?, ?, ?, ?, ?, ?)";	

        conn =  new ConexaoDAO().conectaBD();
        
        try{
            
            Funcionario funcionario = (Funcionario) pessoa;
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, funcionario.getNome());
            pstm.setInt(2, funcionario.getIdade());
            pstm.setString(3, funcionario.getGenero());
            pstm.setString(4, funcionario.getContato());
            pstm.setString(5, funcionario.getCPF());
            pstm.setString(6, funcionario.getCargo());
            pstm.setString(7, funcionario.getSalario());
            pstm.setInt(8, funcionario.getIdentificacao());
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException e){
           
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
    }
    
    @Override
    public void remover(int id){
        
        String sql = "delete from funcionario where id_func = ?";
        
        conn =  new ConexaoDAO().conectaBD();
        
        try{
            
            pstm =  conn.prepareStatement(sql);
            
            pstm.setInt(1, id);
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
    }
    
    @Override
    public void atualizar(Pessoa pessoa, int id){
        
        String sql = "update funcionario set nome_func = ?, idade_func = ?, genero_func = ?, contato_func = ?, cpf_func = ?, cargo_func = ?, salario_func = ?, identificacao_func = ? where id_func = ?";
       
        conn =  new ConexaoDAO().conectaBD();
        
        try{
            
            Funcionario funcionario = (Funcionario) pessoa;
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, funcionario.getNome());
            pstm.setInt(2, funcionario.getIdade());
            pstm.setString(3, funcionario.getGenero());
            pstm.setString(4, funcionario.getContato());
            pstm.setString(5, funcionario.getCPF());
            pstm.setString(6, funcionario.getCargo());
            pstm.setString(7, funcionario.getSalario());
            pstm.setInt(8, funcionario.getIdentificacao());
            pstm.setInt(9, id);
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException e){
           
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        } 
        
    }
    
    @Override
    public ArrayList<Pessoa> buscar(){
        
        String sql = "select * from funcionario";
        
        conn =  new ConexaoDAO().conectaBD();
        
        try{
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                
                Funcionario funcionario = new Funcionario(rs.getString("nome_func"),
                                                          rs.getInt("idade_func"), 
                                                          rs.getString("genero_func"), 
                                                          rs.getString("contato_func"),
                                                          rs.getString("cpf_func"),
                                                          rs.getString("cargo_func"),
                                                          rs.getString("salario_func"),
                                                          rs.getInt("identificacao_func"));
                
                funcionario.setId(rs.getInt("id_func"));
                
                this.funcionarios.add(funcionario);
                
            }
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
        return funcionarios;

    }
    
    // Métodos gets
    
    public String getCargo(){
        
        return this.cargo;
        
    }
    
    public String getSalario(){
        
        return this.salario;
        
    }
    
    public int getIdentificacao(){
        
        return this.identificacao;
        
    }
    
    // Métodos sets
    
    public void setcargo(String cargo){
        
        this.cargo = cargo;
        
    }
    
    public void setSalario(String salario){
        
        this.salario = salario;
        
    }
    
    public void setIdentificacao(int identificacao){
        
        this.identificacao = identificacao;
        
    }
    
}
