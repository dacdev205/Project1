package com.example.project1.service;

import com.example.project1.enity.SinhVien;
import com.example.project1.repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhVienService {

 @Autowired
 SinhVienRepository sinhVienRepository;

 public List<SinhVien> getAllSinhVien() {
     return sinhVienRepository.findAll();
 }


}
