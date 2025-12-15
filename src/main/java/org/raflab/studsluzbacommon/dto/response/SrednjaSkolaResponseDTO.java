package org.raflab.studsluzbacommon.dto.response;

import lombok.Data;

@Data
public class SrednjaSkolaResponseDTO {
    private Long id;

    private String naziv;
    private String mesto;
    private TipSkoleResponseDTO tipSkole;
}
