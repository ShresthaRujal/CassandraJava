package com.SysInc.Cassandra.service;

import com.SysInc.Cassandra.model.Teacher;

import java.util.List;

public interface TeacherService {

    public List<Teacher> findAll();
    public void save(Teacher teacher);

}
