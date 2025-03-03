package com.escola.dao;

import com.escola.bd_conexao.ConexaoDAO;
import com.escola.models.Aluno;
import com.escola.models.Pessoa;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlunoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public AlunoDAO(){
    }

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

    public ArrayList<Pessoa> buscar(){

        ArrayList<Pessoa> alunos = new ArrayList<>();

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

                alunos.add(aluno);
            }

        }catch(SQLException e){

            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return alunos;
    }
}