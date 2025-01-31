package com.Tarefas.Tarefas.controller;

import com.Tarefas.Tarefas.model.*;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller // Indica que a classe é um controlador Spring
public class UserController{
    
    // Apresenta em memória a lista armazenada dos utilizadores
    private List<User> userList = new ArrayList<>();

    // Exibir o formulário de registo
    @GetMapping("/user")
    public String formUsers(Model model){

        // Adiciona um objeto User vazio para o formulário
        model.addAttribute("user", new User());
        return "user"; // Retorna o template do thymeleaf "user.html"
    }

    // Processar o formulário de registo
    @PostMapping("/user/add") // Mapeia a URL "/user/add" para este método
    public String addUser(@ModelAttribute User user, Model model){
        // Adiciona o utilizador à lista
        userList.add(user);
        // Aqui vai surgir a confirmação do add
        System.out.println("utilizador resgistado: ID " + user.getId() + " Nome: " + user.getNome());
        // Redireciona a pagina "getmapping" para a lista users (não éo HTML)
        return "redirect:/user/lista_users";
    }

    // Lista Users
    @GetMapping("/user/lista_users")
    public String mostrarListaUsers(Model model){
        // Adiciona a lista de utilizadores ao modelo
        model.addAttribute("users", userList);
        return "lista_users"; // Retorna o template do thymeleaf "lista_users.html"
    }
}
