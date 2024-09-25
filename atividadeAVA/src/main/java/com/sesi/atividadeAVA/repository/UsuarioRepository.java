package com.sesi.atividadeAVA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.atividadeAVA.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
