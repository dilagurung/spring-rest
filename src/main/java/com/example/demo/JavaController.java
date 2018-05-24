package com.example.demo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cy.entity.Company;
import com.cy.entity.CompanyImage;
import com.cy.entity.EducationalDetails;
import com.cy.entity.ExperienceDetails;
import com.cy.entity.Job;
import com.cy.entity.JobLocation;
import com.cy.entity.JobPostActivity;
import com.cy.entity.JobPostSkills;
import com.cy.entity.JobType;
import com.cy.entity.SeekerProfile;
import com.cy.entity.SeekerSkills;
import com.cy.entity.Skills;
import com.cy.entity.Student;
import com.cy.entity.User;
import com.cy.entity.UserLog;
import com.cy.entity.UserType;
import com.job.service.CompanyImageService;
import com.job.service.CompanyService;
import com.job.service.EducationalDetailsService;
import com.job.service.ExperienceDetailsService;
import com.job.service.JobLocationService;
import com.job.service.JobPostActivityService;
import com.job.service.JobPostSkillsService;
import com.job.service.JobService;
import com.job.service.JobTypeService;
import com.job.service.SeekerProfileService;
import com.job.service.SeekerSkillsService;
import com.job.service.SkillsService;
import com.job.service.UserLogService;
import com.job.service.UserService;
import com.job.service.UserTypeService;


@RestController
public class JavaController {

    @Autowired
    CompanyService companyService;
    @Autowired
    UserService userService;
    @Autowired
    JobService jobService;
    @Autowired
    SeekerProfileService seekerprofileService;
    @Autowired
    ExperienceDetailsService experiencedetailsService;
    @Autowired
    EducationalDetailsService educationaldetailsService;
    @Autowired
    SeekerSkillsService seekerskillsService;
    @Autowired
    UserTypeService usertypeService;
    @Autowired
    UserLogService userlogService;
    @Autowired
    SkillsService skillsService;
    @Autowired
    JobPostSkillsService jobpostskillsService;
    @Autowired
    JobLocationService joblocationService;
    @Autowired
    JobTypeService jobtypeService;
    @Autowired
    JobPostActivityService jobpostactivityService;
    @Autowired
    CompanyImageService companyimageService;
    
	@RequestMapping("/greeting") 
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) 
    {
    	Student student=new Student(1l,"dfdf");
        student.setId(1l);
        student.setName("hello");
   // 	studentRepository.save(student);
     	return name;
     	
     	
     	
     	
    }
	
	
	
	
	@RequestMapping(method=RequestMethod.POST,value="/student")
	public ResponseEntity<?> SaveCompany(@RequestBody Company company)
	{
		companyService.save	(company);
		return ResponseEntity.ok(1);
		
		
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/user")
	public ResponseEntity<?> SaveUser(@RequestBody User user)
	{
		userService.save(user);
		return ResponseEntity.ok(1);
	}

	@RequestMapping(value="/job",method=RequestMethod.POST)
	public ResponseEntity<Job> Save(@RequestBody Job job)
	{
		Job job1=job;
		User user=job.getUser();
		job1.setUser(user);
		jobService.save(job1);
		return new ResponseEntity<Job>(job,HttpStatus.OK);
		
	}
	@RequestMapping(method=RequestMethod.POST,value="/seekerprofile")
	public ResponseEntity<?> Save(@RequestBody SeekerProfile seekerprofile)
	{
		seekerprofileService.save(seekerprofile);
		return ResponseEntity.ok(1);
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/experiencedetails")
	public ResponseEntity<?> Save(@RequestBody ExperienceDetails experiencedetails){
		experiencedetailsService.save(experiencedetails);
		return ResponseEntity.ok(1);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/educationaldetails")
	public ResponseEntity<?> Save(@RequestBody EducationalDetails educationaldetails){
		educationaldetailsService.save(educationaldetails);
		return ResponseEntity.ok(1);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/seekerskill")
	public ResponseEntity<?> Save(@RequestBody SeekerSkills seekerskills){
		seekerskillsService.save(seekerskills);
		return ResponseEntity.ok(1);
			}
	@RequestMapping(method=RequestMethod.POST,value="/usertype")
	public ResponseEntity<?> Save(@RequestBody UserType usertype){
		usertypeService.save(usertype);
		return ResponseEntity.ok(1);
			}
	@RequestMapping(method=RequestMethod.POST,value="/userlog")
	public ResponseEntity<?> Save(@RequestBody UserLog userlog){
		userlogService.save(userlog);
		return ResponseEntity.ok(1);
			}
	
	@RequestMapping(method=RequestMethod.POST,value="/skills")
	public ResponseEntity<?> Save(@RequestBody Skills skills){
		skillsService.save(skills);
		return ResponseEntity.ok(1);
			}
	@RequestMapping(method=RequestMethod.POST,value="/jobpostskills")
	public ResponseEntity<?> Save(@RequestBody JobPostSkills jobpostskills){
		jobpostskillsService.save(jobpostskills);
		return ResponseEntity.ok(1);
			}
	
	@RequestMapping(method=RequestMethod.POST,value="/joblocation")
	public ResponseEntity<?> Save(@RequestBody JobLocation joblocation){
		joblocationService.save(joblocation);
		return ResponseEntity.ok(1);
			}
	@RequestMapping(method=RequestMethod.POST,value="/jobtype")
	public ResponseEntity<?> Save(@RequestBody JobType jobtype){
		jobtypeService.save(jobtype);
		return ResponseEntity.ok(1);
			}
	@RequestMapping(method=RequestMethod.POST,value="/jobpostactivity")
	public ResponseEntity<?> Save(@RequestBody JobPostActivity jobpostactivity){
		jobpostactivityService.save(jobpostactivity);
		return ResponseEntity.ok(1);
			}
	@RequestMapping(method=RequestMethod.POST,value="/companyimage")
	public ResponseEntity<?> Save(@RequestBody CompanyImage companyimage){
		companyimageService.save(companyimage);
		return ResponseEntity.ok(1);
	}
	@RequestMapping(method=RequestMethod.GET,value="/job")
	public ResponseEntity<?> getJob(){
	List<Job> jobList=	jobService.findAll();
	return ResponseEntity.ok(jobList);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/job/{id}")
	public ResponseEntity<?> deleteJob(@PathVariable Long id){
		jobService.delete(new Long (id));
		return ResponseEntity.ok(true);
	}
		
		
	
}