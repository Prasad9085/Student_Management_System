package com.qsp.new_spring_student_managment.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.qsp.new_spring_student_managment.dto.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	Student findStudentByEmail(String email);

	List<Student> findStudentByAddress(String address);

	List<Student> findStudentByName(String name);

	Student findStudentByPhone(long phone);

	List<Student> findStudentByPercentageLessThan(double percentage);

	List<Student> findStudentByPercentageGreaterThan(double percentage);

	@Query("select s from Student s where s.percentage between ?1 AND ?2")
	List<Student> findStudentByPercentageBetween(double percentage1, double percentage2);

	List<Student> findStudentByGrade(String grade);

}
