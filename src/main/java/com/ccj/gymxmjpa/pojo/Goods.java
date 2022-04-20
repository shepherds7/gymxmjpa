package com.ccj.gymxmjpa.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品信息实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("goods")
public class Goods {
    @TableId
    private Integer goodsId;
    private String goodsName;
    private String unit;
    private double unitPrice;
    private double sellPrice;
    private Integer inventory;
    private String remark;



}
