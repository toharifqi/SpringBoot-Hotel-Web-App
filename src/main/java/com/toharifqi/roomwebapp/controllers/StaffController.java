package com.toharifqi.roomwebapp.controllers;

import com.toharifqi.roomwebapp.services.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staffs")
public class StaffController {
    @GetMapping
    public String getAllStaffs(Model model) {
        model.addAttribute("staffs", StaffService.getStaffs());
        return "staffs";
    }
}
