package com.sj.oa.controller;

import com.sj.oa.biz.DepartmentBiz;
import com.sj.oa.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller("employeeController")
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private DepartmentBiz departmentBiz;

    @RequestMapping("/list")
    public String list(Map<String,Object> map){
        map.put("list",departmentBiz.getDepartments());
        return "employee_list";
    }

    @RequestMapping("/to_add")
    public String toAdd(Map<String,Object> map){
        map.put("employee",new Department());
        return "employee_add";
    }

    @RequestMapping("/add")
    public String list(Department employee){
        departmentBiz.addDepartment(employee);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update",params = "sn")
    public String toUpdate(String sn,Map<String,Object> map){
        map.put("employee",departmentBiz.getDepartment(sn));
        return "employee_update";
    }

    @RequestMapping("/update")
    public String update(Department employee){
        departmentBiz.editDepartment(employee);
        return "redirect:list";
    }

    @RequestMapping(value = "/remove",params = "sn")
    public String remove(String sn){
        departmentBiz.removeDepartment(sn);
        return "redirect:list";
    }
}
