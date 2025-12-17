package org.raflab.studsluzbacommon.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class NastavnikZvanjeResponseDTO {
    private Long id;
    private LocalDate datumIzbora;

    private NaucnaOblastResponseDTO naucnaOblast;
    private UzaNaucnaOblastResponseDTO uzaNaucnaOblast;

    private ZvanjeResponseDTO zvanje;
    private Boolean aktivno;
}
