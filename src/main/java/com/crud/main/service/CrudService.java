package com.crud.main.service;

import java.util.List;

import com.crud.main.model.Employee;

public interface CrudService
{

	Employee saveEmp(Employee emp);

	List<Employee> findAllEmployee();

	Employee getEmpbyId(int id);

	void delete(int id);

}
