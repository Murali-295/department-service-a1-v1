package com.mk.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mk.dto.ResponseDto;
import com.mk.entity.Department;
import com.mk.entity.Employee;
import com.mk.feign.EmployeeFeign;
import com.mk.repositoy.DepartmentRepository;
import com.mk.repositoy.EmployeeRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeFeign employeeFeign;

	public Department saveDepartment(Department department) {

		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Integer departmentId) {
		Optional<Department> optional = departmentRepository.findById(departmentId);
		if (optional == null) {
			throw new RuntimeException("Check the department id and try again!");
		}
		Department department = optional.get();
		return department;
	}

	public ResponseDto saveDepartmentAndEmployee(Department department) {
		ResponseDto responseDto = new ResponseDto();
		Employee employee = employeeFeign.findEmployeeById(department.getDepartmentId());

		responseDto.setDepartment(department);
		responseDto.setEmployee(employee);
		departmentRepository.save(department);
		employeeRepository.save(employee);

		return responseDto;
	}
}
