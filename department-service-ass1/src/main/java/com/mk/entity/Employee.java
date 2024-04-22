package com.mk.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	private Integer empId;
	private String empName;
	private Double empSalary;
	private Long empYOJ;
	private String empDepartment;
}
