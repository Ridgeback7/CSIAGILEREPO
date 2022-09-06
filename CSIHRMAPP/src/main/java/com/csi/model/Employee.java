package com.csi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    @Id
    @GeneratedValue

    @Column(name="emp_id")
    private int empId;

    private String empName;

    private long empContactNumber;

    private String empAddress;

    private double empSalary;

    private String empDOB;

    private String empEmailId;

    private String empPassword;

}
