package com.sj.oa.biz;

import com.sj.oa.entity.Employee;

public interface GlobalBiz {

    Employee login(String sn,String password);

    void changePassword(Employee employee);
}
