package com.example.redmedicine.controller;

import com.example.redmedicine.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/*")
@RequiredArgsConstructor
public class AdmianController {

    @Autowired
    AdminService adminService;

    // 회원정보 관리
    @GetMapping("/memberShipMm")
    public String showMemberShipMm(Model model){
        model.addAttribute("userList", adminService.findAll());
        return "admin/memberShipMm";
    }
}
