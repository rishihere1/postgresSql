package com.example.demopostgresql.services.impl;

import java.util.List;
import java.util.ArrayList;

import com.example.demopostgresql.entity.Employee;
import com.example.demopostgresql.repository.EmployeeRepository;
import com.example.demopostgresql.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by ppatchava on 1/2/18.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository ;

    @Override
    public Employee save(Employee employee){
      return employeeRepository.save(employee);
    }

    @Override
    public Employee findOne(String employeeId){
        return employeeRepository.findOne(employeeId);
    }

    @Override
    public boolean exists(String employeeId){
        return employeeRepository.exists(employeeId);
    }

    @Override
    public List<Employee> findAll(){
        List<Employee> employeeList = new ArrayList<Employee>();

        Iterable<Employee> employeeIterable= employeeRepository.findAll();
        employeeIterable.forEach(employeeList::add);
        return  employeeList;
    }

    @Override
    public Iterable<Employee> findAll(Iterable<String> employeeIds){
        return findAll(employeeIds);
    }

    @Override
    public long count(){
        return employeeRepository.count();
    }

    @Override
    public void delete(String employeeId){
        employeeRepository.delete(employeeId);
    }

    @Override
    public void delete(Employee employee){
        employeeRepository.delete(employee);
    }

    @Override
    public void deleteAll(){
        employeeRepository.deleteAll();
    }
}
