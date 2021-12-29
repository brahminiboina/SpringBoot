

  package com.wicore.SBPro.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wicore.SBPro.bean.Student;
 
 
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
 
}