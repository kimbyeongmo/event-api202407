package com.study.event.api.event.dto.response;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@Builder
public class LoginResponseDto {

    private String email;

    private String role; // 권한 정도

    private String token; // 인증 토큰

}
