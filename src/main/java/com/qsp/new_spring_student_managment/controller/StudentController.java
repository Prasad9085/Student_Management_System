package com.qsp.new_spring_student_managment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.new_spring_student_managment.dao.StudentDao;
import com.qsp.new_spring_student_managment.dto.Student;
import com.qsp.new_spring_student_managment.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;

	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}

	@GetMapping("/find")
	public Student getStudent(@RequestParam int id) {
		return service.getStudent(id);

	}

	@GetMapping("/findAll")
	public List<Student> getAll() {
		return service.getAll();

	}

	@DeleteMapping("/delete/{id}")
	public Student deleteStudent(@PathVariable int id) {
		return service.deleteStudent(id);

	}

	@PutMapping("/updateStudent")
	public Student updateById(@RequestParam int id, @RequestBody Student student) {

		return service.updateById(id, student);

	}

	@PatchMapping("/updateEmail/{id}/{email}")
	public Student updateEmail(@PathVariable int id, @PathVariable String email) {
		return service.updateEmail(id, email);
	}

	@PatchMapping("/updateAddress")
	public Student updateAddress(@RequestParam int id, @RequestParam String address) {
		return service.updateAddress(id, address);
	}

	@PatchMapping("/updateName")
	public Student updateName(@RequestParam int id, @RequestParam String name) {
		return service.updateName(id, name);
	}

	@PatchMapping("/updatePhone")
	public Student updatePhone(@RequestParam int id, @RequestParam long phone) {
		return service.updatePhone(id, phone);

	}

	@PatchMapping("/updateSecuredMarks")
	public Student updateSecuredMarks(@RequestParam int id, @RequestParam double securedMarks) {
		return service.updateSecuredMarks(id, securedMarks);

	}

	@GetMapping("/findByAddress/{address}")
	public List<Student> findByAddress(@PathVariable String address) {
		return service.findByAddress(address);

	}

	@GetMapping("/findByEmail")
	public Student findByEmail(@RequestParam String email) {
		return service.findByEmail(email);

	}

	@GetMapping("/findByName")
	public List<Student> findByName(@RequestParam String name) {
		return service.findByName(name);

	}

	@GetMapping("/findByPhone")
	public Student findByPhone(@RequestParam long phone) {
		return service.findByPhone(phone);

	}

	@GetMapping("/findByGrade")
	public List<Student> findByGrade(@RequestParam String grade) {
		return service.findByGrade(grade);

	}

	@GetMapping("/percentageLessThan")
	public List<Student> getEmployeeByPercentageLessThan(@RequestParam double percentage) {
		return service.getEmployeeByPercentageLessThan(percentage);

	}

	@GetMapping("/percentageGreaterThan")
	public List<Student> getEmployeeByPercentageGreaterThan(double percentage) {
		return service.getEmployeeByPercentageGreaterThan(percentage);

	}

	@GetMapping("/studentPercentageBetween")
	public List<Student> studentPercentageBetween(@RequestParam double percentage1, @RequestParam double percentage2) {
		return service.studentPercentageBetween(percentage1, percentage2);
	}
}
