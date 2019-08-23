package com.sj.oa.biz.impl;

import com.sj.oa.biz.EmployeeBiz;
import com.sj.oa.dao.EmployeeDao;
import com.sj.oa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("employeeBiz")
public class EmployeeBizImpl implements EmployeeBiz {

    @Autowired
    private EmployeeDao employeeDao;

    public void addEmployee(Employee employee) {
        employee.setPassword("000000");
        employeeDao.insert(employee);
    }

    public void editEmployee(Employee employee) {
        employeeDao.update(employee);
    }

    public void removeEmployee(String sn) {
        employeeDao.delete(sn);
    }

    public Employee getEmployee(String sn) {
        return employeeDao.select(sn);
    }

    public List<Employee> getEmployees() {
        return employeeDao.selectAll();
    }
}
