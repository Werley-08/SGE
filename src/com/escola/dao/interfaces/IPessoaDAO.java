package com.escola.dao.interfaces;

import com.escola.models.interfaces.Pessoa;

import java.util.ArrayList;

public interface IPessoaDAO {

    void adicionar(Pessoa pessoa);
    void remover(int id);
    void atualizar(Pessoa pessoa, int id);
    ArrayList<Pessoa> buscar();
}