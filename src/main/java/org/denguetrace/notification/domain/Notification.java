package org.denguetrace.notification.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.denguetrace.alert.domain.Alert;
import org.denguetrace.user.domain.User;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Notification {
    @Id
    Long notificationId;
    User userId;
    Alert  alertId;
    enum channel{
        push,
        email,
        sms
    }
    enum cause{
        residenciaDistrito,
        ubicationTiempoReal
    }
    Timestamp fechaEnvio;
}
