package com.ccj.gymxmjpa.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("subject")
public class Subject {

    @TableId
    private Integer subId;

    private String subname;

    private Double sellingPrice;
}

