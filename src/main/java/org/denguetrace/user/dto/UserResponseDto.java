package org.denguetrace.user.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class UserResponseDto {
    private Long id;
    private String name;
    private String email;
    private Long distritoResidenciaId;
    private boolean comparteUbicacion;
    private LocalDateTime registerDate;

    public UserResponseDto() {}

    public UserResponseDto(Long id, String name, String emial, Long distritoResidenciaId, boolean comparteUbicacion, LocalDateTime registerDate) {
        this.id = id;
        this.name = name;
        this.email = emial;
        this.distritoResidenciaId = distritoResidenciaId;
        this.comparteUbicacion = comparteUbicacion;
        this.registerDate = registerDate;
    }
}
