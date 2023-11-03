package com.qsp.new_spring_student_managment.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsp.new_spring_student_managment.dto.Student;
import com.qsp.new_spring_student_managment.repo.StudentRepo;

import net.bytebuddy.asm.Advice.Return;

@Repository
public class StudentDao {
	@Autowired
	private StudentRepo repo;

	public Student saveStudent(Student student) {
		return repo.save(student);

	}

	public Student getStudent(int id) {
		Optional<Student> optional = repo.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	public List<Student> getAll() {
		return repo.findAll();
	}

	public Student deleteStudent(int id) {
		Optional<Student> optional = repo.findById(id);
		if (optional.isEmpty()) {
			return null;

		}
		repo.deleteById(id);
		return optional.get();
	}

	public Student updateById(int id, Student student) {
		Optional<Student> optional = repo.findById(id);
		if (optional.isPresent()) {
			student.setId(id);
			return repo.save(student);
		}
		return null;
	}

	public Student updateEmail(int id, String email) {
		Optional<Student> optional = repo.findById(id);
		if (optional.isEmpty()) {
			return null;

		}
		Student student = optional.get();
		student.setEmail(email);
		return repo.save(student);

	}

	public Student updateAddress(int id, String address) {
		Optional<Student> optional = repo.findById(id);
		if (optional.isPresent()) {
			Student student = optional.get();
			student.setAddress(address);
			return repo.save(student);

		}
		return null;
	}

	public Student updateName(int id, String name) {
		Optional<Student> optional = repo.findById(id);
		if (optional.isPresent()) {
			Student student = optional.get();
			student.setName(name);
			return repo.save(student);
		}
		return null;
	}

	public Student updatePhone(int id, long phone) {
		Optional<Student> optional = repo.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		Student student = optional.get();
		student.setPhone(phone);
		return repo.save(student);
	}

	public Student updateSecuredMarks(int id, double securedMarks) {
		Optional<Student> optional = repo.findById(id);
		if (optional.isPresent()) {
			Student student = optional.get();
			student.setSecuredMarks(securedMarks);
			return repo.save(student);
		}
		return null;
	}

	public List<Student> findByAddress(String address) {
		return repo.findStudentByAddress(address);
	}

	public Student findByEmail(String email) {
		return repo.findStudentByEmail(email);
	}

	public List<Student> findByName(String name) {
		return repo.findStudentByName(name);
	}

	public Student findByPhone(long phone) {
		return repo.findStudentByPhone(phone);
	}

	public List<Student> getEmployeeByPercentageLessThan(double percentage) {
		return repo.findStudentByPercentageLessThan(percentage);
	}

	public List<Student> getEmployeeByPercentageGreaterThan(double percentage) {
		return repo.findStudentByPercentageGreaterThan(percentage);
	}

	public List<Student> studentPercentageBetween(double percentage1, double percentage2) {
		return repo.findStudentByPercentageBetween(percentage1, percentage2);
	}

	public List<Student> findByGrade(String grade) {
		return repo.findStudentByGrade(grade);
	}
}
