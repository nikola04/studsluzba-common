package org.raflab.studsluzbacommon.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NastavnikResponseDTO {
    @NonNull
    private Long id;
    @NonNull
    private String ime;
    private String prezime;
    private String srednjeIme;
    private String email;
    private String brojTelefona;
    private String adresa;
    private Set<NastavnikZvanjeResponseDTO> zvanja;
    private Set<NastavnikObrazovanjeResponseDTO> obrazovanja;

    private LocalDate datumRodjenja;
    private Character pol;
    private String jmbg;
}
