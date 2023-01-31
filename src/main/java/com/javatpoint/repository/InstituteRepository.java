package com.javatpoint.repository;
import org.springframework.data.repository.CrudRepository;
import com.javatpoint.model.Institute;
public interface InstituteRepository extends CrudRepository<Institute, Integer>
{
}
