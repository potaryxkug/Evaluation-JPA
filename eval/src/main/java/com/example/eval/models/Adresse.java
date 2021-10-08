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
@Table(name="Adresse")
public class Adresse {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "numero")
    private int numero;

    @Column(name = "rue")
    private int rue;

    @Column(name = "cp")
    private int cp;

    @Column(name = "ville")
    private int ville;


    /* le
    @OneToMany(cascade = ALL,  mappedBy = "id")
    public Patient

*/



}
