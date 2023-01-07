package com.example.demo.repositories;

import com.example.demo.models.auth.ERole;
import com.example.demo.models.auth.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);

}
