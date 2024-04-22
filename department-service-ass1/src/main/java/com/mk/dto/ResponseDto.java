package com.mk.dto;

import com.mk.entity.Department;
import com.mk.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {

	private Department department;
	private Employee employee;
}
