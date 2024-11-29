package com.vrvs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrvs.entity.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
