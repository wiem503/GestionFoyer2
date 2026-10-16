package tn.esprim.gestionfoyer.entities;


import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Reservation implements Serializable {

    @Id
    private String idReservation;
    private String anneeUniversitaire;
    private Boolean estValide;

    @ManyToMany
    private Set<Etudiant> etudiants;

}
