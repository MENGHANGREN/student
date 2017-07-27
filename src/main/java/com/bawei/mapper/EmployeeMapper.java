package com.bawei.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bawei.po.Employee;
import com.bawei.po.Tree;
/**
 * 
 * @author 李志轩
 * @date 2017年6月30日
 * @action mapper 类 实现对数据库怎删改查
 */
@Mapper
public interface EmployeeMapper {

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
