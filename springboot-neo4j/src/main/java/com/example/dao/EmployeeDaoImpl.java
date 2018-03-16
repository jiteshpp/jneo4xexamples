package com.example.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.Model.Employee;

@Repository("EmpDao")
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return false;
	}

}
