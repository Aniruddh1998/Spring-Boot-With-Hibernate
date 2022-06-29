package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentIMPL implements student_service {

	@Autowired
	private student_repo repo;
	
	@Override
	public void savestudentdata(student stud) {
		repo.save(stud);
	}

	@Override
	public List<student> getallstudent() {
		
		return repo.findAll();	
	}

	@Override
	public void delete_byid(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public student edit_byid(int id) {
		Optional<student> stud = repo.findById(id);
		student s = stud.get();
		
		return s;
	}
		
}
