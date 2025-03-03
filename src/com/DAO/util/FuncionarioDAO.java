package com.DAO.util;

import com.Conexao.util.ConexaoDAO;
import com.Escola.util.Funcionario;
import com.Escola.util.Pessoa;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FuncionarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public FuncionarioDAO(){
    }

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

    public ArrayList<Pessoa> buscar(){

        String sql = "select * from funcionario";

        conn =  new ConexaoDAO().conectaBD();

        ArrayList<Pessoa> funcionarios = new ArrayList<>();

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

                funcionarios.add(funcionario);
            }

        }catch(SQLException e){

            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return funcionarios;
    }
}