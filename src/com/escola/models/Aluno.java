package com.escola.models;

public class Aluno implements Pessoa {

    private String nome;
    private int idade;
    private String genero;
    private String contato;
    private String CPF;
    private int id;
    private int matricula;
    private String serie;

    public Aluno(String nome, int idade, String genero, String contato, String CPF, int matricula, String serie) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.contato = contato;
        this.CPF = CPF;
        this.matricula = matricula;
        this.serie = serie;
    }

    @Override
    public String getNome() { return nome; }

    @Override
    public int getIdade() { return idade; }

    @Override
    public String getGenero() { return genero; }

    @Override
    public String getContato() { return contato; }

    @Override
    public String getCPF() { return CPF; }

    @Override
    public int getId() { return id; }

    @Override
    public void setNome(String nome) { this.nome = nome; }

    @Override
    public void setIdade(int idade) { this.idade = idade; }

    @Override
    public void setGenero(String genero) { this.genero = genero; }

    @Override
    public void setContato(String contato) { this.contato = contato; }

    @Override
    public void setCPF(String CPF) { this.CPF = CPF; }

    @Override
    public void setId(int id) { this.id = id; }

    public int getMatricula() { return matricula; }

    public String getSerie() { return serie; }

    public void setMatricula(int matricula) { this.matricula = matricula; }

    public void setSerie(String serie) { this.serie = serie; }
}