package org.raflab.studsluzbacommon.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentRequest {
    private String ime;
    private String prezime;
    private String srednjeIme;
    private String jmbg;
    private LocalDate datumRodjenja;
    private String mestoRodjenja;
    private String drzavaRodjenja;
    private String drzavljanstvo;
    private String nacionalnost;
    private Character pol;
    private String brojTelefonaMobilni;
    private String fakultetEmail;
    private String privatniEmail;
    private String brojLicneKarte;
    private Integer godinaUpisa;
    private String mestoStanovanja;
    private String adresaStanovanja;
    private Double uspehSrednjaSkola;
    private Double uspehPrijemni;
    private Long srednjaSkolaId;
    private Long visokoskolskaUstanovaId;
}
