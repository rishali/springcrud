package com.hibernatespring.crud.repository;

import com.hibernatespring.crud.entity.login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface loginRepo extends JpaRepository<login,Integer> {
}
