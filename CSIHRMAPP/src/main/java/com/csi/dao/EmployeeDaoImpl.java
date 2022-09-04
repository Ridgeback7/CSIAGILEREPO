package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeDaoImpl {


    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> sortbyNM(){

        return employeeRepo.findAll().stream().sorted((e1,e2)->e1.getEmpName().compareTo(e2.getEmpName())).collect(Collectors.toList());
    }


}
