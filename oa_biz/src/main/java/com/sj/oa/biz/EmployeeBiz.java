package com.sj.oa.biz;

import com.sj.oa.entity.Employee;
import java.util.List;

public interface EmployeeBiz {
    void addEmployee(Employee employee);

    void editEmployee(Employee employee);

    void removeEmployee(String sn);

    Employee getEmployee(String sn);

    List<Employee> getEmployees();
}
