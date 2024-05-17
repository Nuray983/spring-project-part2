package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO implements Serializable {
    private Long id;
    private String studentName;
    private String studentSurname;
    private String phone;
    private int age;
    private GroupShortInfoDTO groupId;
}
