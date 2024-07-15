package com.study.event.api.event.dto.request;

import lombok.*;
import org.apache.el.util.Validation;

@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginRequestDto {

    private String email;
    private String password;

    // 자동 로그인 여부 ,,,
}
