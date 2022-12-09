package com.hibernatespring.crud.repository;

import com.hibernatespring.crud.entity.permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface permissionRepo extends JpaRepository<permission,Integer> {
}
