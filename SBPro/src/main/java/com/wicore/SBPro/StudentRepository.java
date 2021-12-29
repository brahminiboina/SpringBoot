

  package com.wicore.SBPro;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

 
 
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	 @Query(value ="Select * from student s where s.course='adv.java'", nativeQuery=true) 
	   	public List<Student> findById() ;
 
}