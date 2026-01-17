package org.raflab.studsluzbacommon.dto.response;

import lombok.Data;

@Data
public class IspitRezultatResponse {
    private StudentIndeksResponseDTO studentIndeks;
    private Double brojPoenaUkupno;
    private Double brojPoenaIspit;
    private Double brojPoenaPredispitne;
}