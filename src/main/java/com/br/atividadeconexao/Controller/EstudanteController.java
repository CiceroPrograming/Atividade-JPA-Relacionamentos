package com.br.atividadeconexao.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.atividadeconexao.Model.Aula;
import com.br.atividadeconexao.Model.Estudante;
import com.br.atividadeconexao.Model.Professor;
import com.br.atividadeconexao.Repository.AulaRepository;
import com.br.atividadeconexao.Repository.EstudanteRepository;
import com.br.atividadeconexao.Repository.ProfessorRepository;

@Controller
public class EstudanteController {

    @Autowired
    EstudanteRepository repository;

    @Autowired
    AulaRepository aulaRepository;

    @Autowired
    ProfessorRepository professorRepository;

    @GetMapping("/cadastroEstudante")
    public ModelAndView cadastroEstudante() {
        ModelAndView mv = new ModelAndView("cadastroEstudante");
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Aula> aulas = new ArrayList<>();
        professores = (ArrayList<Professor>) professorRepository.findAll();
        aulas = (ArrayList<Aula>) aulaRepository.findAll();
        mv.addObject("aulas", aulas);
        mv.addObject("professores", professores);
        return mv;
    }

    @PostMapping("/cadastroEstudante")
    public String salvar(Estudante estudante) {
        repository.save(estudante);
        return "redirect:/list";
    }

}
