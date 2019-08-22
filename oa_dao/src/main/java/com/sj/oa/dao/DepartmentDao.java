package com.sj.oa.dao;

import com.sj.oa.entity.Department;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("departmentDao")
public interface DepartmentDao {
    void insert(Department department);
    void update(Department department);
    void delete(String sn);
    Department select(String sn);
    List<Department> selectAll();
}