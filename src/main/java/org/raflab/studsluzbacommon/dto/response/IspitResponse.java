package org.raflab.studsluzbacommon.dto.response;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class IspitResponse {
    private Long id;
    private NastavnikResponseDTO nastavnik;
    private LocalDate datumOdrzavanja;
    private LocalTime vremePocetka;
    private Boolean zakljucen;
    private PredmetResponse predmet;
    private IspitniRokResponse ispitniRok;
}
