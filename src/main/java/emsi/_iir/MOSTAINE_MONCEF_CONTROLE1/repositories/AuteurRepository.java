package emsi._iir.MOSTAINE_MONCEF_CONTROLE1.repositories;

import emsi._iir.MOSTAINE_MONCEF_CONTROLE1.models.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuteurRepository extends JpaRepository<Auteur, Long> {
    public Auteur findAuteurById(Long id);
}
