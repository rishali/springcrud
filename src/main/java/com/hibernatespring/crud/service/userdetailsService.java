package com.hibernatespring.crud.service;

import com.hibernatespring.crud.entity.userdetails;
import com.hibernatespring.crud.repository.userdetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userdetailsService {
    @Autowired
    private userdetailsRepo repository;

    public userdetails saveUserdetail(userdetails user){
        return repository.save(user);
    }

    public List<userdetails> saveLogsaveUserdetailsinList(List<userdetails> users){
        return repository.saveAll(users);
    }

    public userdetails getUserdetailbyId(int id){
        return repository.findById(id).orElse(null);
    }

    public List<userdetails> getAllUserdetails(){
        return repository.findAll();
    }

    public userdetails getUserdetailbyName(String name){
        return repository.findByName(name);
    }

    public String deleteUserDetailbyId(int id){
        repository.deleteById(id);
        return "product removed : "+id;
    }

    public userdetails updateUserdetails(userdetails user){
        userdetails existingUserdetail=repository.findById(user.getId()).orElse(null);
      //  existingUserdetail.setId(user.getId());
        existingUserdetail.setLoginid(user.getLoginid());
        existingUserdetail.setName(user.getName());
        existingUserdetail.setAddress(user.getAddress());
        existingUserdetail.setContactno(user.getContactno());
        existingUserdetail.setType(user.getType());
       return repository.save(existingUserdetail);
    }

}
