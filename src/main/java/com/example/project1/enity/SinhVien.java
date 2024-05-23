package com.example.project1.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "student",schema = "thuctap")
public class SinhVien {
    @Id
    private int id;
    private String name;

}
