package com.hibernatespring.crud.service;

import com.hibernatespring.crud.entity.permission;
import com.hibernatespring.crud.repository.permissionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class permissionService {

    @Autowired
    private permissionRepo repository;

    public permission savePermissionDetail(permission perm){
        return repository.save(perm);
    }

    public List<permission> savePermissionDetailLists(List<permission> perm){
        return repository.saveAll(perm);
    }

    public permission getPermissionDetailbyId(int id){
        return repository.findById(id).orElse(null);
    }

    public List<permission> getAllPermissionDetails(){
        return repository.findAll();
    }

    public String deletePermissionDetailbyId(int id){
        repository.deleteById(id);
        return "product removed : "+id;
    }

    public permission updatePermissionDetail(permission perm){
        permission existingPermissionDetail=repository.findById(perm.getId()).orElse(null);
        existingPermissionDetail.setUserid(perm.getUserid());
        existingPermissionDetail.setPermissionlevel(perm.getPermissionlevel());
        return repository.save(existingPermissionDetail);
    }

}
