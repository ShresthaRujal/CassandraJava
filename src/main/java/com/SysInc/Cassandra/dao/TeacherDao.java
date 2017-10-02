package com.SysInc.Cassandra.dao;

import com.SysInc.Cassandra.model.Teacher;

import java.util.List;

public interface TeacherDao {
    public List<Teacher> findAll();
    public void save(Teacher teacher);
}
