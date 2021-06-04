package com.testcreation.admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testcreation.admin.bean.Admin;
import com.testcreation.admin.dao.AdminRepository;
@Service
public class AdminService {
	@Autowired
	AdminRepository rep;
	
	public Iterable<Admin> getAllAdmins() {
		return rep.findAll();
	}
	
	public Optional<Admin> getAdminById(int id) {
		return rep.findById(id);
	}

	public void addAdmin(Admin theAdmin) {
		rep.save(theAdmin);
	}

	public void updateAdmin(Admin theAdmin) {
		rep.save(theAdmin);	
	}

	public void deleteAdmin(int id) {
		rep.deleteById(id);	
	}

	//public List<Admin> getAdminByName(String name) {
		//return rep.findByName(name);
	//}
}


