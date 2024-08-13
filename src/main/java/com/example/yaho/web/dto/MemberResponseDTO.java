package com.example.yaho.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class MemberResponseDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class memberProfileDTO {
        private Long memberId;
        private String nickName;
        private String profileImgUrl;
    }
}