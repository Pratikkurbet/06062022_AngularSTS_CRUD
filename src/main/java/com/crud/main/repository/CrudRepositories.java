package com.crud.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.main.model.Employee;

@Repository
public interface CrudRepositories extends CrudRepository<Employee, Integer> 
{
	Employee findById(int id);
}
