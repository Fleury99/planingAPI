package com.classeproject.planing.repositories;

import com.classeproject.planing.entities.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnseignantRepo extends JpaRepository<Enseignant, Long> {
}
