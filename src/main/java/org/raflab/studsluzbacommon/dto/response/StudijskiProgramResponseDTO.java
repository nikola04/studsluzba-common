package org.raflab.studsluzbacommon.dto.response;

import lombok.Data;

@Data
public class StudijskiProgramResponseDTO {
    private Long id;
    private String oznaka;
    private String naziv;
    private Integer godinaAkreditacije;
    private String zvanje;
    private Integer trajanjeGodina;
    private Integer trajanjeSemestara;
    private VrstaStudijaResponseDTO vrstaStudija;
    private Integer ukupnoEspb;
    private Long predmetiSize;
}