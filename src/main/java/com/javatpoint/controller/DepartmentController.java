package com.javatpoint.controller;

import com.javatpoint.model.Department;
import com.javatpoint.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController
{
    @Autowired
    DepartmentService departmentService;
    @GetMapping("/department")
    private List<Department> getAllDepartment()
    {
        return departmentService.getAllDepartment();
    }
    @GetMapping("/department/{id}")
    private Department getDepartment(@PathVariable("id") int id)
    {
        return departmentService.getDepartmentById(id);
    }
    @DeleteMapping("/department/{id}")
    private void deleteDepartment(@PathVariable("id") int id)
    {
        departmentService.delete(id);
    }
    @PostMapping("/department")
    private int saveDepartment(@RequestBody Department department)
    {
        departmentService.saveOrUpdate(department);
        return department.getId();
    }
}
