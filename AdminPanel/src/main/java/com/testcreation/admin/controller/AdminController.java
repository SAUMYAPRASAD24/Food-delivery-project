package com.testcreation.admin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testcreation.admin.bean.Admin;
import com.testcreation.admin.service.AdminService;

@RestController
@RequestMapping("/api")
public class AdminController {
	@Autowired
	AdminService service;
	
	@GetMapping("/Admins/all")
	Iterable<Admin> getAllAdmins() {
		return service.getAllAdmins();
	}
	
	@GetMapping("/Admins/{id}")
	Optional<Admin> getAdminById(@PathVariable int id){
		return service.getAdminById(id);
	}
	
	//@GetMapping("/Admins/name/all")
	//List<Admin> getAdminByName(@PathVariable String name){
		//return service.getAdminByName(name);
	//}
	
	@PostMapping("/add")
	void addAdmin(@RequestBody Admin theAdmin) {
		service.addAdmin(theAdmin);
	}
	
	@PutMapping("/update/{id}")
	void updateAdmin(@RequestBody Admin theAdmin) {
		service.updateAdmin(theAdmin);
	}
	
	@DeleteMapping("/delete/{id}")
	void deleteAdmin(@PathVariable int id) {
		service.deleteAdmin(id);
	}	

}
