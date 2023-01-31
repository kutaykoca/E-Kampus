package com.javatpoint.repository;
import com.javatpoint.model.HumanResources;
import org.springframework.data.repository.CrudRepository;

public interface HumanResourcesRepository extends CrudRepository<HumanResources, Integer>
{
}
