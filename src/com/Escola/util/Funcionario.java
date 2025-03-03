package com.Escola.util;

public class Funcionario implements Pessoa {

    private String nome;
    private int idade;
    private String genero;
    private String contato;
    private String CPF;
    private int id;
    private String cargo;
    private String salario;
    private int identificacao;

    public Funcionario(String nome, int idade, String genero, String contato, String CPF, String cargo, String salario, int identificacao) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.contato = contato;
        this.CPF = CPF;
        this.cargo = cargo;
        this.salario = salario;
        this.identificacao = identificacao;
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

    public String getCargo() { return cargo; }

    public String getSalario() { return salario; }

    public int getIdentificacao() { return identificacao; }

    public void setCargo(String cargo) { this.cargo = cargo; }

    public void setSalario(String salario) { this.salario = salario; }

    public void setIdentificacao(int identificacao) { this.identificacao = identificacao; }
}