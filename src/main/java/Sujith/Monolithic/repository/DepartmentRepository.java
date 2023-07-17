package Sujith.Monolithic.repository;

import Sujith.Monolithic.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long>
{
    Department findByDepartmentCode(String departmentCode);
}
