package ma.project.voiture.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.project.voiture.entities.Voiture;
import ma.project.voiture.repositories.VoitureRepository;

@Service
public class VoitureService {

    @Autowired
    private VoitureRepository voitureRepository;

    public Voiture enregistrerVoiture(Voiture voiture) {
        // Ici, vous pouvez ajouter des validations métier avant de sauvegarder
        return voitureRepository.save(voiture);
    }

    public Voiture modifierVoiture(Voiture voiture) {
        return voitureRepository.save(voiture);
    }
}