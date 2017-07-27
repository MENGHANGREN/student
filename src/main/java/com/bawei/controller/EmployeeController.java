package com.bawei.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.bawei.po.Employee;
import com.bawei.po.Tree;
import com.bawei.service.EmployeeService;
@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	/*
	 * 生成tree的方法
	 */
	@RequestMapping("/findTree")
	@ResponseBody
	public List<Tree> findTree() throws Exception{
		List<Tree> list = empService.findTree();
		System.out.println(list);
		return list;
		
	}
	
	/*
	 * 添加员工的方法
	 */
	@RequestMapping("/insertEmployee")
	public String insertEmployee(@ModelAttribute Employee employee,HttpServletRequest request) throws Exception{
		String str = request.getParameter("start_string");
		Date date = null;
		if(str!=null){
			SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
			date = sm.parse(str);
		}

		System.out.println("添加员工");
		System.out.println(employee);
		employee.setStart(date);
		empService.insertEmployee(employee);
		return "success1";
	}
	/*
	 * 检查姓名是否一致
	 */

	@RequestMapping("/checkName")
	public void checkName(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		Employee emp = empService.checkName(name);
		if(emp==null){
			response.getWriter().print("1");
		}else{
			response.getWriter().print("0");
		}
	
	}
	/*
	 * 查询员工集合
	 */
	@RequestMapping(value="/findEmployeeList",method=RequestMethod.POST)
	public String findEmployeeList(@ModelAttribute Employee employee,HttpServletRequest request,Map<String,Object> map) throws Exception{
		String start = request.getParameter("start_string");
		Date start_date = null;
		if(start!=null&&(!"".equals(start))){
			SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
			start_date = sm.parse(start);
		}
		String end = request.getParameter("end_string");
		Date end_date = null;
		if(end!=null&&(!"".equals(end))){
			SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
			end_date = sm.parse(end);
		}

		employee.setStart(start_date);
		employee.setEnd(end_date);
		List<Employee> list = empService.findEmployeeList(employee);
		System.out.println(list);
		map.put("list",list);
		return "findEmployee1";
	}

	@RequestMapping(value="/index")
	public String hello(){
		System.out.println("index1");
		return "index1";
	}
	@RequestMapping(value="/top1")
	public String top1(){
		System.out.println("top1");
		return "top1";
	}
	@RequestMapping(value="/left1")
	public String left1(){
		System.out.println("left1");
		return "left1";
	}
	@RequestMapping(value="/right1")
	public String right1(){
		System.out.println("right1");
		return "right1";
	}
	@RequestMapping(value="/add1")
	public String add1(){
		System.out.println("add1");
		return "add1";
	}
	@RequestMapping(value="/findEmployee1")
	public String findEmployee1(){
		System.out.println("findEmployee1");
		return "findEmployee1";
	}

}
