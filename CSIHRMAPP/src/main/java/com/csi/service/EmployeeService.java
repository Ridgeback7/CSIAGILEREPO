package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    public List<Employee> saveBulkOfData(List<Employee> employees){

        return  employeeDaoImpl.saveBulkOfData(employees);

    }

}
