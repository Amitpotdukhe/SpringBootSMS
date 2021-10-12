package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repo.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;

	public void createStudent(Student student) {
		// TODO Auto-generated method stub
		repo.save(student);
	}

	public List<Student> findStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
		
	}

	public Student findStudent(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	public void updateStudent(Student existingStudent) {
		// TODO Auto-generated method stub
		repo.save(existingStudent);
	}
	
}
