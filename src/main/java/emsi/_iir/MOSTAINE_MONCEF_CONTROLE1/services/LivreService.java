package emsi._iir.MOSTAINE_MONCEF_CONTROLE1.services;

import emsi._iir.MOSTAINE_MONCEF_CONTROLE1.dtos.LivreDTO;
import emsi._iir.MOSTAINE_MONCEF_CONTROLE1.models.Livre;
import emsi._iir.MOSTAINE_MONCEF_CONTROLE1.repositories.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LivreService {
    @Autowired
    LivreRepository livreRepository;

    public List<Livre> getBooks(){
        return livreRepository.findAll();
    }
    public Livre getBookById(Long id){
        return livreRepository.findLivreById(id);
    }
    public List<Livre> findLivresByPrixBetween(Double min, Double max){
        return livreRepository.findLivresByPrixBetween(min, max);
    }
    public List<Livre>  getByAuthor(Long authorid){
        return livreRepository.findLivresByAuthor(authorid);
    }
}
