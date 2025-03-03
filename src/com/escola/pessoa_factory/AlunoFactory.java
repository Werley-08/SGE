package com.escola.pessoa_factory;

import com.escola.models.Aluno;

public class AlunoFactory implements PessoaFactory{

    @Override
    public Aluno criarPessoa(String nome, int idade, String genero, String contato, String CPF, Object... parametros) {

        if (parametros.length < 2) {
            throw new IllegalArgumentException("Parâmetros insuficientes para criar um Aluno.");
        }

        int matricula = (int) parametros[0];
        String serie = (String) parametros[1];

        return new Aluno(nome, idade, genero, contato, CPF, matricula, serie);
    }
}