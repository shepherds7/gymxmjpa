package com.ccj.gymxmjpa.pojo;



import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 管理员实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("adminuser")
public class AdminUser {
    @TableId
    private Integer adminId;
    private String adminName;
    private String adminPassword;
}
