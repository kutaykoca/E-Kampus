package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;
import com.javatpoint.model.StudentAffairs;

public interface StudentAffairsRepository extends CrudRepository<StudentAffairs, Integer>
{
}
