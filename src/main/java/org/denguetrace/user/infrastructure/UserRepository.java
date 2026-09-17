package org.denguetrace.user.infrastructure;

import org.denguetrace.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
