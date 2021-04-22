package com.example.demo.service;

import com.example.demo.dao.DepartmentDao;
import com.example.demo.model.Department;
import com.sun.corba.se.spi.ior.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service

    public class DepartmentServiceImpl implements DepartmentService {
        private DepartmentDao departmentDao;

        @Autowired
        public DepartmentServiceImpl(DepartmentDao departmentDao) {
            this.departmentDao = departmentDao;
        }

        @Override

        public Department createDepartment(Department department) {
            return departmentDao.save(department);
        }

        @Override

        public List<Department> displayAllDepartment() {
            return departmentDao.findAll();

        }

    @Override
    public List<Department> findByDepartmentName(String departmentName) {
        return departmentDao.findByDepartmentName(departmentName);
    }

    @Override
    public List<Department> findByEmployeeName(String employeeName) {
        return departmentDao.findByEmployeeName(employeeName);
    }

    @Override
    public List<Department> findByDepartmentId(Integer id) {
        return departmentDao.findByDepartmentId(id);
    }

//    @Override
//    public Department updateDetails(Department department) {
//        Optional<Department> db=departmentDao.findById(department.getDepartmentId());
//    }


    @Override
    @Transactional
    public Integer deleteByDepartmentId(Integer departmentId) {
        return departmentDao.deleteByDepartmentId(departmentId);
    }
}

