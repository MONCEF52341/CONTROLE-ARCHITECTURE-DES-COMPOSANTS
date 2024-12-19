package emsi._iir.MOSTAINE_MONCEF_CONTROLE1.controllers;

import emsi._iir.MOSTAINE_MONCEF_CONTROLE1.models.Auteur;
import emsi._iir.MOSTAINE_MONCEF_CONTROLE1.services.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuteurController {
    @Autowired
    private AuteurService auteurService;

    @QueryMapping
    public List<Auteur> listLivres() {
        return auteurService.findAll();
    }
}
