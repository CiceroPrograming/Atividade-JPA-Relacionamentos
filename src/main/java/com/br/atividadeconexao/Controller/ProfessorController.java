package com.br.atividadeconexao.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.br.atividadeconexao.Model.Professor;
import com.br.atividadeconexao.Repository.ProfessorRepository;

@Controller
public class ProfessorController {

    @Autowired
    ProfessorRepository repository;

    @GetMapping("cadastroProfessor")
    public String cadastroProfessor() {
        return "/cadastroProfessor";
    }

    @PostMapping
    public String salvar(Professor professor) {
        repository.save(professor);
        return "redirect:/cadastroProfessor";
    }
}
