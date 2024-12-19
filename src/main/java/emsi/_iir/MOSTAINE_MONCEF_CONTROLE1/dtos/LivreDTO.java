package emsi._iir.MOSTAINE_MONCEF_CONTROLE1.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public record LivreDTO (String titre,
                        Double prix,
                        Long auteurId) {
}
