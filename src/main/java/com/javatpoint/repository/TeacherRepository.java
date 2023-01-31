package com.javatpoint.repository;
import com.javatpoint.model.Teacher;
import org.springframework.data.repository.CrudRepository;
public interface TeacherRepository extends CrudRepository<Teacher, Integer>
{
}
