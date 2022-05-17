package com.nibm.sb.payroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nibm.sb.payroll.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
