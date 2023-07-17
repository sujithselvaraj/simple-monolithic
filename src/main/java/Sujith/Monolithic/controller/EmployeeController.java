package Sujith.Monolithic.controller;

import Sujith.Monolithic.Service.APIResponse;
import Sujith.Monolithic.Service.EmployeeService;
import Sujith.Monolithic.entity.Employee;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/employee")
@AllArgsConstructor
public class EmployeeController
{

    private EmployeeService employeeService;
    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
    {
        Employee saveEmployee= employeeService.saveEmployee(employee);
        return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }


    @GetMapping("{id}")
    public ResponseEntity<APIResponse> getEmployeeById(@PathVariable("id") Long employeeId)
    {
       APIResponse apiResponse=employeeService.getEmployeeById(employeeId);
        return new ResponseEntity<>(apiResponse,HttpStatus.OK);
    }
}
