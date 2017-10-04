package com.SysInc.Cassandra.repo;

import com.SysInc.Cassandra.model.Teacher;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface TeacherRepository extends CassandraRepository<Teacher,Long>{
}
