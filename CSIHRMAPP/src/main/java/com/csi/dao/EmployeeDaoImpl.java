package com.csi.dao;


import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDaoImpl {

@Autowired
    EmployeeRepo employeeRepo;

public void deleteDataByid(int empId){
    employeeRepo.deleteById(empId);
}

}
