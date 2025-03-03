package com.service;

import com.DAO.FuncionarioDAO;
import com.models.Pessoa;
import com.factory.util.FuncionarioFactory;
import com.factory.util.PessoaFactory;
import com.factory.util.TipoPessoa;
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