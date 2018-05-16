package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cy.entity.Student;
import service.StudentService;

@RestController
public class JavaController {

	@Autowired	
	StudentService studentRepository;
    
    
	@RequestMapping("/greeting") 
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) 
    {
    	Student student=new Student(1l,"dfdf");
        student.setId(1l);
        student.setName("hello");
    	studentRepository.save(student);
     	return "hellor";
    }
}