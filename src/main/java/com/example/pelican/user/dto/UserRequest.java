package com.example.pelican.user.dto;

import com.example.pelican.info.entity.Info;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

public class UserRequest {
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserCreateRequest{
        private String name;
        private String context;
        private List<Info> infos;
    }
}
