package com.SysInc.Cassandra.dao;

import com.SysInc.Cassandra.model.Teacher;

import java.util.List;

public interface TeacherDao {
    List<Teacher> findAll();
    void save(Teacher teacher);
}
