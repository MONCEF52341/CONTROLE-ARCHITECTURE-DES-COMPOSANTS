package emsi._iir.MOSTAINE_MONCEF_CONTROLE1.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String titre;
    Double prix;
    @ManyToOne
    @JoinColumn(name = "auteur_id")
    private Auteur auteurId;
}
