package tws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.Employee;
import tws.mapper.EmployeeMapper;



	@RestController
	@RequestMapping("/employees")
	public class EmployeeCtrl{
		
		@Autowired
		EmployeeMapper employeeMapper;
		
		@GetMapping("/")
		public List<Employee> selectAll(){
			return employeeMapper.selectAll();
		}
	}

