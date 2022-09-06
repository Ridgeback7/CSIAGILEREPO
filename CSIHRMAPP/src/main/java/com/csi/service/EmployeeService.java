package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    public Optional<Employee> getDataById(int empId){
        return employeeDaoImpl.getDataById(empId);
    }

}
