package com.hibernatespring.crud.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data   // automatic getter and setter methods are generated using Lombok library
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="login")
public class login {

    @Id
    @GeneratedValue
    private int id;
    private String password ;
    private String activestatus;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="loginid")
    private userdetails user;
}
