package com.wicore.emp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.wicore.emp.bean.Employee;
import com.wicore.emp.repository.EmployeeRepository;
@Service
public class EmployeeService {

	@Autowired
    private EmployeeRepository repo;
	
	public List<Employee> listAll() {
        return repo.findAll();
    }
     
    public void save(Employee emp) {
        repo.save(emp);
    }
     
    public Employee get(long emp_id) {
        
        return repo.findById(emp_id).get();
    }
     
    public void delete(long emp_id) {
        repo.deleteById(emp_id);
    }
 
}
