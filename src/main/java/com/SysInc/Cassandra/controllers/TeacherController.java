package com.SysInc.Cassandra.controllers;

import com.SysInc.Cassandra.model.Teacher;
import com.SysInc.Cassandra.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/teachers")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

        @GetMapping
        public ResponseEntity<Object> findAll(){
            System.out.println("rujal");
            return new ResponseEntity<Object>(teacherService.findAll(), HttpStatus.OK);
        }

        @PostMapping
        public ResponseEntity<Object> save(Teacher teacher){
            teacherService.save(teacher);
            return new ResponseEntity<Object>(HttpStatus.OK);
        }
}
