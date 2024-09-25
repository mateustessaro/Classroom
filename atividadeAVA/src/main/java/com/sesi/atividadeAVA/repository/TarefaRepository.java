package com.sesi.atividadeAVA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.atividadeAVA.Model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
