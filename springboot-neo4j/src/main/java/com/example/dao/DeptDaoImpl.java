package com.example.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.Model.Department;
/**
 * 
 * @author Jitesh
 *
 */
@Repository("DeptDao")
@Transactional
public class DeptDaoImpl implements DeptDao{

	@Override
	public boolean addDept(Department department) {
		// TODO Auto-generated method stub
		return false;
	}

}
