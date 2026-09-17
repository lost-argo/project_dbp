package org.denguetrace.news.infrastructure;

import org.denguetrace.news.domain.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News,Long> {
}
