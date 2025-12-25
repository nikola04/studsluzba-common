package org.raflab.studsluzbacommon.dto.response;

import lombok.Data;

@Data
public class SkolskaGodinaResponseDTO {
    private Long id;
    private Integer godina;
    private Boolean aktivan;

    @Override
    public String toString() {
        return godina.toString();
    }
}
