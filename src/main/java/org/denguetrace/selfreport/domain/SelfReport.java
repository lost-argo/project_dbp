package org.denguetrace.selfreport.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.denguetrace.district.domain.District;
import org.denguetrace.user.domain.User;
import org.springframework.boot.jackson.autoconfigure.JacksonProperties;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class SelfReport {
    @Id
    Long reportId;
    User userId;
    District districtId;
    String symptoms;
    Timestamp symptomsDate;
    enum Severity{
        Leve,
        Moderado,
        Grave
    }
    enum state{
        Pendiente,
        Valido,
        Descartado
    }
    Double trustWeight;
}
