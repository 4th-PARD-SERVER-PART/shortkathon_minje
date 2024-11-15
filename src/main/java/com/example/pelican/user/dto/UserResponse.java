package com.example.pelican.user.dto;

import com.example.pelican.info.dto.InfoResponse;
import com.example.pelican.info.entity.Info;
import com.example.pelican.user.entity.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

public class UserResponse {
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReadUser{
        private String name;
        private String context;
        private List<InfoResponse.InfoReadResponse> infos;

        public static ReadUser from(User user){
            return new ReadUser(user.getName(), user.getContext(),
                    InfoResponse.InfoReadResponse.infoToDto(user.getInfos()));
        }

    }
}
