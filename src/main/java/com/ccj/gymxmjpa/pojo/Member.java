package com.ccj.gymxmjpa.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.github.dreamyoung.mprelation.JoinColumn;
import com.github.dreamyoung.mprelation.ManyToMany;
import com.github.dreamyoung.mprelation.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("member")
public class Member {
    @TableId
    private int memberId;
    private String memberName;
    private String memberPhone;
    private Integer memberSex;
    private Integer memberAge;
    private Integer memberTypes;
    private java.sql.Date nenberDate;
    private String birthday;
    private long memberStatic;
    private Double memberbalance;
    private java.sql.Date memberxufei;

    @TableField(exist = false)
    @ManyToOne
    @JoinColumn(name = "MemberTypes",referencedColumnName = "MemberTypes")
    private Membertype membertype;

}

