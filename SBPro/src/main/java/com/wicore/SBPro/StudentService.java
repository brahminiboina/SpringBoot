package com.wicore.SBPro;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
 
@Service
public class StudentService {
	
	@Autowired
    private StudentRepository repo;
	
	public List<Student> listAll() {
        return repo.findById();
    }
     
    public void save(Student std) {
        repo.save(std);
    }
     
    public Student get(long id) {
        return repo.findById(id).get();
    }
     
    public void delete(long id) {
        repo.deleteById(id);
    }
 
}