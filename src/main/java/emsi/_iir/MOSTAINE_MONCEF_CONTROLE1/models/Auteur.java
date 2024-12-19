package emsi._iir.MOSTAINE_MONCEF_CONTROLE1.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Auteur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String nom;
    @OneToMany(mappedBy = "auteurId")
    List<Livre> listLivre;


}
