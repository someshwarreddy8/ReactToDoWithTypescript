package com.kairos.controller;

import com.kairos.Entity.Admin;
import com.kairos.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("addAdmin")
    public ResponseEntity<String> addAdmin(@RequestBody Admin admin) {

        adminService.addAdmin(admin);

        return new ResponseEntity<>("Admin added.", HttpStatus.OK);
    }

    @GetMapping("getAdminList")
    public ResponseEntity<ArrayList<Admin>> getAdminList() {

        ArrayList<Admin> admins = new ArrayList<>();

        admins = adminService.getAdmins();

        return new ResponseEntity<>(admins, HttpStatus.OK);
    }
}
