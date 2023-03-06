package com.toharifqi.roomwebapp.controllers;

import com.toharifqi.roomwebapp.models.StaffMember;
import com.toharifqi.roomwebapp.services.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staffs")
public class StaffRestController {

    private StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffMember> getStaffs() {
        return staffService.getStaffs();
    }
}
