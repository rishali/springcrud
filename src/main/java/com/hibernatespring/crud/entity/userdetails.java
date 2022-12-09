package com.hibernatespring.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="userdetails")
public class userdetails {

    @Id
    @GeneratedValue
    int id;
    int loginid;
    String name;
    String address;
    String contactno;
    String type; // admin/user
}
