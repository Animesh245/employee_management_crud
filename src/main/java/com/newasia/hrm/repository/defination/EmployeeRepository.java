package com.newasia.hrm.repository.defination;

import com.newasia.hrm.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    // insert, update, delete, showAll
}