package com.ccj.gymxmjpa;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ccj.gymxmjpa.controller.AdminUserController;
import com.ccj.gymxmjpa.mapper.*;
import com.ccj.gymxmjpa.pojo.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GymxmjpaApplicationTests {

    @Autowired
    private RechargeMapper rechargeMapper;

    @Autowired
    private MemberTypeMapper memberTypeMapper;
    @Autowired
    private EquipmentMapper equipmentMapper;
    @Autowired
    private LoosMapper loosMapper;
    @Autowired
    private GoodInfoMapper goodInfoMapper;

    @Autowired
    private CoachMapper coachMapper;

    @Autowired
    private MemberMapper memberMapper;
    @Autowired
    private AdminUserController adminUserController;

    @Test
    void contextLoads() {
        List<Recharge> recharges = rechargeMapper.selectList(null);
        for (Recharge recharge : recharges) {
            System.out.println(recharge);
        }
    }

    @Test
    void testEquipment() {
        List<Equipment> equipment = equipmentMapper.selectList(null);
        for (Equipment equipment1 : equipment) {
            System.out.println(equipment1);
        }
    }

    @Test
    void testLoos() {
//        List<Loos> loos = loosDao.selectList(null);
//        for (Loos loo : loos) {
//            System.out.println(loo);
//        }

//        List<GoodInfo> goodInfos = goodInfoDao.selectList(null);
//        for (GoodInfo goodInfo : goodInfos) {
//            System.out.println(goodInfo);
//        }
        Recharge recharge = rechargeMapper.selectById(6);
        System.out.println(recharge);
    }

    @Test
    void test() {
        Page<Coach> page = new Page<>(1, 5);
        IPage<Coach> coachPage = coachMapper.selectPage(page, null);
        List<Coach> records = coachPage.getRecords();
        for (Coach record : records) {
            System.out.println(record);
        }

    }

    @Test
    void test2() {
        Coach coach = coachMapper.selectById(2);
        System.out.println(coach);
    }

    @Test
    void testPage() {
//        System.out.println(goodInfoMapper.member(25));
//        System.out.println(goodInfoMapper.goodPage(25));

//        List<Goods> goods = goodInfoMapper.goodToMany();
//        System.out.println(goods);
        Page<MemberTypeMapper> memberTypeMapperPage = new Page<>(1, 3);
        IPage<Membertype> membertypeIPage = memberTypeMapper.queryByPage(memberTypeMapperPage);
        List<Membertype> records = membertypeIPage.getRecords();
        for (Membertype record : records) {
            System.out.println(record);
        }

//        IPage<Membertype> membertypeIPage1 = memberTypeMapper.queryByNamePage(membertypeIPage);
//        System.out.println(membertypeIPage1.getRecords());
    }

    @Test
    void testPage2() {
        Page<Member> page = new Page<>(1, 5);
        IPage<Member> member = memberMapper.getMember(page);
        List<Member> records = member.getRecords();
        for (Member record : records) {
            System.out.println(record);
        }

    }

    @Test
    void testPage3() {
        Page<Member> page = new Page<>(1, 5);
        IPage<Membertype> name = memberTypeMapper.queryByPage(page);
        System.out.println(name.getRecords());
    }
}
