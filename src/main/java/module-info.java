module studsluzba.common {
    exports org.raflab.studsluzbacommon.dto;
    exports org.raflab.studsluzbacommon.dto.request;
    exports org.raflab.studsluzbacommon.dto.response;

    opens org.raflab.studsluzbacommon.dto to com.fasterxml.jackson.databind;
    opens org.raflab.studsluzbacommon.dto.request to com.fasterxml.jackson.databind;
    opens org.raflab.studsluzbacommon.dto.response to com.fasterxml.jackson.databind;

    requires static lombok;
    requires transitive com.fasterxml.jackson.annotation;
}