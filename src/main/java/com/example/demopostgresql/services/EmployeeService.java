package com.example.demopostgresql.services;

import java.util.List;

import com.example.demopostgresql.entity.Employee;
import org.springframework.stereotype.Service;

/**
 * Created by ppatchava on 1/2/18.
 */
public interface EmployeeService {
    public Employee save(Employee employee);

    public Employee findOne(String employeeId);

    public boolean exists(String employeeId);

    public List<Employee> findAll();

    public Iterable<Employee> findAll(Iterable<String> employeeIds);

    public long count();

    public void delete(String employeeId);

    public void delete(Employee employee);

    public void deleteAll();
}
