package org.raflab.studsluzbacommon.dto.request;

import lombok.Data;
@Data
public class StudijskiProgramRequest {
    private String oznaka;
    private String naziv;
    private Integer godinaAkreditacije;
    private String zvanje;
    private Integer trajanjeGodina;
    private Integer trajanjeSemestara;
    private Long vrstaStudija;
    private Integer ukupnoEspb;
}
