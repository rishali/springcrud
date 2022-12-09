package com.hibernatespring.crud.controller;

import com.hibernatespring.crud.entity.login;
import com.hibernatespring.crud.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class loginController {

    @Autowired
    private loginService service;

    @PostMapping("/addLogin")
    public  login addLogin(@RequestBody login log){
        return service.saveLogin(log);
    }

    // {
//     "id":130,
//     "password":"abc",
//     "activestatus":"no"
//

    @PostMapping("/addLoginDetails")
    public List<login> addLoginDetails(@RequestBody List<login> logins){
        return service.saveLoginLists(logins);
    }

    @GetMapping("/findLoginDetailbyId/{id}")
    public login findLoginDetailbyId(@PathVariable  int id){
        return service.getLoginbyId(id);
    }

    @GetMapping("/findAllLoginDetail")
    public List<login> findAllLoginDetail(){
        return service.getAllLogin();
    }

    @PutMapping("/updateLogin")
    public  login updateLogin(@RequestBody login log){
        return service.updateLogin(log);
    }

    @DeleteMapping("/deleteLogin/{id}")
    public String deleteLogin(@PathVariable int id){
        return service.deleteLoginbyId(id);
    }


}
