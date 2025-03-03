package com.factory.util;

import com.models.Pessoa;

public interface PessoaFactory{
    Pessoa criarPessoa(String nome, int idade, String genero, String contato, String CPF, Object... parametros);
}
