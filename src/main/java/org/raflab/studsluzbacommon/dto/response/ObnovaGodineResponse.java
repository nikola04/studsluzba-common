package org.raflab.studsluzbacommon.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ObnovaGodineResponse {
    private Long id;

    private Integer godina;
    private LocalDate datumObnove;
    private String napomena;

    private SkolskaGodinaResponseDTO skolskaGodina;
}
