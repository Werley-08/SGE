package com.escola.controller;

import com.escola.models.interfaces.Pessoa;
import com.escola.service.FuncionarioService;

import java.util.ArrayList;

public class FuncionarioController {

    private FuncionarioService funcionarioService;

    public FuncionarioController() {
        funcionarioService = new FuncionarioService();
    }

    public void adicionarFuncionario(String nome, int idade, String genero, String contato, String CPF, String cargo, String salario, int identificacao) {
        funcionarioService.adicionarFuncionario(nome, idade, genero, contato, CPF, cargo, salario, identificacao);
    }

    public void removerFuncionario(int id) {
        funcionarioService.removerFuncionario(id);
    }

    public void atualizarFuncionario(String nome, int idade, String genero, String contato, String CPF, String cargo, String salario, int identificacao, int id) {
        funcionarioService.atualizarFuncionario(nome, idade, genero, contato, CPF, cargo, salario, identificacao, id);
    }

    public ArrayList<Pessoa> visualizarTodosFuncionarios() {
        return funcionarioService.visualizarTodosFuncionarios();
    }
}