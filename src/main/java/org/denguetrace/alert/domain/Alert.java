package org.denguetrace.alert.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.denguetrace.district.domain.District;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Alert {
    @Id
    Long alertId;
    District districtId;
    enum level{
        verde,
        amarillo,
        naranja,
        rojo
    }
    Double caseAverage;
    Double thresholdAverage;
    Timestamp startDate;
    Timestamp endDate;
    boolean active;
}
