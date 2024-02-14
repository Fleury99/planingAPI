package com.classeproject.planing.services;

import com.classeproject.planing.entities.Enseignant;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface EnseignantService {
    public List<Enseignant> getAllEnseignant();

    public ResponseEntity<String> addEnseignant(Enseignant enseignant);

    public ResponseEntity<String> updateEnseignant(Long id, Enseignant enseignant);

    public ResponseEntity<String> delateEnseignant(Long id);

    public Optional<Enseignant> findEnseignantById(Long id);


}
