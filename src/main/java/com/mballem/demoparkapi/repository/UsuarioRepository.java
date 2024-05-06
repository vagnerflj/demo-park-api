package com.mballem.demoparkapi.repository;

import com.mballem.demoparkapi.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}