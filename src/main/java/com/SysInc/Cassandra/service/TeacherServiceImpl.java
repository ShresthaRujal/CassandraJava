package com.SysInc.Cassandra.service;

import com.SysInc.Cassandra.dao.TeacherDao;
import com.SysInc.Cassandra.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    public List<Teacher> findAll() {
        return teacherDao.findAll();
    }

    public void save(Teacher teacher) {
        teacherDao.save(teacher);
    }
}
