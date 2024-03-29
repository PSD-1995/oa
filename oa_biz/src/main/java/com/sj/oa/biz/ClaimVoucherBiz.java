package com.sj.oa.biz;

import com.sj.oa.entity.ClaimVoucher;
import com.sj.oa.entity.ClaimVoucherItem;
import com.sj.oa.entity.DealRecord;

import java.util.List;

public interface ClaimVoucherBiz {
    void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);

    ClaimVoucher get(int i);

    List<ClaimVoucherItem>   getItems(int cvid);
    List<DealRecord> getRecords(int cvid);

    List<ClaimVoucher> getForSelf(String sn);
    List<ClaimVoucher> getForDeal(String sn);

    void update(ClaimVoucher claimVoucher,List<ClaimVoucherItem> items);

    void submit(int id);

    void deal(DealRecord dealRecord);
}
