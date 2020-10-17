package com.example.demopostgresql.repository;

import com.example.demopostgresql.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ppatchava on 1/2/18.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {
}
