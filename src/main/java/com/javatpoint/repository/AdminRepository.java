package com.javatpoint.repository;

import com.javatpoint.model.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin, Integer>
{
}
