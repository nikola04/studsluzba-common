package org.raflab.studsluzbacommon.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponseDTO {
    private Long id;
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
    private String privatniEmail;
    private String fakultetEmail;
    private String brojLicneKarte;
    private String licnuKartuIzdao;
    private String mestoStanovanja;
    private String adresaStanovanja;
    private Double uspehPrijemni;
    private Double uspehSrednjaSkola;
    private Long srednjaSkolaId;
    private SrednjaSkolaResponseDTO srednjaSkola;
    private VisokoskolskaUstanovaResponseDTO visokoskolskaUstanova;
}
