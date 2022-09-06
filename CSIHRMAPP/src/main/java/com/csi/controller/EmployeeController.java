package com.csi.controller;

import com.csi.model.Employee;
import com.csi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/")
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeServiceImpl;

    //Geeta Desale	Back End Developement	signUp() at all layers
    public ResponseEntity<String> signUp(Employee employee)
    {
        //pass controller to service layer



        return ResponseEntity.ok("Sucessfully registerd");
    }

    //Digambar Shinde signIn() at all layers
    public ResponseEntity<String> signIn(String email, String pwd)
    {
        String msg="";

        if(true)
        {
            msg="Sucessfully registerd";
        }
        else {

            msg="Failed to Registered Please try again";
        }

        return ResponseEntity.ok(msg);
    }

    //Swapnil Thorat Exception class Generation | saveBulkOfData() at all layers
    //Once done 1) create branch 2)push modification to the subbranch


    //Ayush Agrawal	 filterDataBySal( sal ) at all layers

    //Shraddha Rajigare	Back End Developement	getDataById(id) at all layers
    @GetMapping("/getdatabyid/{empId}")
    public ResponseEntity<Optional<Employee>> getDataById(@PathVariable int empId){
        return ResponseEntity.ok(employeeServiceImpl.getDataById(empId));
    }

    //Ulkesh Salunkhe	Back End Developement	Make an Enity class |sortDataByName() at all layers

    //Rohit Jadhav	Back End Developement	sortDataBySalary at all layers

    //Nilesh Shirsath	Back End Developement	deleteDataById(id)

    //Rahul Patil	Back End Developement	deleteAllData()

    //Pritam Chavan	Back End Developement	sortDataBySalary()

    //Pravin Dighe	Back End Developement	getDataByName(name)

    //Hanuman Bayas	Developement | Testing	"Java Mail API Functionality |

    //Testing funcationality (Dependency on Others )"

    //Shubham Punde	Back End Developement | Database Management	"Validate pom.xml configuration | Create a DataBase| Configure  Application Properties File"

}
