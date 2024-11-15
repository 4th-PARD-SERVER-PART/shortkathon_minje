package com.example.pelican.info.dto;

import com.example.pelican.info.entity.Info;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class InfoResponse {
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class InfoReadResponse{
        private Long infoId;
        private String infoType1;
        private String infoType2;
        private List<String> infoHobby;
        private String wantType1;
        private String wantType2;
        private List<String> wantHobby;

        public static List<InfoReadResponse> infoToDto(List<Info> infos) {
            List<InfoReadResponse> ret = new ArrayList<>();
            for (Info info : infos) {
                InfoReadResponse response = InfoReadResponse.builder()
                        .infoId(info.getId())
                        .infoType1(info.getInfoType1())
                        .infoType2(info.getInfoType2())
                        .infoHobby(info.getInfoHobby())
                        .wantType1(info.getWantType1())
                        .wantType2(info.getWantType2())
                        .wantHobby(info.getWantHobby())
                        .build();
                ret.add(response);
            }
            return ret;
        }

    }
}
