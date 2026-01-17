package org.raflab.studsluzbacommon.dto.request;

import lombok.Data;

@Data
public class IspitIzlazakRequest {
    private Double brojPoena;
    private String napomena; // can be null
    private Boolean ponisten;
}
