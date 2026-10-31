package tn.esprim.gestionfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestionfoyer.entities.Chambre;
import tn.esprim.gestionfoyer.repositories.ChambreRepository;

import java.util.List;

@Service
public class ChambreServiceImpl implements IChambreService {

    @Autowired
    private ChambreRepository chambreRepo;


    @Override
    public List<Chambre> retrieveAllChambre() {
        return chambreRepo.findAll();
    }

    @Override
    public Chambre retrieveChambre(Long chambreId) {
        return chambreRepo.findById(chambreId).get();
    }

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepo.save(chambre);
    }

    @Override
    public void removeChambre(Long chambreId) {
        chambreRepo.deleteById(chambreId);
    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepo.save(chambre);
    }
}
