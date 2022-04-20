package com.ccj.gymxmjpa.controller;

import com.ccj.gymxmjpa.pojo.AdminUser;
import com.ccj.gymxmjpa.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/")
public class AdminUserController {

    @Autowired
    private AdminUserService adminUserService;

    @RequestMapping("/")
    public String beforeLogin() {
        return "login";
    }

    //管理员登录验证方法
    @PostMapping("/dl/yz")
    public String login(String username, String password, HttpSession session, Model model) {

        AdminUser adminUser = adminUserService.findByAdminNameAndAdminPassword(username, password);
        if (adminUser != null) {
            session.setAttribute("user", adminUser);
            return "WEB-INF/jsp/index";
        } else {
            model.addAttribute("msg", "用户名或密码错误，请重新属入");
            return "/login";
        }

    }

    // 退出登录
    @RequestMapping("/logout")
    public String logout() {
        return "/login";
    }


    //跳转到修改密码界面
    @RequestMapping("/updPassword")
    public String updPassword() {
        return "WEB-INF/jsp/updPassword";
    }

    //修改密码
    @RequestMapping("/upd/updPassword")
    public String updPasswordConfirm(String oldPassword, String newPassword, String newPasswordAgain, HttpSession httpSession, Model model) {
        Pattern p = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!.%*#?&])[A-Za-z\\d$@$!.%*#?&]{8,}$");
        Matcher m = p.matcher(newPassword);
        if (!m.matches()) {
            model.addAttribute("msg", "新密码最少为8位并为字母+数字+特殊字符");
            return "WEB-INF/jsp/updPassword";
        }
        if (!newPassword.equals(newPasswordAgain)) {
            model.addAttribute("msg", "两次输入新密码不一致,请重新输入");
            return "WEB-INF/jsp/updPassword";
        }
        AdminUser adminuser = (AdminUser) httpSession.getAttribute("user");
        if (null != adminuser) {
            if (!adminuser.getAdminPassword().equals(oldPassword)) {
                model.addAttribute("msg", "原密码不正确,请重新输入");
                return "WEB-INF/jsp/updPassword";
            }
            adminUserService.updPassword(adminuser.getAdminId(), newPassword);
        }
//        Subject subject = SecurityUtils.getSubject();
//        subject.logout();
        return "redirect:/login.jsp";
    }


}