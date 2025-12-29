package org.raflab.studsluzbacommon.dto.request;

import lombok.Data;
import java.time.LocalDate;

@Data
public class StudentIndeksRequest {
    private Integer godina;
    private Long studProgramId;
    private Long nacinFinansiranjaId;
    private Boolean aktivan;
    private LocalDate vaziOd;
}