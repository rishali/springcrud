package com.hibernatespring.crud.controller;

import com.hibernatespring.crud.entity.userdetails;
import com.hibernatespring.crud.service.userdetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userdetailsController {
    @Autowired
    private userdetailsService service;

    @PostMapping("/addUserdetail")
    public userdetails addUserdetail(@RequestBody userdetails user) {
        return service.saveUserdetail(user);
    }

    // {
//     "loginid":10,
//     "name":"abc",
//     "address":"london",
//    "contactno":"+44982392323",
//            "type":"admin"
//}


    @PostMapping("/addUserdetails")
    public List<userdetails> addUserdetails(@RequestBody List<userdetails> users){
        return service.saveLogsaveUserdetailsinList(users);
    }

    @GetMapping("/findUserDetailbyId/{id}")
    public userdetails findUserDetailbyId(@PathVariable int id){
        return service.getUserdetailbyId(id);
    }

    @GetMapping("/findAllUserDetail")
    public List<userdetails> findAllUserDetail(){
        return service.getAllUserdetails();
    }

    @PutMapping("/updateUserDetails")
    public  userdetails updateUserDetails(@RequestBody userdetails user){
        return service.updateUserdetails(user);
    }

    @DeleteMapping("/deleteUserDetails/{id}")
    public String deleteUserDetails(@PathVariable int id){
        return service.deleteUserDetailbyId(id);
    }


}
