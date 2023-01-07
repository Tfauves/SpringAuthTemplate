package com.example.demo.repositories;

import com.example.demo.models.profile.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

    Optional<Profile> findByUser_id(Long id);

    Void deleteByUser_id(Long id);
}

