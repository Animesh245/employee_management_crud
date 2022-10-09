package com.newasia.hrm.service;

import com.newasia.hrm.model.Employee;
import com.newasia.hrm.repository.defination.EmployeeRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // create, retrive/get/findAll, update, delete

    public void saveEmployee(Employee employee)
    {
        employeeRepository.save(employee);
    }

    Optional<Employee> getEmployeeById(Long id)
    {
        var employee = employeeRepository.findById(id);
        return employee;
    }

    void updateEmployee(Employee newEmployee)
    {
        var employee = employeeRepository.findById(newEmployee.getId());
        if(employee.isPresent())
        {
            employeeRepository.save(newEmployee);
        }
    }

    void deleteEmployee(Long id)
    {
        employeeRepository.deleteById(id);
    }
}