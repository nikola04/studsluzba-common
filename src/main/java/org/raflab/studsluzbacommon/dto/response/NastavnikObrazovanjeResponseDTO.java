package org.raflab.studsluzbacommon.dto.response;

import lombok.Data;

@Data
public class NastavnikObrazovanjeResponseDTO {
    private Long id;

    private NastavnikResponseDTO nastavnik;

    private VisokoskolskaUstanovaResponseDTO visokoskolskaUstanova;

    private VrstaStudijaResponseDTO vrstaStudija;
}
