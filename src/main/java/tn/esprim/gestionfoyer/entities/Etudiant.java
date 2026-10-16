package tn.esprim.gestionfoyer.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEtudiant;
    private String prenomEtudiant;
    private  Long cin;
    private String ecole;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date dateNaissance;

    @ManyToMany(mappedBy ="etudiants",cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
