package org.raflab.studsluzbacommon.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentIndeksResponseDTO {
    private Long id;
    private Integer broj;
    private Integer godina;
    private NacinFinansiranja nacinFinansiranja;
    private Boolean aktivan;
    private LocalDate vaziOd;
    private StudijskiProgramResponseDTO studijskiProgram;
    private Integer ostvarenoEspb;
    private StudentResponseDTO student;
}