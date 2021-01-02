package com.example.demopostgresql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demopostgresql.entity.Employees;

/**
 * @author rishi - created on 01/01/21
 **/
@Repository
public interface EmployeesRepository extends JpaRepository<Employees, String> {

  @Query("select e from Employees e where e.task in (select min(e.task) from Employees e)")
  List<Employees> getEmployeeWithLeastTask();
}
