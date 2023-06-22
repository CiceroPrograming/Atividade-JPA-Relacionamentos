package com.br.atividadeconexao.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.atividadeconexao.Model.Estudante;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Integer> {

}
