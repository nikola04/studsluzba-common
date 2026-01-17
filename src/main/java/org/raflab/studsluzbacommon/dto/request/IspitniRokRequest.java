package org.raflab.studsluzbacommon.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class IspitniRokRequest {
    private LocalDate pocetak;
    private LocalDate kraj;

    private Long skolskaGodinaId;
}
