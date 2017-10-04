package com.SysInc.Cassandra.service;

import com.SysInc.Cassandra.model.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> findAll();
    void save(Teacher teacher);

}
