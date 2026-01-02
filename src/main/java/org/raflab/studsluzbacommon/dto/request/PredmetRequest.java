package org.raflab.studsluzbacommon.dto.request;

import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
public class PredmetRequest {
        private String naziv;
        private Integer espb;
        private Boolean obavezan;
        private String opis; // can be null
        private String sifra;
        private Long studijskiProgramId;
        private Integer fondCasovaVezbe;
        private Integer fondCasovaPredavanja;
}
