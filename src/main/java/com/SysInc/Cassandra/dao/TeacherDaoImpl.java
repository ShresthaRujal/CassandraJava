package com.SysInc.Cassandra.dao;

import com.SysInc.Cassandra.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeacherDaoImpl implements TeacherDao {

    @Autowired
    private CassandraOperations cassandraTemplate;

    public List<Teacher> findAll() {
        return cassandraTemplate.select("select * from teacher",Teacher.class);
    }

    public void save(Teacher teacher) {
        cassandraTemplate.insert(teacher);
    }
}
