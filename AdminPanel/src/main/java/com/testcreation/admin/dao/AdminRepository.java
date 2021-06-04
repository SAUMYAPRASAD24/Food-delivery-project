package com.testcreation.admin.dao;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.testcreation.admin.bean.Admin;

public interface AdminRepository extends CrudRepository<Admin,Integer>
{

}
