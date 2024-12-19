package emsi._iir.MOSTAINE_MONCEF_CONTROLE1.repositories;

import emsi._iir.MOSTAINE_MONCEF_CONTROLE1.models.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivreRepository extends JpaRepository<Livre, Long> {
    public Livre findLivreById(Long id);
    public List<Livre> findLivresByPrixBetween(Double min, Double max);
    public List<Livre> findLivresByAuteurId(Long auteurId);
}
