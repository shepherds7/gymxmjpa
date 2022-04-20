package com.ccj.gymxmjpa.pojo;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * 商品统计信息实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("goodinfo")
public class GoodInfo implements Serializable {
    private Integer id;
    private int goodsid;
    private int memberid;
    private int count;
    private double price;
    private String remark;
    @TableField(exist = false)
    private Goods goods;
    @TableField(exist = false)
    private Member member;

}
