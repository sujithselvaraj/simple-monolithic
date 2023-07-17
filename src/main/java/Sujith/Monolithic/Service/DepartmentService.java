package Sujith.Monolithic.Service;

import Sujith.Monolithic.entity.Department;
import Sujith.Monolithic.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DepartmentService
{

    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department)
    {
        return departmentRepository.save(department);
    }

    public Department getDepartmentByCode(String departmentCode)
    {
        return departmentRepository.findByDepartmentCode(departmentCode);
    }
}
