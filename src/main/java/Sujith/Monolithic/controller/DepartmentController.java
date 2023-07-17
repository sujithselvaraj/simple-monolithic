package Sujith.Monolithic.controller;


import Sujith.Monolithic.Service.DepartmentService;
import Sujith.Monolithic.entity.Department;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/department")
@AllArgsConstructor
public class DepartmentController
{
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<Department> saveDepartment(@RequestBody Department departmentDto)
    {
        Department savedDepartment=departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(savedDepartment, HttpStatus.CREATED);
    }

    @GetMapping("{department-code}")
    public ResponseEntity<Department> getDepartment(@PathVariable("department-code") String departmentCode)
    {
        Department departmentDto= departmentService.getDepartmentByCode(departmentCode);
        return new ResponseEntity<>(departmentDto,HttpStatus.OK);
    }
}
