package com.javatpoint.repository;
import com.javatpoint.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Integer>
{
}
