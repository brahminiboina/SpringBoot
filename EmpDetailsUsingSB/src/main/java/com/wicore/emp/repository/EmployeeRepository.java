package com.wicore.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wicore.emp.bean.Employee;
 
 
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
 
}
