package com.hibernatespring.crud.repository;

import com.hibernatespring.crud.entity.userdetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userdetailsRepo extends JpaRepository<userdetails,Integer> {

    userdetails findByName(String name);
}
