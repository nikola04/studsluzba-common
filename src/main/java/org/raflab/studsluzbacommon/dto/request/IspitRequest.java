package org.raflab.studsluzbacommon.dto.request;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class IspitRequest {
    private LocalDate datumOdrzavanja;
    private LocalTime vremePocetka;
    private Boolean zakljucen;

    private Long predmetId;
    private Long nastavnikId;
    private Long ispitniRokId;
}
