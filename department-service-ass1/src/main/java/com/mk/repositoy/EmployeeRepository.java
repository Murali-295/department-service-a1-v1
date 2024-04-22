package com.mk.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mk.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
