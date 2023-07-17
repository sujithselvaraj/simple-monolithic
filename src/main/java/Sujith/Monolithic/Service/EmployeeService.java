package Sujith.Monolithic.Service;

import Sujith.Monolithic.entity.Department;
import Sujith.Monolithic.entity.Employee;
import Sujith.Monolithic.repository.DepartmentRepository;
import Sujith.Monolithic.repository.EmployeeRespository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeService
{

    private EmployeeRespository employeeRespository;
    private DepartmentRepository departmentRepository;

    public Employee saveEmployee(Employee employee)
    {
        return employeeRespository.save(employee);
    }

    public APIResponse getEmployeeById(Long employeeId)
    {
       Employee employee= employeeRespository.findById(employeeId).get();
        Department department=departmentRepository.findByDepartmentCode(employee.getDepartmentCode());
        APIResponse apiResponse=new APIResponse();
        apiResponse.setEmployee(employee);
        apiResponse.setDepartment(department);
        return apiResponse;
    }
}
