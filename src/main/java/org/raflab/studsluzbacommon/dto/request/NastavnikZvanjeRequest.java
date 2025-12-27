package org.raflab.studsluzbacommon.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class NastavnikZvanjeRequest {
    private LocalDate datumIzbora;
    private Long naucnaOblastId;
    private Long uzaNaucnaOblastId;
    private Long zvanjeId;
    private Boolean aktivno;
}