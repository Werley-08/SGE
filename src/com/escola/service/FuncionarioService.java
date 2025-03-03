package com.escola.service;

import com.escola.dao.FuncionarioDAO;
import com.escola.models.Pessoa;
import com.escola.pessoa_factory.FuncionarioFactory;
import com.escola.pessoa_factory.PessoaFactory;
import com.escola.pessoa_factory.TipoPessoa;

import java.util.ArrayList;

public class FuncionarioService {

    private FuncionarioDAO funcionarioDAO;
    private PessoaFactory pessoaFactory;

    public FuncionarioService() {
        funcionarioDAO = new FuncionarioDAO();
    }

    public void adicionarFuncionario(String nome, int idade, String genero, String contato, String CPF, String cargo, String salario, int identificacao) {
        setPessoaFactory(TipoPessoa.FUNCIONARIO);
        Pessoa funcionario = pessoaFactory.criarPessoa(nome, idade, genero, contato, CPF, cargo, salario, identificacao);
        funcionarioDAO.adicionar(funcionario);
    }

    public void removerFuncionario(int id) {
        funcionarioDAO.remover(id);
    }

    public void atualizarFuncionario(String nome, int idade, String genero, String contato, String CPF, String cargo, String salario, int identificacao, int id) {
        setPessoaFactory(TipoPessoa.FUNCIONARIO);
        Pessoa funcionario = pessoaFactory.criarPessoa(nome, idade, genero, contato, CPF, cargo, salario, identificacao);
        funcionarioDAO.atualizar(funcionario, id);
    }

    public ArrayList<Pessoa> visualizarTodosFuncionarios() {
        return funcionarioDAO.buscar();
    }

    private void setPessoaFactory(TipoPessoa tipoPessoa) {
        if (tipoPessoa.equals(TipoPessoa.FUNCIONARIO)) {
            this.pessoaFactory = new FuncionarioFactory();
        }
    }
}