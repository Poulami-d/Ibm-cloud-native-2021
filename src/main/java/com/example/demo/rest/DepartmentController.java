package com.example.demo.rest;
import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {
    private DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/departments")
    public ResponseEntity<Department> createDepartment(@RequestBody Department department)
    {
        return new ResponseEntity<Department>(departmentService.createDepartment(department),HttpStatus.CREATED);
    }
    @GetMapping("/departments")
    public ResponseEntity<List<Department>> displayAll()
    {
        return new ResponseEntity<List<Department>>(departmentService.displayAllDepartment(),HttpStatus.OK);
    }
    @GetMapping("/departments/{departmentName}")
    public ResponseEntity<List<Department>> findByDepartmentName(@PathVariable("departmentName") String departmentName)
    {
        return new ResponseEntity<List<Department>>(departmentService.findByDepartmentName(departmentName),HttpStatus.OK);
    }
    @GetMapping("/departments/emp/{employeeName}")
    public ResponseEntity<List<Department>> findByEmployeeName(@PathVariable("employeeName") String employeeName)
    {
        return new ResponseEntity<List<Department>>(departmentService.findByEmployeeName(employeeName),HttpStatus.OK);
    }
    @GetMapping("/departments/departmentId/{departmentId}")
    public ResponseEntity<List<Department>> findByDepartmentId(@PathVariable("departmentId") Integer departmentId)
    {
        return new ResponseEntity<List<Department>>(departmentService.findByDepartmentId(departmentId),HttpStatus.OK);
    }

    @DeleteMapping("/departments/{departmentId}")
    public ResponseEntity<Integer> deleteDepartmentById(@PathVariable("departmentId") Integer departmentId) {

        return new ResponseEntity<Integer>(departmentService.deleteByDepartmentId(departmentId),(HttpStatus.OK));

    }
}
