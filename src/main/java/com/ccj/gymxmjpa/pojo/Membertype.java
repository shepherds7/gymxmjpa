package com.ccj.gymxmjpa.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.dreamyoung.mprelation.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("membertype")
public class Membertype {

    @TableId
    private Integer typeId;

    private String typeName;

    private Integer typeciShu;

    private Integer typeDay;

    private Double typemoney;

    @TableField(exist = false)
    @OneToMany(mappedBy = "membertypes")
    @JsonIgnore
    private List<Member> list = new ArrayList<Member>();


}

