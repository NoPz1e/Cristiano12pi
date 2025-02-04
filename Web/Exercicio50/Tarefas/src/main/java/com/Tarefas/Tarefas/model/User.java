package com.Tarefas.Tarefas.model;

public class User {
    private long id;
    private String nome;

    // Construtor
    public User(){

    }

    // Construtor II
    public User(long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    // get and set

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
