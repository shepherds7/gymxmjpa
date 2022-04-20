package com.ccj.gymxmjpa.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 充值实体类
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("chongzhi")
public class Recharge implements Serializable {

    private long id;

    private int Memberid;
    private int Typeid;
    private long Money;
    private long ssmoney;
    private long zlmoney;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GTM+8")
    private Timestamp date;
    private long czjine;
    private String beizhu;
    private long czStatic;

    @TableField(exist = false)
    private Member member;

}
