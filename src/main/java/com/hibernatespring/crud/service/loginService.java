package com.hibernatespring.crud.service;

import com.hibernatespring.crud.entity.login;
import com.hibernatespring.crud.repository.loginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class loginService {

    @Autowired
    private loginRepo repository;

    public login saveLogin(login log){
        return repository.save(log);
    }

    public List<login> saveLoginLists(List<login> logins){
        return repository.saveAll(logins);
    }

    public login getLoginbyId(int id){
        return repository.findById(id).orElse(null);
    }

    public List<login> getAllLogin(){
        return repository.findAll();
    }

//    public login getLoginbyName(String name){
//        return repository.findByName(name);
//    }

    public String deleteLoginbyId(int id){
        repository.deleteById(id);
        return "product removed : "+id;
    }

    public login updateLogin(login log){
        login existinglogin=repository.findById(log.getId()).orElse(null);
      //  existinglogin.setId(log.getId());
        existinglogin.setPassword(log.getPassword());
        existinglogin.setActivestatus(log.getActivestatus());
        return repository.save(existinglogin);
    }
}
