package emsi._iir.MOSTAINE_MONCEF_CONTROLE1.services;

import emsi._iir.MOSTAINE_MONCEF_CONTROLE1.models.Auteur;
import emsi._iir.MOSTAINE_MONCEF_CONTROLE1.repositories.AuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuteurService {
     @Autowired
    AuteurRepository auteurRepository;

     public List<Auteur> findAll() {
         return auteurRepository.findAll();
     }

}
