package emsi._iir.MOSTAINE_MONCEF_CONTROLE1.controllers;


import emsi._iir.MOSTAINE_MONCEF_CONTROLE1.dtos.LivreDTO;
import emsi._iir.MOSTAINE_MONCEF_CONTROLE1.models.Livre;
import emsi._iir.MOSTAINE_MONCEF_CONTROLE1.services.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class LivreController {
    @Autowired
    private LivreService livreService;

    @QueryMapping
    public List<Livre> listLivres() {
        return livreService.getBooks();
    }

    @QueryMapping
    public Livre getLivreById(@Argument Long id) {
        return livreService.getBookById(id);
    }

    @QueryMapping
    public List<Livre> getLivresPriceBetween(@Argument double a, @Argument double b) {
        return livreService.findLivresByPrixBetween(a,b);
    }
    @QueryMapping
    public List<Livre> getLivresByAutor(@Argument Long id) {
        return livreService.getByAuthor(id);
    }
    @MutationMapping
    public Livre addLivre(@Argument LivreDTO livre) {
        return livreService.createLivre(livre);
    }
    @MutationMapping
    public Livre updateEtudiant(@Argument LivreDTO livre,@Argument Long id) {
        return livreService.updateLivre(id,livre);
    }
    @MutationMapping
    public Boolean deleteEtudiant(@Argument Long id) {
        return livreService.deleteLivre(id);
    }
}


