package org.denguetrace.user.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRequestDto {
    private String name;
    private String email;
    private String password;
    private Long distritoResidenciaId;

    public UserRequestDto() {}

    public UserRequestDto(String name, String email, String password, Long distritoResidenciaId) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.distritoResidenciaId = distritoResidenciaId;
    }
}
