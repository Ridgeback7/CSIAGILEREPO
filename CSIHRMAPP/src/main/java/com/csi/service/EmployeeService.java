package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {

    @Autowired
    EmployeeDaoImpl employeeDaoImpl;
    public void deleteDataById(int empId) {
        employeeDaoImpl.deleteDataByid(empId);
    }
}
