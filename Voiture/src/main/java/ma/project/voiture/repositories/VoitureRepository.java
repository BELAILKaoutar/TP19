package ma.project.voiture.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.project.voiture.entities.Voiture;

import java.util.List;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
    List<Voiture> findByClientId(Long clientId);
}
