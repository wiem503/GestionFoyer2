package tn.esprim.gestionfoyer.controllers;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprim.gestionfoyer.entities.Chambre;
import tn.esprim.gestionfoyer.services.IChambreService;

import java.util.List;

@RestController
//@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {

    @Autowired
    private IChambreService chambreService;

    @GetMapping("/afficherTouteLesChambres")
    public List<Chambre> getChambre() {
     List<Chambre> listeChambre=chambreService.retrieveAllChambre();
        return listeChambre;
    }

   @GetMapping("/retrieve-chambre/{chambre-id}")
public Chambre retrieveChambre(@PathVariable("chambre-id") Long chId) {
        Chambre chbr=chambreService.retrieveChambre(chId);
        return chbr;
    }

    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre=chambreService.addChambre(c);
        return chambre;
    }

    @DeleteMapping("/remove-chambre/{chambre-id}")
public void removeChambre(@PathVariable("chambre-id") Long chId) {
            chambreService.removeChambre(chId);
        }

    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.modifyChambre(c);
        return chambre;
    }

}
