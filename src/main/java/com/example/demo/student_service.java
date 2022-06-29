package com.example.demo;

import java.util.List;

public interface student_service {

	void savestudentdata(student stud);
	
	List<student> getallstudent();
	
	void delete_byid(int id);
	
	student edit_byid(int id);
	
}
