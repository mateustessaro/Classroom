package com.sesi.atividadeAVA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.atividadeAVA.Model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
