package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepo employeeRepoImpl;

    public List<Employee> saveBulkOfData(List<Employee> employees){

     return  employeeRepoImpl.saveAll(employees);

    }



}
