package Sujith.Monolithic.repository;

import Sujith.Monolithic.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRespository extends JpaRepository<Employee,Long>
{

}
