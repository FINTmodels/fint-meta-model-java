// Built from tag feature-meta-model

package no.fint.model.metamodell;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.*;

import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.metamodell.kompleksedatatyper.Attributt;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Klasse implements FintMainObject {
    public enum Relasjonsnavn {
            PAKKE,
            RELASJONER,
            ARVER
    }

    @NonNull
    private Boolean abstrakt;
    @NonNull
    private List<Attributt> attributter;
    @NonNull
    private String dokumentasjon;
    @NonNull
    private Identifikator id;
    @NonNull
    private String navn;
    @NonNull
    private String stereotype;
}
