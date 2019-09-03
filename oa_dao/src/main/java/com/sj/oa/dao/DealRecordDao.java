package com.sj.oa.dao;

import com.sj.oa.entity.DealRecord;

import java.util.List;

public interface DealRecordDao {
    void insert(DealRecord dealRecord);
    List<DealRecord> selectByClaimVoucher(int cvid);//对某报销单查询记录
}
