package com.example.demo.service;

import com.example.demo.model.Department;

import java.util.List;

public interface DepartmentService {
    public Department createDepartment(Department department);
    public List<Department> displayAllDepartment();
    public List<Department> findByDepartmentName(String departmentName);
    public List<Department> findByEmployeeName(String employeeName);
    public List<Department> findByDepartmentId(Integer id);
    //public Department updateDetails(Department department);
    public Integer deleteByDepartmentId(Integer departmentId);
}
