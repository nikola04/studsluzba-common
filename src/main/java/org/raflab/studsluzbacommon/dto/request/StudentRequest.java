package org.raflab.studsluzbacommon.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class StudentRequest {
    private String ime;
    private String prezime;
    private String srednjeIme;
    private String jmbg;
    private Integer godinaUpisa;
    private LocalDate datumRodjenja;
    private String mestoRodjenja;
    private String mestoPrebivalista;
    private String drzavaRodjenja;
    private String drzavljanstvo;
    private String nacionalnost;
    private Character pol;
    private String adresa;
    private String brojTelefonaMobilni;
    private String brojTelefonaFiksni;
    private String fakultetEmail;
    private String privatniEmail;
    private String brojLicneKarte;
    private String licnuKartuIzdao;
    private String mestoStanovanja;
    private String adresaStanovanja;
    private Double uspehSrednjaSkola;
    private Double uspehPrijemni;
    private Long srednjaSkolaId;
    private Long visokoskolskaUstanovaId;
}
