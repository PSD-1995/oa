package com.sj.oa.biz;

import com.sj.oa.entity.Department;

import java.util.List;

public interface DepartmentBiz {
    void addDepartment(Department department);

    void editDepartment(Department department);

    void removeDepartment(String sn);

    Department getDepartment(String sn);

    List<Department> getDepartments();
}
