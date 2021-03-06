package com.sye.microservices.organizationservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sye.microservices.organizationservice.domain.Employee;

@FeignClient(name = "employee-service",url="http://employeeservice:8090")
public interface EmployeeClient {

	@GetMapping("/organization/{organizationId}")
	List<Employee> findByOrganization(@PathVariable("organizationId") Long organizationId);
	
}