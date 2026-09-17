package org.denguetrace.district.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class District {
    @Id
    Long districtId;
    String districtName;
    String department;
    Integer population;
    Double area;
    Double centerLat;
    Double centerLng;
}
