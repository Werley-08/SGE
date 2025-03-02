/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Escola.util;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Escola {
    
    public Aluno aluno;
    public Funcionario funcionario;
    
    public Escola(){
        
        aluno = new Aluno("", 0, "", "", "", 0, "");
        funcionario = new Funcionario("", 0, "", "", "", "" ,"", 0);
    }
    
    // Métodos dos Alunos
    
    public void adicionarAluno(String nome, int idade, String genero, String contato, String CPF, int matricula, String serie){
        
        this.aluno = new Aluno(nome, idade, genero, contato, CPF, matricula, serie);
        
        aluno.adicionar(aluno);
    }
    
    public void removerAluno(int id){
        
        this.aluno.remover(id);
        
    }
    
    public void atualizarAluno(String nome, int idade, String genero, String contato, String CPF, int matricula, String serie, int id){
        
        this.aluno = new Aluno(nome, idade, genero, contato, CPF, matricula, serie);
        
        aluno.atualizar(aluno, id);
        
    }
    
    public ArrayList<Pessoa> visualizarTodosAlunos(){
        
        return this.aluno.buscar();
        
    }
    
    // Métodos dos Funcionarios
    
    public void adicionarFuncionario(String nome, int idade, String genero, String contato, String CPF, String cargo, String salario, int identificacao){
        
        this.funcionario = new Funcionario(nome, idade, genero, contato, CPF, cargo, salario, identificacao);
        
        funcionario.adicionar(funcionario);
    }
    
    public void removerFuncionario(int id){
        
        funcionario.remover(id);
        
    }
    
    public void atualizarFuncionario(String nome, int idade, String genero, String contato, String CPF, String cargo, String salario, int identificacao, int id){
        
         
        this.funcionario = new Funcionario(nome, idade, genero, contato, CPF, cargo, salario, identificacao);
        
        funcionario.atualizar(funcionario, id);
        
    }
    
    public ArrayList<Pessoa> visualizarTodosFuncionarios(){
        
        return funcionario.buscar();
        
    }
}