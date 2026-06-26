package com.octupus.pilot.repository;

import com.octupus.pilot.core.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {
}
