package com.escola.service;

import com.escola.dao.AlunoDAO;
import com.escola.dao.interfaces.IPessoaDAO;
import com.escola.models.Pessoa;
import com.escola.pessoa_factory.AlunoFactory;
import com.escola.pessoa_factory.PessoaFactory;
import com.escola.pessoa_factory.TipoPessoa;
import com.escola.service.interfaces.IAlunoService;

import java.util.ArrayList;

public class AlunoService implements IAlunoService{

    private IPessoaDAO alunoDAO;
    private PessoaFactory pessoaFactory;

    public AlunoService() {
        alunoDAO = new AlunoDAO();
    }

    @Override
    public void adicionarAluno(String nome, int idade, String genero, String contato, String CPF, int matricula, String serie) {
        setPessoaFactory(TipoPessoa.ALUNO);
        Pessoa aluno = pessoaFactory.criarPessoa(nome, idade, genero, contato, CPF, matricula, serie);
        alunoDAO.adicionar(aluno);
    }

    @Override
    public void removerAluno(int id) {
        alunoDAO.remover(id);
    }

    @Override
    public void atualizarAluno(String nome, int idade, String genero, String contato, String CPF, int matricula, String serie, int id) {
        setPessoaFactory(TipoPessoa.ALUNO);
        Pessoa aluno = pessoaFactory.criarPessoa(nome, idade, genero, contato, CPF, matricula, serie);
        alunoDAO.atualizar(aluno, id);
    }

    @Override
    public ArrayList<Pessoa> visualizarTodosAlunos() {
        return alunoDAO.buscar();
    }

    private void setPessoaFactory(TipoPessoa tipoPessoa) {
        if (tipoPessoa.equals(TipoPessoa.ALUNO)) {
            this.pessoaFactory = new AlunoFactory();
        }
    }
}