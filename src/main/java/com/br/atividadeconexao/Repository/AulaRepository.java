package com.br.atividadeconexao.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.atividadeconexao.Model.Aula;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer> {

}
