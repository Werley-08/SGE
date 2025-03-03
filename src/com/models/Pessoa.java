package com.models;

public interface Pessoa {
    String getNome();
    int getIdade();
    String getGenero();
    String getContato();
    String getCPF();
    int getId();

    void setNome(String nome);
    void setIdade(int idade);
    void setGenero(String genero);
    void setContato(String contato);
    void setCPF(String CPF);
    void setId(int id);
}