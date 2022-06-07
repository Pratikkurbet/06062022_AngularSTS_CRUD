package com.crud.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.main.model.Employee;
import com.crud.main.repository.CrudRepositories;
import com.crud.main.service.CrudService;

@Service
public class CrudServiceImpl implements CrudService
{
	@Autowired
	private CrudRepositories cr;

	@Override
	public Employee saveEmp(Employee emp) {
		return cr.save(emp);		
	}

	@Override
	public List<Employee> findAllEmployee() {
		return (List<Employee>)cr.findAll();
	}

	@Override
	public Employee getEmpbyId(int id) {
		return cr.findById(id);
	}

	@Override
	public void delete(int id) {
		cr.deleteById(id);
	}
	
}
