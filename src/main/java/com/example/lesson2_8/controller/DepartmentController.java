package com.example.lesson2_8.controller;

import com.example.lesson2_8.domain.Employee;
import com.example.lesson2_8.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/department")
public class DepartmentController {

        private final DepartmentService departmentService;

        public DepartmentController(DepartmentService departmentService) {
            this.departmentService = departmentService;
        }
        @GetMapping("/min-salary")
        public Employee findMinSalaryDepartmet  (int department){
            return departmentService.findMinSalaryDepartmet(department);
        }
        @GetMapping("/max-salary")
        public Employee findMaxSalaryDepartmet (int department){
            return departmentService.findMaxSalaryDepartmet(department);
        }
        @GetMapping("/all")
        public List<Employee> findAllByDepartment (int department){
            return departmentService.findAllByDepartment(department);
        }
        @GetMapping(value = "/all", params = {"department"})
        public Map<Integer, List<Employee>> findAll(){
            return departmentService.findAll();
        }

    }
