package com.csi.dao;

import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoImpl {
    @Autowired
    EmployeeRepo employeeRepo;
    public void  deleteAllData(){
        employeeRepo.deleteAll();
    }




}
