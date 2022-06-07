package com.crud.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.main.model.Employee;
import com.crud.main.service.CrudService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class CrudController 
{
	@Autowired
	private CrudService cs;
	
	@PostMapping("/addEmp")
	public Employee addEmployee(@RequestBody Employee emp)
	{
		System.out.println("Employee added");
		return cs.saveEmp(emp);
	}
	
	@GetMapping("/list")
	public List<Employee> getAllList()
	{
		return cs.findAllEmployee();
	}
	
	@GetMapping("/singleEmp/{id}")
	public Employee getEmployee(@PathVariable("id") int id)
	{
		return cs.getEmpbyId(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmp(@PathVariable("id")int id)
	{
		cs.delete(id);
	}
	
	@PutMapping("/update")
	public Employee updateEmp(@RequestBody Employee emp)
	{
		Employee e = cs.getEmpbyId(emp.getId());
		
		e.setEname(emp.getEname());
		e.setEmail(emp.getEmail());
		e.setMobile(emp.getMobile());
		e.setDesignation(emp.getDesignation());
		e.setUsername(emp.getUsername());
		e.setPassword(emp.getPassword());
		return cs.saveEmp(e);
	}
}
