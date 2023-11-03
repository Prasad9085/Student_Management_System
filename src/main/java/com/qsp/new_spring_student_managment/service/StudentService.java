package com.qsp.new_spring_student_managment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.qsp.new_spring_student_managment.dao.StudentDao;
import com.qsp.new_spring_student_managment.dto.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao dao;

	public Student saveStudent(Student student) {
		double percentage = ((student.getSecuredMarks() / 600.00) * 100);
		if (percentage <= 100 && percentage >= 75) {
			student.setGrade("First Class with Distinction");
			student.setPercentage(percentage);
		} else if (percentage < 75 && percentage >= 60) {
			student.setGrade("First Class");
			student.setPercentage(percentage);
		} else if (percentage < 60 && percentage >= 49) {
			student.setGrade("Second Class");
			student.setPercentage(percentage);
		} else if (percentage < 49 && percentage >= 35) {
			student.setGrade("Just Pass");
			student.setPercentage(percentage);
		} else if (percentage < 35 && percentage >= 0) {
			student.setGrade("Fail");
			student.setPercentage(percentage);
		} else {
			student.setGrade("Invalid percentage");
			student.setPercentage(percentage);
		}
		return dao.saveStudent(student);

	}

	public Student getStudent(@RequestParam int id) {
		return dao.getStudent(id);

	}

	public List<Student> getAll() {
		return dao.getAll();

	}

	public Student deleteStudent(@PathVariable int id) {
		return dao.deleteStudent(id);

	}

	public Student updateById(int id, Student student) {
		double percentage = ((student.getSecuredMarks() / 600.00) * 100);
		if (percentage <= 100 && percentage >= 75) {
			student.setGrade("First Class with Distinction");
			student.setPercentage(percentage);
		} else if (percentage < 75 && percentage >= 60) {
			student.setGrade("First Class");
			student.setPercentage(percentage);
		} else if (percentage < 60 && percentage >= 49) {
			student.setGrade("Second Class");
			student.setPercentage(percentage);
		} else if (percentage < 49 && percentage >= 35) {
			student.setGrade("Just Pass");
			student.setPercentage(percentage);
		} else if (percentage < 35 && percentage >= 0) {
			student.setGrade("Fail");
			student.setPercentage(percentage);
		} else {
			student.setGrade("Invalid percentage");
			student.setPercentage(percentage);
		}
		return dao.updateById(id, student);
	}

	public Student updateEmail(int id, String email) {
		return dao.updateEmail(id, email);
	}

	public Student updateAddress(int id, String address) {
		return dao.updateAddress(id, address);
	}

	public Student updateName(int id, String name) {
		return dao.updateName(id, name);
	}

	public Student updatePhone(int id, long phone) {
		return dao.updatePhone(id, phone);

	}

	public Student updateSecuredMarks(int id, double securedMarks) {

		Student student = dao.getStudent(id);
		double percentage = ((securedMarks / 600.00) * 100);
		if (percentage <= 100 && percentage >= 75) {
			student.setGrade("First Class with Distinction");
			student.setPercentage(percentage);
		} else if (percentage < 75 && percentage >= 60) {
			student.setGrade("First Class");
			student.setPercentage(percentage);
		} else if (percentage < 60 && percentage >= 49) {
			student.setGrade("Second Class");
			student.setPercentage(percentage);
		} else if (percentage < 49 && percentage >= 35) {
			student.setGrade("Just Pass");
			student.setPercentage(percentage);
		} else if (percentage < 35 && percentage >= 0) {
			student.setGrade("Fail");
			student.setPercentage(percentage);
		} else {
			student.setGrade("Invalid percentage");
			student.setPercentage(percentage);
		}
		return dao.saveStudent(student);

	}

	public List<Student> findByAddress(String address) {
		return dao.findByAddress(address);

	}

	public Student findByEmail(String email) {
		return dao.findByEmail(email);

	}

	public List<Student> findByName(String name) {
		return dao.findByName(name);

	}

	public Student findByPhone(long phone) {
		return dao.findByPhone(phone);

	}

	public List<Student> getEmployeeByPercentageLessThan(double percentage) {
		return dao.getEmployeeByPercentageLessThan(percentage);
	}

	public List<Student> getEmployeeByPercentageGreaterThan(double percentage) {
		return dao.getEmployeeByPercentageGreaterThan(percentage);
	}

	public List<Student> studentPercentageBetween(double percentage1, double percentage2) {
		return dao.studentPercentageBetween(percentage1, percentage2);
	}

	public List<Student> findByGrade(String grade) {
		return dao.findByGrade(grade);
	}

}
