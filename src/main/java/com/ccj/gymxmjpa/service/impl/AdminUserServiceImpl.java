package com.ccj.gymxmjpa.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ccj.gymxmjpa.mapper.AdminUserMapper;
import com.ccj.gymxmjpa.pojo.AdminUser;
import com.ccj.gymxmjpa.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Autowired
    private AdminUserMapper adminUserMapper;

    //登录
    @Override
    public AdminUser findByAdminNameAndAdminPassword(String username, String password) {
        return adminUserMapper.selectOne(new QueryWrapper<AdminUser>()
                .eq("adminName", username)
                .eq("adminPassword", password));
    }

    //修改密码
    @Override
    public void updPassword(int adminId, String newPassword) {
        AdminUser adminUser = new AdminUser();
        adminUser.setAdminPassword(newPassword);
        adminUserMapper.update(adminUser, new QueryWrapper<AdminUser>().eq("adminId", adminId));
    }


}
