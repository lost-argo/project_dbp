package org.denguetrace.user.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class User {
    @Id
    Long id;
    String name;
    String email;
    String passwordHash;
    Long distritoResidenciaId;
    Double currentUbicationLat;
    Double currentUbicationLng;
    boolean sharesLocation;
    LocalDateTime registerDate;
    String notificationPreferences;
}