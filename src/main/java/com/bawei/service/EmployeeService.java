package com.bawei.service;

import java.util.List;

import com.bawei.po.Employee;
import com.bawei.po.Tree;

public interface EmployeeService {

	/*
	 * 查询tree功能按钮
	 */
	public List<Tree> findTree() throws Exception;
	
	/*
	 * 添加员工
	 */
	public void insertEmployee(Employee emp) throws Exception;
	/*
	 * 检查员工名字唯一
	 */
	public Employee checkName(String name) throws Exception;
	
	/*
	 * 查询员工集合
	 */
	public List<Employee> findEmployeeList(Employee emp) throws Exception;
}
