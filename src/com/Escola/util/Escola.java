package com.Escola.util;

import com.DAO.util.AlunoDAO;
import com.DAO.util.FuncionarioDAO;

import java.util.ArrayList;

public class Escola{

    AlunoDAO alunoDAO;
    FuncionarioDAO funcionarioDAO;
    
    public Escola(){

        alunoDAO = new AlunoDAO();
        funcionarioDAO = new FuncionarioDAO();
    }
    
    public void adicionarAluno(String nome, int idade, String genero, String contato, String CPF, int matricula, String serie){
        
        Aluno aluno = new Aluno(nome, idade, genero, contato, CPF, matricula, serie);
        alunoDAO.adicionar(aluno);
    }
    
    public void removerAluno(int id){ alunoDAO.remover(id); }
    
    public void atualizarAluno(String nome, int idade, String genero, String contato, String CPF, int matricula, String serie, int id){
        
        Aluno aluno = new Aluno(nome, idade, genero, contato, CPF, matricula, serie);
        alunoDAO.atualizar(aluno, id);
    }
    
    public ArrayList<Pessoa> visualizarTodosAlunos(){ return alunoDAO.buscar(); }

    
    public void adicionarFuncionario(String nome, int idade, String genero, String contato, String CPF, String cargo, String salario, int identificacao){
        
        Funcionario funcionario = new Funcionario(nome, idade, genero, contato, CPF, cargo, salario, identificacao);
        funcionarioDAO.adicionar(funcionario);
    }
    
    public void removerFuncionario(int id){ funcionarioDAO.remover(id); }
    
    public void atualizarFuncionario(String nome, int idade, String genero, String contato, String CPF, String cargo, String salario, int identificacao, int id){

        Funcionario funcionario = new Funcionario(nome, idade, genero, contato, CPF, cargo, salario, identificacao);
        funcionarioDAO.atualizar(funcionario, id);
    }
    
    public ArrayList<Pessoa> visualizarTodosFuncionarios(){ return funcionarioDAO.buscar(); }
}