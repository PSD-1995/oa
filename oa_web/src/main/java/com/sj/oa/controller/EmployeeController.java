package com.sj.oa.controller;

import com.sj.oa.biz.DepartmentBiz;
import com.sj.oa.biz.EmployeeBiz;
import com.sj.oa.entity.Employee;
import com.sj.oa.global.Contant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller("employeeController")
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private DepartmentBiz departmentBiz;

    @Autowired
    private EmployeeBiz employeeBiz;

    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",employeeBiz.getEmployees());
        return "employee_list";
    }

    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map){
        map.put("employee",new Employee());
        map.put("dlist",departmentBiz.getDepartments());
        map.put("plist",Contant.getPosts());
        return "employee_add";
    }

    @RequestMapping("/add")
    public String list(Employee employee){
        employeeBiz.addEmployee(employee);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update",params = "sn")
    public String toUpdate(String sn,Map<String,Object> map){
        map.put("employee",employeeBiz.getEmployee(sn));
        map.put("dlist",departmentBiz.getDepartments());
        map.put("plist",Contant.getPosts());
        return "employee_update";
    }

    @RequestMapping("/update")
    public String update(Employee employee){
        employeeBiz.editEmployee(employee);
        return "redirect:list";
    }

    @RequestMapping(value = "/remove",params = "sn")
    public String remove(String sn){
        employeeBiz.removeEmployee(sn);
        return "redirect:list";
    }
}
