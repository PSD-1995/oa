package com.sj.oa.global;

import java.util.ArrayList;
import java.util.List;

public class Contant {
    //职务
    public static final String POST_STAFF = "员工";
    public static final String POST_FM = "部门经理";
    public static final String POST_GM = "总经理";
    public static final String POST_CASHIER = "财务";

    public List<String> getPosts(){
        List<String> list = new ArrayList<String>();
        list.add(POST_STAFF);
        list.add(POST_FM);
        list.add(POST_GM);
        list.add(POST_CASHIER);
        return list;
    }

    //费用类型
    public List<String> getItems(){
        List<String> list = new ArrayList<String>();
        list.add("交通");
        list.add("餐饮");
        list.add("住宿");
        list.add("办公");
        return list;
    }

    //报销单状态
    public static final String CLAIMVOUCHER_CREATED="新创建";

}
