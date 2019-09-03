package com.sj.oa.controller;

import com.sj.oa.biz.ClaimVoucherBiz;
import com.sj.oa.dto.ClaimVoucherInfo;
import com.sj.oa.entity.Employee;
import com.sj.oa.global.Contant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller("claimVoucherController")
@RequestMapping("/claim_voucher")
public class ClaimVoucherController {

    @Autowired
    private ClaimVoucherBiz claimVoucherBiz;


    @RequestMapping("/to_add")
    public String toAdd(Map<String ,Object> map){
        map.put("items",Contant.getItems());
        map.put("info",new ClaimVoucherInfo());
        return "claim_voucher_add";
    }
    @RequestMapping("/add")
    public String add(HttpSession session,ClaimVoucherInfo info){
        Employee employee = (Employee) session.getAttribute("employee");
        info.getClaimVoucher().setCreateSn(employee.getSn());
        claimVoucherBiz.save(info.getClaimVoucher(),info.getItems());
        return "redirect:detail?id="+info.getClaimVoucher().getId();
    }
    @RequestMapping("/detail")
    public String detail(Map<String ,Object> map,int id){
        map.put("claimVoucher",claimVoucherBiz.get(id));
        System.out.println("这是待处理人："+claimVoucherBiz.get(id).getDealer().getName());
        map.put("items",claimVoucherBiz.getItems(id));
        map.put("records",claimVoucherBiz.getRecords(id));
        return "claim_voucher_detail";
    }
}
