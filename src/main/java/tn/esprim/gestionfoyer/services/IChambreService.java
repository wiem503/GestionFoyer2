package tn.esprim.gestionfoyer.services;
import tn.esprim.gestionfoyer.entities.Chambre;
import java.util.List;

public interface IChambreService {

    public List<Chambre> retrieveAllChambre();
    public Chambre retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre chambre);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);
}
