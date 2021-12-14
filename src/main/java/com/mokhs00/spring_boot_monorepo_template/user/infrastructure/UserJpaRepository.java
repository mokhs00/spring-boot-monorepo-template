package com.mokhs00.spring_boot_monorepo_template.user.infrastructure;

import com.mokhs00.spring_boot_monorepo_template.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserJpaRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String username);

    Optional<User> findById(Long userId);
}
