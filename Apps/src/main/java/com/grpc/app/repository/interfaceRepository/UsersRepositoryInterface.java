package com.grpc.app.repository.interfaceRepository;

import com.grpc.app.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;
import java.util.UUID;
public interface UsersRepositoryInterface extends JpaRepository<Users, UUID> {
    Optional<Users> findByUserName(String username);
}
