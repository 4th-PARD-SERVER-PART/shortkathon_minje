package com.example.pelican.info.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

public class InfoRequest {

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class createInfo {
        private String infoType1;
        private String infoType2;
        private List<String> infoHobby;
        private String wantType1;
        private String wantType2;
        private List<String> wantHobby;
    }

    @Getter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PatchInfo {
        private Long infoId;
        private String infoType1;
        private String infoType2;
        private List<String> infoHobby;
        private String wantType1;
        private String wantType2;
        private List<String> wantHobby;
    }
}
