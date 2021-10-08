package com.example.eval.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Patient")
public class Patient {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "adresse_id")
    private int adresse;

    @Column(name = "infirmiere")
    private String infirmiere;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "dateDeNaissance")
    private LocalDate dateDeNaissance;

    @Column(name = "sexe")
    private String sexe;

    @Column(name = "numeroSecuriteSocial")
    private Long numeroSecuriteSocial;

    /* Relation entre les deux tables*/

    @ManyToOne
    @JoinColumn(name="id",nullable = false)
    public Adresse numero ;






}
