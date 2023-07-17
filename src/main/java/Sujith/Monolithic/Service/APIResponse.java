package Sujith.Monolithic.Service;

import Sujith.Monolithic.entity.Department;
import Sujith.Monolithic.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class APIResponse
{
    private Department department;
    private Employee employee;
}
