package com.escola.pessoa_factory;

import com.escola.models.interfaces.Pessoa;

public interface PessoaFactory{
    Pessoa criarPessoa(String nome, int idade, String genero, String contato, String CPF, Object... parametros);
}
