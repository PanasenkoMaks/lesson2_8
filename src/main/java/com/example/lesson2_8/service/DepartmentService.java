package com.example.lesson2_8.service;

import com.example.lesson2_8.domain.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee findMinSalaryDepartmet (int department);
    Employee findMaxSalaryDepartmet (int department);
    List<Employee> findAllByDepartment (int department);
    Map<Integer, List<Employee>> findAll();

}
