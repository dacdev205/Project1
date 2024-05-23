package com.example.project1.controller;

import com.example.project1.enity.SinhVien;
import com.example.project1.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    SinhVienService sinhVienService;

    @GetMapping
    public List<SinhVien> getSinhVien() {
        return sinhVienService.getAllSinhVien();
    }


}
