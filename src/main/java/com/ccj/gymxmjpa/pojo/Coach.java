package com.ccj.gymxmjpa.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * 教练信息实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("coach")
public class Coach {
    @TableId
    private int coachId;
    private String coachName;
    private String coachPhone;
    private long coachSex;
    private long coachAge;
    private Date coachData;
    private long Teach;
    private double coachWages;
    private String coachAddress;
    private long coachStatic;


}
