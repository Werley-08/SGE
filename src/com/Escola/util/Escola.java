package com.Escola.util;

import com.DAO.util.AlunoDAO;
import com.DAO.util.FuncionarioDAO;
import com.factory.util.AlunoFactory;
import com.factory.util.FuncionarioFactory;
import com.factory.util.PessoaFactory;
import com.factory.util.TipoPessoa;

import java.util.ArrayList;

public class Escola{

    AlunoDAO alunoDAO;
    FuncionarioDAO funcionarioDAO;
    PessoaFactory pessoaFactory;
    
    public Escola(){

        alunoDAO = new AlunoDAO();
        funcionarioDAO = new FuncionarioDAO();
    }
    
    public void adicionarAluno(String nome, int idade, String genero, String contato, String CPF, int matricula, String serie){

        setPessoaFactory(TipoPessoa.ALUNO);
        Pessoa aluno = pessoaFactory.criarPessoa(nome, idade, genero, contato, CPF, matricula, serie);
        alunoDAO.adicionar(aluno);
    }
    
    public void removerAluno(int id){ alunoDAO.remover(id); }
    
    public void atualizarAluno(String nome, int idade, String genero, String contato, String CPF, int matricula, String serie, int id){

        setPessoaFactory(TipoPessoa.ALUNO);
        Pessoa aluno = pessoaFactory.criarPessoa(nome, idade, genero, contato, CPF, matricula, serie);
        alunoDAO.atualizar(aluno, id);
    }
    
    public ArrayList<Pessoa> visualizarTodosAlunos(){ return alunoDAO.buscar(); }

    
    public void adicionarFuncionario(String nome, int idade, String genero, String contato, String CPF, String cargo, String salario, int identificacao){

        setPessoaFactory(TipoPessoa.FUNCIONARIO);
        Pessoa funcionario = pessoaFactory.criarPessoa(nome, idade, genero, contato, CPF, cargo, salario, identificacao);
        funcionarioDAO.adicionar(funcionario);
    }
    
    public void removerFuncionario(int id){ funcionarioDAO.remover(id); }
    
    public void atualizarFuncionario(String nome, int idade, String genero, String contato, String CPF, String cargo, String salario, int identificacao, int id){

        setPessoaFactory(TipoPessoa.FUNCIONARIO);
        Pessoa funcionario = pessoaFactory.criarPessoa(nome, idade, genero, contato, CPF, cargo, salario, identificacao);
        funcionarioDAO.atualizar(funcionario, id);
    }
    
    public ArrayList<Pessoa> visualizarTodosFuncionarios(){ return funcionarioDAO.buscar(); }

    public void setPessoaFactory(TipoPessoa tipoPessoa){
        if(tipoPessoa.equals(TipoPessoa.ALUNO)){ this.pessoaFactory = new AlunoFactory(); }
        if(tipoPessoa.equals(TipoPessoa.FUNCIONARIO)){ this.pessoaFactory = new FuncionarioFactory(); }
    }
}