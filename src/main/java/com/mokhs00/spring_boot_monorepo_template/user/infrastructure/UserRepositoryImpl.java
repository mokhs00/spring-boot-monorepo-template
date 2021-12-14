package com.mokhs00.spring_boot_monorepo_template.user.infrastructure;

import com.mokhs00.spring_boot_monorepo_template.user.domain.User;
import com.mokhs00.spring_boot_monorepo_template.user.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;

    @Override
    public Optional<User> findByEmail(String email) {
        return userJpaRepository.findByEmail(email);
    }

    @Override
    public Optional<User> findById(Long userId) {
        return userJpaRepository.findById(userId);
    }

    @Override
    public Long save(User user) {
        User save = userJpaRepository.save(user);
        return save.getId();
    }
}
