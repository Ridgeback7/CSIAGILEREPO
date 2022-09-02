package com.csi.repo;

import com.csi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    //add custom methods if available
}
