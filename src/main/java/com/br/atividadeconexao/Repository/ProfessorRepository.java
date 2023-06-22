package com.br.atividadeconexao.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.atividadeconexao.Model.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
