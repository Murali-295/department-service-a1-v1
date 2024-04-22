package com.mk.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mk.entity.Employee;

@FeignClient(value = "EMPLOYEE-SERVICE", url = "http://localhost:8080")
public interface EmployeeFeign {

	@GetMapping(value = "/employee/id{id}")
	Employee findEmployeeById(@PathVariable("id") Integer empId);

	@PostMapping("/employee/save")
	Employee saveEmployee(@RequestBody Employee employee);
}
