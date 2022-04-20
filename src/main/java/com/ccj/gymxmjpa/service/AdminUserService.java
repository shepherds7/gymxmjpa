package com.ccj.gymxmjpa.service;


import com.ccj.gymxmjpa.pojo.AdminUser;

public interface AdminUserService {
    AdminUser findByAdminNameAndAdminPassword(String username,String password);

    void updPassword(int adminId, String newPassword);
}
