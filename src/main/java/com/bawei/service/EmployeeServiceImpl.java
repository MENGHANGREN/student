package com.bawei.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.mapper.EmployeeMapper;
import com.bawei.po.Employee;
import com.bawei.po.Tree;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	public List<Tree> findTree() throws Exception {
	
		return employeeMapper.findTree();
	}

	@Override
	public void insertEmployee(Employee emp) throws Exception {
		
		employeeMapper.insertEmployee(emp);
	}

	@Override
	public Employee checkName(String name) throws Exception {
		
		return employeeMapper.checkName(name);
	}

	@Override
	public List<Employee> findEmployeeList(Employee emp) throws Exception {
		// TODO Auto-generated method stub
		return employeeMapper.findEmployeeList(emp);
	}
	

}
