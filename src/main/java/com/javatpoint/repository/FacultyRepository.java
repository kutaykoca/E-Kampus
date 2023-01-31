package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;
import com.javatpoint.model.Faculty;
public interface FacultyRepository extends CrudRepository<Faculty, Integer>
{
}
