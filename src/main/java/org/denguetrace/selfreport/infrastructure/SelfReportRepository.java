package org.denguetrace.selfreport.infrastructure;

import org.denguetrace.selfreport.domain.SelfReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SelfReportRepository extends JpaRepository<SelfReport, Long> {
}
