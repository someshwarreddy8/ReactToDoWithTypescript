package com.kairos.service;

import com.kairos.Entity.Admin;
import com.kairos.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AdminService {

    @Autowired
    private AdminRepo adminRepo;

    public void addAdmin(Admin admin) {
        try {
            adminRepo.save(admin);
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while adding admin.", e);
        }
    }

    public ArrayList<Admin> getAdmins() {
        try {
            return (ArrayList<Admin>) adminRepo.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred while getting admin list", e);
        }
    }
}
