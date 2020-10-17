package com.example.demopostgresql.controller;

import com.example.demopostgresql.dto.EmployeeDTO;
import com.example.demopostgresql.entity.Employee;
import com.example.demopostgresql.services.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ppatchava on 1/2/18.
 */

/**
 * This is a bean, managed by Spring
 */

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService ;

    @RequestMapping(method = RequestMethod.GET, value = "/getAll")
    public ResponseEntity<List<EmployeeDTO>> getAllEmployees(){
        List<Employee> employeeList = employeeService.findAll();
        List<EmployeeDTO> employeeDTOS = new ArrayList<>();
        for (Employee employee: employeeList) {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            BeanUtils.copyProperties(employee, employeeDTO);
            employeeDTOS.add(employeeDTO);
        }

        return new ResponseEntity<List<EmployeeDTO>>(employeeDTOS, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/count")
    public ResponseEntity<Long> count(){
        return new ResponseEntity<Long>(employeeService.count(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getOne/{employeeId}")
    public ResponseEntity<?> getOne(@PathVariable("employeeId") String employeeId){
        Employee employee = employeeService.findOne(employeeId);
        EmployeeDTO employeeDTO = new EmployeeDTO();

        if(employee == null){
            return new ResponseEntity<String>("", HttpStatus.OK);
        }

        BeanUtils.copyProperties(employee,employeeDTO);
        return new ResponseEntity<EmployeeDTO>(employeeDTO, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/exists/{employeeId}")
    public ResponseEntity<Boolean> exists(@PathVariable("employeeId") String employeeId){
        return new ResponseEntity<Boolean>(employeeService.exists(employeeId), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/delete/{employeeId}")
    public ResponseEntity<Boolean> delete(@PathVariable("employeeId") String employeeId){
        employeeService.delete(employeeId);
        return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/deleteAll")
    public ResponseEntity<Boolean> deleteAll(){
        employeeService.deleteAll();
        return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addOrUpdate")
    public ResponseEntity<String> addOrUpdateEmployee(@RequestBody EmployeeDTO employeeDTO){

        System.out.println(employeeDTO);

        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDTO, employee);
        Employee employeeCreated = employeeService.save(employee);

        return new ResponseEntity<String>(employeeCreated.getEmployeeId(),HttpStatus.CREATED);
    }
}
