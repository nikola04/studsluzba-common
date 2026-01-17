package org.raflab.studsluzbacommon.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class IspitPrijavaResponse {
    private Long id;
    private LocalDate datumPrijave;
    private IspitResponse ispit;
    private StudentIndeksResponseDTO studentIndeks;
    private IspitIzlazakResponse ispitIzlazak;
}
