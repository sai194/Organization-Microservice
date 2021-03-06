package com.sye.microservices.departmentservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sye.microservices.departmentservice.domain.Employee;

//@FeignClient(name = "employee-service")
@FeignClient(name = "employee-service",url="http://employeeservice:8090")
public interface EmployeeClient {

	@GetMapping("/department/{departmentId}")
	List<Employee> findByDepartment(@PathVariable("departmentId") Long departmentId);
	
}