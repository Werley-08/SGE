package com.escola.service.interfaces;

import com.escola.models.Pessoa;

import java.util.ArrayList;

public interface IAlunoService {

    void adicionarAluno(String nome, int idade, String genero, String contato, String CPF, int matricula, String serie);
    void removerAluno(int id);
    void atualizarAluno(String nome, int idade, String genero, String contato, String CPF, int matricula, String serie, int id);
    ArrayList<Pessoa> visualizarTodosAlunos();
}
