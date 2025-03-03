package com.escola.service;

import com.escola.dao.AlunoDAO;
import com.escola.models.Pessoa;
import com.escola.pessoa_factory.AlunoFactory;
import com.escola.pessoa_factory.PessoaFactory;
import com.escola.pessoa_factory.TipoPessoa;

import java.util.ArrayList;

public class AlunoService {

    private AlunoDAO alunoDAO;
    private PessoaFactory pessoaFactory;

    public AlunoService() {
        alunoDAO = new AlunoDAO();
    }

    public void adicionarAluno(String nome, int idade, String genero, String contato, String CPF, int matricula, String serie) {
        setPessoaFactory(TipoPessoa.ALUNO);
        Pessoa aluno = pessoaFactory.criarPessoa(nome, idade, genero, contato, CPF, matricula, serie);
        alunoDAO.adicionar(aluno);
    }

    public void removerAluno(int id) {
        alunoDAO.remover(id);
    }

    public void atualizarAluno(String nome, int idade, String genero, String contato, String CPF, int matricula, String serie, int id) {
        setPessoaFactory(TipoPessoa.ALUNO);
        Pessoa aluno = pessoaFactory.criarPessoa(nome, idade, genero, contato, CPF, matricula, serie);
        alunoDAO.atualizar(aluno, id);
    }

    public ArrayList<Pessoa> visualizarTodosAlunos() {
        return alunoDAO.buscar();
    }

    private void setPessoaFactory(TipoPessoa tipoPessoa) {
        if (tipoPessoa.equals(TipoPessoa.ALUNO)) {
            this.pessoaFactory = new AlunoFactory();
        }
    }
}