package com.escola.pessoa_factory;

import com.escola.models.Funcionario;

public class FuncionarioFactory implements PessoaFactory{

    @Override
    public Funcionario criarPessoa(String nome, int idade, String genero, String contato, String CPF, Object... parametros){

        if (parametros.length < 3) {
            throw new IllegalArgumentException("Parâmetros insuficientes para criar um Funcionario.");
        }

        String cargo = (String) parametros[0];
        String salario = (String) parametros[1];
        int identificacao = (int) parametros[2];

        return new Funcionario(nome, idade, genero, contato, CPF, cargo, salario, identificacao);
    }
}