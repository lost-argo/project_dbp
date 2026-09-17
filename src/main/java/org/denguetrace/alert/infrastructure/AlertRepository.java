package org.denguetrace.alert.infrastructure;

import org.denguetrace.alert.domain.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alert, Long> {
}
