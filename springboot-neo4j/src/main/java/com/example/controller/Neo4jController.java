package com.example.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Model.Department;
import com.example.Model.Employee;
/**
 * 
 * @author Jitesh
 *
 */
public class Neo4jController {

	
	
	@RequestMapping("/addEmployee")
	private boolean addEmployee (@RequestBody Employee employees)	{
		
		
		
		return false;
	}
	
	@RequestMapping("/deleteEmp")
	private boolean deleteEmployee (@RequestBody int  empid)	{
		
		
		
		return false;
	}
	
	@RequestMapping("/addDept")
	private boolean addDept (@RequestBody Department department)	{
		
		
		
		return false;
	}
	
	@RequestMapping("/deleteDept")
	private boolean deleteDept (@RequestBody int  deptId)	{
		
		
		
		return false;
	}
	
}
