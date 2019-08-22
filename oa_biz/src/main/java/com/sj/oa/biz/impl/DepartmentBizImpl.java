package com.sj.oa.biz.impl;

import com.sj.oa.biz.DepartmentBiz;
import com.sj.oa.dao.DepartmentDao;
import com.sj.oa.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("departmentBiz")
public class DepartmentBizImpl implements DepartmentBiz {

    @Autowired
    private DepartmentDao departmentDao;

    public void addDepartment(Department department) {
        departmentDao.insert(department);
    }

    public void editDepartment(Department department) {
        departmentDao.update(department);
    }

    public void removeDepartment(String sn) {
        departmentDao.delete(sn);
    }

    public Department getDepartment(String sn) {
        return departmentDao.select(sn);
    }

    public List<Department> getDepartments() {
        return departmentDao.selectAll();
    }
}
