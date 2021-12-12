package com.mokhs00.spring_boot_monorepo_template.user.domain;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByEmail(String email);

    Optional<User> findById(Long userId);

    Long save(User user);
}
