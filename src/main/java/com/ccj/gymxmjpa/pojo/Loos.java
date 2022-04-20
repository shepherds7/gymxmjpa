package com.ccj.gymxmjpa.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * 丢失物品信息实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("loos")
public class Loos {
    @TableId
    private Integer loosId;

    private String loosName;
    private String loosImages;
    private String loosAddress;
    private Date loosjdate;
    private Integer loosStatus;
    private String scavenger;
    private String scavengerPhone;
    private String receiveName;
    private String receivePhone;
    private Date loosldate;
    private String admin;
}
