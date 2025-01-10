package com.Tarefas.Tarefas.model;

public class Tarefas {
    private Long id;
    private String tarefa;

    // Construtor
    public Tarefas(){

    }

    // Construtor
    public Tarefas(Long id, String tarefa) {
        this.id = id;
        this.tarefa = tarefa;
    }

    // Get and set

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }
}
