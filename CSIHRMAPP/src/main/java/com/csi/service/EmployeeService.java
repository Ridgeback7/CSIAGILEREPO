package com.csi.service;

import com.csi.dao.EmployeeDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDaoImpl employeeDaoImpl;

    public  void deleteAllData(){
        employeeDaoImpl.deleteAllData();
    }

}
