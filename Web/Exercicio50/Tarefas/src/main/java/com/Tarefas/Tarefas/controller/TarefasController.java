package com.Tarefas.Tarefas.controller;

import com.Tarefas.Tarefas.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tarefas")

public class TarefasController {
    private final List<Tarefas> tarefasList = new ArrayList<>();

    @GetMapping
    public List<Tarefas> getAllTarefas(){
        return tarefasList;
    }

    @PostMapping
    public Tarefas addTarefa (@RequestBody Tarefas tarefa){
        tarefasList.add(tarefa);
        return tarefa;
    }

}
