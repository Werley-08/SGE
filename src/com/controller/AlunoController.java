package com.controller;

import com.service.AlunoService;
import com.models.Pessoa;
import java.util.ArrayList;

public class AlunoController {

    private AlunoService alunoService;

    public AlunoController() {
        alunoService = new AlunoService();
    }

    public void adicionarAluno(String nome, int idade, String genero, String contato, String CPF, int matricula, String serie) {
        alunoService.adicionarAluno(nome, idade, genero, contato, CPF, matricula, serie);
    }

    public void removerAluno(int id) {
        alunoService.removerAluno(id);
    }

    public void atualizarAluno(String nome, int idade, String genero, String contato, String CPF, int matricula, String serie, int id) {
        alunoService.atualizarAluno(nome, idade, genero, contato, CPF, matricula, serie, id);
    }

    public ArrayList<Pessoa> visualizarTodosAlunos() {
        return alunoService.visualizarTodosAlunos();
    }
}