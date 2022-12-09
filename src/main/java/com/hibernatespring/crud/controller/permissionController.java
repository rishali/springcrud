package com.hibernatespring.crud.controller;

import com.hibernatespring.crud.entity.permission;
import com.hibernatespring.crud.service.permissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class permissionController {

    @Autowired
    private permissionService service;

    // {
//     "userid":3,
//     "permissionlevel":4
// }
    @PostMapping("/addPermissionDetail")
    public permission addPermissionDetail(@RequestBody permission perm){
        return service.savePermissionDetail(perm);
    }

    @PostMapping("/addPermissionDetails")
    public List<permission> addPermissionDetails(@RequestBody List<permission> perm){
        return service.savePermissionDetailLists(perm);
    }

    @GetMapping("/findPermissionDetailbyId/{id}")
    public permission findPermissionDetailbyId(@PathVariable int id){
        return service.getPermissionDetailbyId(id);
    }

    @GetMapping("/findAllPermissionDetail")
    public List<permission> findAllPermissionDetail(){
        return service.getAllPermissionDetails();
    }

    @PutMapping("/updatePermissionDetail")
    public  permission updatePermissionDetail(@RequestBody permission perm){
        return service.updatePermissionDetail(perm);
    }

    @DeleteMapping("/deletePermissionDetail/{id}")
    public String deletePermissionDetail(@PathVariable int id){
        return service.deletePermissionDetailbyId(id);
    }


}
