package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home_controller {
	
	@Autowired
	private student_service s;
	
	@RequestMapping("/")
	public String index() {
		return "index"; //index.jsp
	}
	
	@PostMapping("/savedata")
	public String savedata(@ModelAttribute("stud") student stud) {
		
		s.savestudentdata(stud);
		
		return "redirect:/viewdata";  //redirect to viewdata.jsp
	}

	
	//Model    - Interface
	//ModelMap  - Class
	//We can use both for pass the data
	
	@GetMapping("/viewdata")
	public String viewdata(Model m) {
		
		List<student> data=s.getallstudent();
		
		m.addAttribute("data",data);
		
		return "welcome"; //welcome.jsp
	}
	
	//@RequestMapping("/edit")
	//public String editpage() {
		//return "edit";
	//}
	
	@RequestMapping("/edit")
	public String edit(@RequestParam("id") int id, ModelMap m) {
		student stud = s.edit_byid(id);
		m.addAttribute("command",stud);
		return "edit";  //edit.jsp
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		s.delete_byid(id);	

		return "redirect:/viewdata";
	}
	
	@RequestMapping("/update")
	public String updatedata(@ModelAttribute("stud") student stud) {
		
		student s1=new student();
		
		s1.setId(stud.getId());
		s1.setFullname(stud.getFullname());
		s1.setEmail(stud.getEmail());
		s1.setPassword(stud.getPassword());
		
		s.savestudentdata(s1);
		return "redirect:/viewdata"; 
	}
	
}
