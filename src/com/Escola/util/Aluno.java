/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Escola.util;

import com.Conexao.util.ConexaoDAO;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */

public class Aluno extends Pessoa{
    
    private int matricula;
    private String serie;
    
    /// Variáveis do BD
    
    Connection conn;                
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Pessoa> alunos;
    
    public Aluno(String nome, int idade, String genero, String contato, String CPF, int matricula, String serie){
        
        super(nome, idade, genero, contato, CPF);
        this.matricula = matricula;
        this.serie = serie;
        
        alunos = new ArrayList<>();
    }
    
    @Override
    public void adicionar(Pessoa pessoa){
        
        String sql = "insert into aluno (nome_aluno, idade_aluno, genero_aluno, contato_aluno, cpf_aluno, matricula_aluno, serie_aluno) values (?, ?, ?, ?, ?, ?, ?)";	

        conn =  new ConexaoDAO().conectaBD();
        
        try{
            
            Aluno aluno = (Aluno) pessoa;
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, aluno.getNome());
            pstm.setInt(2, aluno.getIdade());
            pstm.setString(3, aluno.getGenero());
            pstm.setString(4, aluno.getContato());
            pstm.setString(5, aluno.getCPF());
            pstm.setInt(6, aluno.getMatricula());
            pstm.setString(7, aluno.getSerie());
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException e){
           
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
    }
    
    @Override
    public void remover(int id){
        
        String sql = "delete from aluno where id_aluno = ?";
        
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
        
        String sql = "update aluno set nome_aluno = ?, idade_aluno = ?, genero_aluno = ?, contato_aluno = ?, cpf_aluno = ?, matricula_aluno = ?, serie_aluno = ? where id_aluno = ?";
        
        conn =  new ConexaoDAO().conectaBD();
        
        try{
            
            Aluno aluno = (Aluno) pessoa;
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, aluno.getNome());
            pstm.setInt(2, aluno.getIdade());
            pstm.setString(3, aluno.getGenero());
            pstm.setString(4, aluno.getContato());
            pstm.setString(5, aluno.getCPF());
            pstm.setInt(6, aluno.getMatricula());
            pstm.setString(7, aluno.getSerie());
            pstm.setInt(8, id);
            
            pstm.execute();
            pstm.close();
            
        }catch(SQLException e){
           
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
    }
    
    @Override
    public ArrayList<Pessoa> buscar(){
        
        String sql = "select * from aluno";
        
        conn =  new ConexaoDAO().conectaBD();
        
        try{
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                
                Aluno aluno = new Aluno(rs.getString("nome_aluno"),
                                        rs.getInt("idade_aluno"), 
                                        rs.getString("genero_aluno"), 
                                        rs.getString("contato_aluno"),
                                        rs.getString("cpf_aluno"),
                                        rs.getInt("matricula_aluno"),
                                        rs.getString("serie_aluno"));
                
                aluno.setId(rs.getInt("id_aluno"));
                
                this.alunos.add(aluno);
                
            }
            
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
        return alunos;
        
    }
    
    // Métodos gets
    
    public int getMatricula(){
        
        return this.matricula;
        
    }
    
    public String getSerie(){
        
        return this.serie;
        
    }
    
    // Métodos sets
    
    public void setMatricula(int matricula){
        
        this.matricula = matricula;
        
    }
    
    public void setSerie(String serie){
        
        this.serie = serie;
        
    }
    
}
