package com.example.demo.controller;

import com.example.demo.entity.StudentDTO;
import com.example.demo.service.second.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Service2Controller {

    private final SecondService secondService;

    @Autowired
    public Service2Controller(SecondService secondService) {
        this.secondService = secondService;
    }


    @PutMapping("/updateStudent/{id}")
    public String updateStudents(@PathVariable Long id, @RequestBody StudentDTO studentDTO) {
        secondService.updateStudents(id, studentDTO);
        return "Student update request sent";
    }
}
