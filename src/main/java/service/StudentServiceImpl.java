package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cy.entity.Student;

import repo.StudentRepository;
import service.StudentService;

@Service

public class StudentServiceImpl implements StudentService 
{
@Autowired
StudentRepository repo;
	
	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		repo.save(student);
	}

}
