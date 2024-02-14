package com.classeproject.planing.services;

import com.classeproject.planing.entities.Enseignant;
import com.classeproject.planing.repositories.EnseignantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnseignantServiceImpl implements EnseignantService {

    private final EnseignantRepo enseignantRepo;

    @Autowired
    public EnseignantServiceImpl(EnseignantRepo enseignantRepo) {
        this.enseignantRepo = enseignantRepo;
    }

    @Override
    public List<Enseignant> getAllEnseignant() {
        return this.enseignantRepo.findAll();
    }

    @Override
    public ResponseEntity<String> addEnseignant(Enseignant enseignant) {
        this.enseignantRepo.save(enseignant);
        return new ResponseEntity<>("ENSEIGNANT AJOUTE", HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<String> updateEnseignant(Long id, Enseignant enseignant) {
        if (findEnseignantById(id).isPresent()) {
            enseignant.setId(id);
            this.enseignantRepo.save(enseignant);
            return new ResponseEntity<>("ENSEIGNANT MIS A JOUR", HttpStatus.ACCEPTED);
        }

        return new ResponseEntity<>("ENSEIGNANT NON TROUVE", HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<String> delateEnseignant(Long id) {
        if(findEnseignantById(id).isPresent()){
            this.enseignantRepo.deleteById(id);
            return new ResponseEntity<>("ENSEIGNANT SUPPRIME AVEC SUCCES", HttpStatus.OK);
        }
        return new ResponseEntity<>("ENSEIGNANT NON TROUVE", HttpStatus.NOT_FOUND);
    }

    @Override
    public Optional<Enseignant> findEnseignantById(Long id) {
        return this.enseignantRepo.findById(id);
    }
}
