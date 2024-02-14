package com.classeproject.planing.controllers;

import com.classeproject.planing.entities.Enseignant;
import com.classeproject.planing.services.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/enseignants/")
public class EnseignantController {

    private final EnseignantService enseignantService;

    @Autowired
    public EnseignantController(EnseignantService enseignantService) {
        this.enseignantService = enseignantService;
    }

    @GetMapping
    public List<Enseignant> getAllEnseignant(){
        return this.enseignantService.getAllEnseignant();
    }

    @PostMapping("add")
    public ResponseEntity<String> addEnseignant(@RequestBody Enseignant enseignant){
        return this.enseignantService.addEnseignant(enseignant);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<String> updateEnseignant(@PathVariable(name= "id") Long id, @RequestBody Enseignant enseignant){
        return this.enseignantService.updateEnseignant(id, enseignant);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteEnseignant(@PathVariable(name = "id") Long id){
        return this.enseignantService.delateEnseignant(id);
    }

    @GetMapping("{id}")
    public Optional<Enseignant> findEnseignantById(@PathVariable(name = "id") Long id){
        return this.enseignantService.findEnseignantById(id);
    }

}
