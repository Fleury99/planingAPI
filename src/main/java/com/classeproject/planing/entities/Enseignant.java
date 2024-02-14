package com.classeproject.planing.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "enseignant")// nom de la table dans la base de données
@Getter
@Setter
@ToString
public class Enseignant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String tel;
    private String matricule;
    private String email;

}
