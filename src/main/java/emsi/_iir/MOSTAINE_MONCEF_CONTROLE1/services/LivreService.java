package emsi._iir.MOSTAINE_MONCEF_CONTROLE1.services;

import emsi._iir.MOSTAINE_MONCEF_CONTROLE1.dtos.LivreDTO;
import emsi._iir.MOSTAINE_MONCEF_CONTROLE1.models.Livre;
import emsi._iir.MOSTAINE_MONCEF_CONTROLE1.repositories.AuteurRepository;
import emsi._iir.MOSTAINE_MONCEF_CONTROLE1.repositories.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LivreService {
    @Autowired
    LivreRepository livreRepository;
    @Autowired
    AuteurRepository auteurRepository;

    public List<Livre> getBooks(){
        return livreRepository.findAll();
    }
    public Livre getBookById(Long id){
        return livreRepository.findLivreById(id);
    }
    public List<Livre> findLivresByPrixBetween(Double min, Double max){
        return livreRepository.findLivresByPrixBetween(min, max);
    }
    public List<Livre> getByAuthor(Long authorid){
        return livreRepository.findLivresByAuteurId(authorid);
    }

    public Livre createLivre(LivreDTO livreDTO){
        Livre livre = Livre.builder()
                .titre(livreDTO.titre())
                .prix(livreDTO.prix())
                .auteurId(auteurRepository.findAuteurById(livreDTO.auteurId()))
                .build();
        livreRepository.save(livre);
        return livre;
    }
    public Livre updateLivre(Long id, LivreDTO livreDTO){
        Livre livre = livreRepository.findLivreById(id);
        livre.setTitre(livreDTO.titre());
        livre.setPrix(livreDTO.prix());
        livre.setAuteurId(auteurRepository.findAuteurById(livreDTO.auteurId()));
        livreRepository.save(livre);
        return livre;
    }
    public boolean deleteLivre(Long id){
        Livre livre = livreRepository.findLivreById(id);
        livreRepository.delete(livre);
        return true;
    }
}
