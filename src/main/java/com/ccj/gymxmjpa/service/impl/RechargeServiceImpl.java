package com.ccj.gymxmjpa.service.impl;

import com.ccj.gymxmjpa.mapper.RechargeMapper;
import com.ccj.gymxmjpa.pojo.Recharge;
import com.ccj.gymxmjpa.service.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RechargeServiceImpl implements RechargeService {

    @Autowired
    private RechargeMapper rechargeMapper;
    @Override
    public int save(Recharge recharge) {
        return rechargeMapper.insert(recharge);
    }
}
