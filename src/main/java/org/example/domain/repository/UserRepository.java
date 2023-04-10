package org.example.domain.repository;

import org.example.domain.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Usuario, Integer> {


    Optional<Usuario> findByUsername(String username);
}
