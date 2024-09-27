package com.grpc.app.repository.interfaceRepository;

import com.grpc.app.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;
public interface RolesRepositoryInterface extends JpaRepository<Roles, UUID> {
}
