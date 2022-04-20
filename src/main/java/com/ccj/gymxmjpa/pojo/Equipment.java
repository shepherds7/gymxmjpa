package com.ccj.gymxmjpa.pojo;



import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 设备信息实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("equipment")
public class Equipment {
    @TableId
    private Integer eqId;
    private String eqName;
    private String eqText;
}
