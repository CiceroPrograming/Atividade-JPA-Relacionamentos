package com.br.atividadeconexao.Model;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Estudante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeEstudante;
    private String cpf;
    private String sobrenome;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "estudante_aula", joinColumns = @JoinColumn(name = "estudante_id"), inverseJoinColumns = @JoinColumn(name = "aula_id"))
    List<Aula> aulas;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "estudante_professor", joinColumns = @JoinColumn(name = "estudante_id"), inverseJoinColumns = @JoinColumn(name = "professor_id"))
    List<Professor> professores;

    public Estudante() {

    }

    public Estudante(int id, String nomeEstudante, String cpf, String sobrenome, List<Aula> aulas,
            List<Professor> professores) {
        this.id = id;
        this.nomeEstudante = nomeEstudante;
        this.cpf = cpf;
        this.sobrenome = sobrenome;
        this.aulas = aulas;
        this.professores = professores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public void setNomeEstudante(String nome) {
        this.nomeEstudante = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}
