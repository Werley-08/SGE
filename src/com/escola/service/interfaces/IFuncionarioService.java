package com.escola.service.interfaces;

import com.escola.models.Pessoa;

import java.util.ArrayList;

public interface IFuncionarioService {

    void adicionarFuncionario(String nome, int idade, String genero, String contato, String CPF, String cargo, String salario, int identificacao);
    void removerFuncionario(int id);
    void atualizarFuncionario(String nome, int idade, String genero, String contato, String CPF, String cargo, String salario, int identificacao, int id);
    ArrayList<Pessoa> visualizarTodosFuncionarios();
}
