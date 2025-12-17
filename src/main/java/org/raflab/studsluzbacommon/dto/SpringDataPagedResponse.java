package org.raflab.studsluzbacommon.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpringDataPagedResponse<T> {

    private List<T> content;
    @JsonProperty("page")
    private PageMetadata metadata;

    @Data
    public static class PageMetadata {
        private int size;
        private long totalElements;
        private int totalPages;
        private int number;
    }
}