/*
 Navicat Premium Data Transfer

 Source Server         : 1
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : springbootproject

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 20/04/2022 17:00:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for adminuser
-- ----------------------------
DROP TABLE IF EXISTS `adminuser`;
CREATE TABLE `adminuser`  (
  `adminId` int(0) NOT NULL AUTO_INCREMENT,
  `adminName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `adminPassword` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`adminId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of adminuser
-- ----------------------------
INSERT INTO `adminuser` VALUES (1, 'admin', '123');
INSERT INTO `adminuser` VALUES (2, 'cc', 'ccj54281018*');
INSERT INTO `adminuser` VALUES (7, 'liujian', '123');

-- ----------------------------
-- Table structure for chongzhi
-- ----------------------------
DROP TABLE IF EXISTS `chongzhi`;
CREATE TABLE `chongzhi`  (
  `Id` int(0) NOT NULL AUTO_INCREMENT,
  `Memberid` int(0) NULL DEFAULT NULL,
  `Typeid` int(0) NULL DEFAULT NULL,
  `Money` int(0) NULL DEFAULT NULL,
  `ssmoney` int(0) NULL DEFAULT NULL,
  `zlmoney` int(0) NULL DEFAULT NULL,
  `Date` datetime(0) NULL DEFAULT NULL,
  `czjine` int(0) NULL DEFAULT NULL,
  `beizhu` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `czStatic` int(0) NULL DEFAULT NULL,
  PRIMARY KEY (`Id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 111 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chongzhi
-- ----------------------------
INSERT INTO `chongzhi` VALUES (6, 38, 2, 150, 150, 0, '2020-04-07 18:58:24', 0, '', 2);
INSERT INTO `chongzhi` VALUES (8, 34, 1, 500, 1000, 0, '2020-04-08 15:29:09', 0, '', 2);
INSERT INTO `chongzhi` VALUES (10, 34, NULL, 500, 500, 0, '2020-04-08 15:31:49', 0, '', 1);
INSERT INTO `chongzhi` VALUES (11, 25, NULL, 500, 500, 0, '2020-04-08 15:33:08', 0, '', 1);
INSERT INTO `chongzhi` VALUES (12, 26, 5, 50, 100, 50, '2020-04-08 15:37:17', 0, '', 2);
INSERT INTO `chongzhi` VALUES (13, 26, 1, 500, 1000, 500, '2020-04-08 15:38:22', 0, '', 2);
INSERT INTO `chongzhi` VALUES (14, 26, 1, 500, 500, 0, '2020-04-08 15:40:44', 0, '', 2);
INSERT INTO `chongzhi` VALUES (15, 26, 1, 500, 500, 0, '2020-04-08 15:42:03', 0, '', 2);
INSERT INTO `chongzhi` VALUES (16, 34, 5, 50, 50, 0, '2020-04-08 15:43:00', 0, '', 2);
INSERT INTO `chongzhi` VALUES (17, 34, 3, 1000, 1000, 0, '2020-04-08 15:43:33', 0, '', 2);
INSERT INTO `chongzhi` VALUES (18, 34, 1, 500, 500, 0, '2020-04-08 15:43:51', 0, '', 2);
INSERT INTO `chongzhi` VALUES (19, 34, 2, 150, 1000, 850, '2020-04-08 15:44:37', 0, '', 2);
INSERT INTO `chongzhi` VALUES (20, 34, 1, 500, 500, 0, '2020-04-08 15:46:55', 0, '', 2);
INSERT INTO `chongzhi` VALUES (32, 25, 1, 500, 500, 0, '2020-04-08 17:43:37', 0, '', 2);
INSERT INTO `chongzhi` VALUES (57, 26, NULL, -10, 200, 0, '2020-04-08 18:25:19', 0, '', 1);
INSERT INTO `chongzhi` VALUES (58, 26, NULL, 50, 200, 0, '2020-04-08 18:25:35', 0, '', 1);
INSERT INTO `chongzhi` VALUES (60, 26, 5, 50, 100, 50, '2020-04-08 18:37:19', 0, '', 2);
INSERT INTO `chongzhi` VALUES (61, 25, 2, 150, 200, 50, '2020-04-11 16:28:03', 0, '', 2);
INSERT INTO `chongzhi` VALUES (63, 25, 1, 500, 2000, 1500, '2020-04-11 16:43:37', 0, '', 2);
INSERT INTO `chongzhi` VALUES (64, 25, 1, 500, 500, 0, '2020-04-11 16:53:43', 0, '', 2);
INSERT INTO `chongzhi` VALUES (65, 43, 1, 500, 400, -100, '2020-04-11 16:54:09', 0, '', 2);
INSERT INTO `chongzhi` VALUES (66, 35, 2, 150, 200, 50, '2020-04-11 16:54:41', 0, '', 2);
INSERT INTO `chongzhi` VALUES (67, 25, 1, 500, 1, -499, '2020-04-11 16:55:47', 0, '', 2);
INSERT INTO `chongzhi` VALUES (68, 25, 3, 1000, 1000, 0, '2020-04-11 16:57:01', 0, '', 2);
INSERT INTO `chongzhi` VALUES (72, 25, NULL, 200, 200, 0, '2020-04-11 17:03:03', 0, '', 1);
INSERT INTO `chongzhi` VALUES (77, 25, NULL, 200, 200, 0, '2020-04-11 17:13:21', 0, '', 1);
INSERT INTO `chongzhi` VALUES (78, 26, NULL, 200, 200, 0, '2020-04-11 17:13:37', 0, '', 1);
INSERT INTO `chongzhi` VALUES (81, 25, 1, 1000, 1000, 0, '2020-04-11 17:14:32', 0, '', 2);
INSERT INTO `chongzhi` VALUES (82, 25, NULL, 200, 200, 0, '2020-04-11 17:14:40', 0, '', 1);
INSERT INTO `chongzhi` VALUES (83, 35, NULL, 200, 200, 0, '2020-04-11 17:16:31', 0, '', 1);
INSERT INTO `chongzhi` VALUES (84, 37, 3, 1000, 1000, 0, '2020-05-03 15:33:32', 0, '', 2);
INSERT INTO `chongzhi` VALUES (85, 35, 1, 500, 500, 0, '2020-05-03 15:33:56', 0, '', 2);
INSERT INTO `chongzhi` VALUES (86, 25, NULL, 500, 500, 0, '2020-05-03 15:34:32', 0, '', 1);
INSERT INTO `chongzhi` VALUES (87, 34, NULL, 1000, 1000, 0, '2020-05-03 15:35:37', 0, '', 1);
INSERT INTO `chongzhi` VALUES (88, 37, NULL, 1000, 1000, 0, '2020-05-03 15:35:58', 0, '', 1);
INSERT INTO `chongzhi` VALUES (89, 25, 3, 1000, 2000, 1000, '2022-02-14 22:05:35', 0, '', 2);
INSERT INTO `chongzhi` VALUES (90, 37, NULL, 100, 100, 0, '2022-04-17 21:01:40', 0, '', 1);
INSERT INTO `chongzhi` VALUES (91, 37, NULL, 100, 100, 0, '2022-04-18 22:57:36', 0, '1', 1);
INSERT INTO `chongzhi` VALUES (92, 37, 1, 500, 2000, 1500, '2022-04-19 19:01:41', 0, '', 2);
INSERT INTO `chongzhi` VALUES (93, 34, 2, 150, 200, 50, '2022-04-20 03:12:01', 0, '', 2);
INSERT INTO `chongzhi` VALUES (94, 35, 1, 500, 600, 100, '2022-04-20 03:12:15', 0, '', 2);
INSERT INTO `chongzhi` VALUES (95, 35, 1, 500, 600, 100, '2022-04-20 03:12:57', 0, '', 2);
INSERT INTO `chongzhi` VALUES (96, 0, 0, 150, 600, 450, '2022-04-20 15:39:29', 0, '', 2);
INSERT INTO `chongzhi` VALUES (97, 0, 0, 50, 600, 450, '2022-04-20 15:39:40', 0, '', 2);
INSERT INTO `chongzhi` VALUES (98, 0, 0, 500, 600, 450, '2022-04-20 15:39:53', 0, '', 2);
INSERT INTO `chongzhi` VALUES (99, 0, 0, 50, 600, 450, '2022-04-20 15:40:02', 0, '', 2);
INSERT INTO `chongzhi` VALUES (100, 0, 0, 200, 600, 400, '2022-04-20 15:40:29', 0, '', 1);
INSERT INTO `chongzhi` VALUES (101, 0, 0, 200, 600, 400, '2022-04-20 15:40:34', 0, '', 1);
INSERT INTO `chongzhi` VALUES (102, 0, 0, 200, 600, 400, '2022-04-20 15:41:55', 0, '', 1);
INSERT INTO `chongzhi` VALUES (103, 0, 0, 200, 600, 400, '2022-04-20 15:42:03', 0, '', 1);
INSERT INTO `chongzhi` VALUES (104, 0, 0, 1000, 2000, 1000, '2022-04-20 15:43:04', 0, '', 2);
INSERT INTO `chongzhi` VALUES (105, 0, 0, 150, 2000, 1000, '2022-04-20 15:43:31', 0, '', 2);
INSERT INTO `chongzhi` VALUES (106, 0, 0, 200, 600, 400, '2022-04-20 15:44:12', 0, '', 1);
INSERT INTO `chongzhi` VALUES (107, 0, 0, 100, 200, 100, '2022-04-20 15:46:10', 0, '', 1);
INSERT INTO `chongzhi` VALUES (108, 0, 0, 100, 200, 100, '2022-04-20 15:46:29', 0, '', 1);
INSERT INTO `chongzhi` VALUES (109, 0, 0, 100, 200, 100, '2022-04-20 15:46:41', 0, '', 1);
INSERT INTO `chongzhi` VALUES (110, 0, 0, 200, 2000, 1800, '2022-04-20 15:47:23', 0, '', 1);

-- ----------------------------
-- Table structure for coach
-- ----------------------------
DROP TABLE IF EXISTS `coach`;
CREATE TABLE `coach`  (
  `coachId` int(0) NOT NULL AUTO_INCREMENT,
  `coachName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `coachPhone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `coachSex` int(0) NULL DEFAULT NULL,
  `CoachAge` int(0) NULL DEFAULT NULL,
  `CoachData` date NULL DEFAULT NULL,
  `Teach` int(0) NULL DEFAULT NULL,
  `CoachWages` double NULL DEFAULT NULL,
  `CoachAddress` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `CoachStatic` int(0) NULL DEFAULT 0,
  PRIMARY KEY (`coachId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of coach
-- ----------------------------
INSERT INTO `coach` VALUES (2, '张起灵', '13243253432', 0, 23, '2022-04-13', 3, 6000, '张家古楼', 0);
INSERT INTO `coach` VALUES (3, '蓝忘机', '13324332344', 0, 20, '2022-04-20', 2, 10000, '云深不知处', 0);
INSERT INTO `coach` VALUES (4, '花城', '13324245453', 1, 25, '2020-04-10', 3, 12000, '仙乐国', 0);
INSERT INTO `coach` VALUES (11, '婉儿', '15556042957', 1, 29, '2022-04-07', 3, 3500, '江苏省徐州市', 0);
INSERT INTO `coach` VALUES (12, '白凤九', '13433324335', 1, 20, '2020-06-10', 1, 18000, '青丘', 2);
INSERT INTO `coach` VALUES (14, '张含', '15299985622', 1, 35, '2020-04-02', 5, 10000, '北京丰台', 1);
INSERT INTO `coach` VALUES (16, '周命', '15785456231', 1, 22, '2020-05-06', 2, 12000, '陕西西安', 0);
INSERT INTO `coach` VALUES (18, '12312', '15556042957', 1, 24, '2022-04-13', 3, 3000, '湖南', 0);

-- ----------------------------
-- Table structure for equipment
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment`  (
  `eqId` int(0) NOT NULL AUTO_INCREMENT,
  `eqName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `eqText` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`eqId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of equipment
-- ----------------------------
INSERT INTO `equipment` VALUES (1, '跑步机', '大型斑马牌跑步机');
INSERT INTO `equipment` VALUES (6, '动感单车', '塑身');
INSERT INTO `equipment` VALUES (7, '呼啦圈', '10');
INSERT INTO `equipment` VALUES (9, 'ceshi ', 'wu ');
INSERT INTO `equipment` VALUES (10, 'test', '测试');
INSERT INTO `equipment` VALUES (11, 'ceshi ', '11');

-- ----------------------------
-- Table structure for goodinfo
-- ----------------------------
DROP TABLE IF EXISTS `goodinfo`;
CREATE TABLE `goodinfo`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `goodsid` int(0) NULL DEFAULT NULL,
  `memberid` int(0) NULL DEFAULT NULL,
  `count` int(0) NULL DEFAULT NULL,
  `price` double NULL DEFAULT NULL,
  `remark` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goodinfo
-- ----------------------------
INSERT INTO `goodinfo` VALUES (9, 3, 25, 2, 10, '');
INSERT INTO `goodinfo` VALUES (12, 4, 26, 5, 5, '');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `goodsId` int(0) NOT NULL AUTO_INCREMENT,
  `goodsName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `unit` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `unitPrice` double NULL DEFAULT NULL,
  `sellPrice` double NULL DEFAULT NULL,
  `inventory` int(0) NULL DEFAULT NULL,
  `remark` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`goodsId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (2, '可口可乐', '瓶', 2, 5, 31, '1');
INSERT INTO `goods` VALUES (3, '百事可乐', '瓶', 2, 5, 13, '');
INSERT INTO `goods` VALUES (4, '小布丁雪糕', '根', 0.5, 1, 13, '');
INSERT INTO `goods` VALUES (5, '压缩饼干', '块', 2, 5, 24, '');
INSERT INTO `goods` VALUES (7, '脉动', '瓶', 3, 6, 15, '');
INSERT INTO `goods` VALUES (9, '1', '瓶', 2, 3, 22, '12');

-- ----------------------------
-- Table structure for loos
-- ----------------------------
DROP TABLE IF EXISTS `loos`;
CREATE TABLE `loos`  (
  `loosId` int(0) NOT NULL AUTO_INCREMENT,
  `loosName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `loosImages` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `loosAddress` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `loosjdate` datetime(0) NULL DEFAULT NULL,
  `loosStatus` int(0) NULL DEFAULT NULL,
  `scavenger` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `scavengerPhone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ReceiveName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ReceivePhone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `loosldate` datetime(0) NULL DEFAULT NULL,
  `admin` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`loosId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of loos
-- ----------------------------
INSERT INTO `loos` VALUES (1, '车钥匙', '1', '厕所门口', '2020-04-10 00:00:00', 1, '张三', '13355660000', '22', '25525', '2020-04-12 00:00:00', 'admin');
INSERT INTO `loos` VALUES (6, '手机', '1', '前台', '2020-05-01 00:00:00', 1, '王能', '15299952320', '张宏', '15899965478', '2020-05-02 00:00:00', 'admin');
INSERT INTO `loos` VALUES (7, '钱包', '1', '动感单车旁', '2020-05-01 00:00:00', 1, '李镇', '15966325478', 'ceshi', '15556042957', '2022-04-17 00:00:00', 'admin');
INSERT INTO `loos` VALUES (8, '包', '1', '门口', '2020-05-02 00:00:00', 0, '刘伟', '15326587548', NULL, NULL, NULL, 'admin');
INSERT INTO `loos` VALUES (9, '测试', '1', ' 厕所', '2022-04-17 00:00:00', 0, 'ccj', '15556042957', NULL, NULL, NULL, 'admin');
INSERT INTO `loos` VALUES (10, '测试', '1', '安徽', '2022-04-17 00:00:00', 0, '陈昌健', '15556042957', NULL, NULL, NULL, 'admin');

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member`  (
  `MemberId` int(0) NOT NULL AUTO_INCREMENT,
  `MemberName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `MemberPhone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `MemberSex` int(0) NULL DEFAULT NULL,
  `MemberAge` int(0) NULL DEFAULT NULL,
  `MemberTypes` int(0) NULL DEFAULT NULL,
  `NenberDate` date NULL DEFAULT NULL,
  `Birthday` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `memberStatic` int(0) NULL DEFAULT NULL,
  `Memberbalance` float NULL DEFAULT 0,
  `Memberxufei` date NULL DEFAULT NULL,
  PRIMARY KEY (`MemberId`) USING BTREE,
  INDEX `fk-member-membertype`(`MemberTypes`) USING BTREE,
  CONSTRAINT `fk-member-membertype` FOREIGN KEY (`MemberTypes`) REFERENCES `membertype` (`TypeId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 62 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES (25, '刘建', '13456789087', 1, 23, 2, '2020-04-06', '08-24', 1, 280, '2023-07-18');
INSERT INTO `member` VALUES (26, 'Tom', '15266668585', 1, 24, 2, '2020-04-06', '08-07', 1, 95, '2022-05-19');
INSERT INTO `member` VALUES (34, '王泽明', '17858966255', 1, 19, 2, '2020-04-06', '05-08', 1, 820, '2022-05-20');
INSERT INTO `member` VALUES (35, '张红', '18799256874', 0, 23, 1, '2020-04-07', '04-08', 1, -7, '2022-10-17');
INSERT INTO `member` VALUES (38, '李明', '15699588547', 1, 22, 5, '2020-04-07', '04-21', 1, 0, '2022-04-27');
INSERT INTO `member` VALUES (43, '方蓝', '13456789876', 0, 22, 3, '2020-04-10', '04-29', 1, 0, '2023-04-20');
INSERT INTO `member` VALUES (55, 'shepherd', '15556042957', 1, 22, 1, '2022-04-19', '04-11', 1, 200, '2022-07-18');
INSERT INTO `member` VALUES (56, 'shepherd', '15556042957', 1, 28, 5, '2022-04-19', '04-11', 1, 0, '2022-04-27');
INSERT INTO `member` VALUES (61, '王芳', '15299950487', 0, 22, 1, '2020-04-07', '04-21', 1, 200, '2022-10-31');

-- ----------------------------
-- Table structure for membertype
-- ----------------------------
DROP TABLE IF EXISTS `membertype`;
CREATE TABLE `membertype`  (
  `TypeId` int(0) NOT NULL AUTO_INCREMENT,
  `TypeName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `TypeciShu` int(0) NULL DEFAULT NULL,
  `TypeDay` int(0) NULL DEFAULT NULL,
  `Typemoney` float NULL DEFAULT NULL,
  PRIMARY KEY (`TypeId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of membertype
-- ----------------------------
INSERT INTO `membertype` VALUES (1, '季卡', 6, 90, 500);
INSERT INTO `membertype` VALUES (2, '月卡', 5, 30, 150);
INSERT INTO `membertype` VALUES (3, '年卡', 4, 365, 1000);
INSERT INTO `membertype` VALUES (5, '周卡', 7, 7, 50);

-- ----------------------------
-- Table structure for privatecoachinfo
-- ----------------------------
DROP TABLE IF EXISTS `privatecoachinfo`;
CREATE TABLE `privatecoachinfo`  (
  `pid` int(0) NOT NULL AUTO_INCREMENT,
  `memberid` int(0) NULL DEFAULT NULL,
  `coachid` int(0) NULL DEFAULT NULL,
  `subjectid` int(0) NULL DEFAULT NULL,
  `count` int(0) NULL DEFAULT NULL,
  `countprice` double NULL DEFAULT NULL,
  `realprice` double NULL DEFAULT NULL,
  `date` date NULL DEFAULT NULL,
  `state` int(0) NULL DEFAULT NULL,
  `remark` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `admin` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'asdf',
  PRIMARY KEY (`pid`) USING BTREE,
  INDEX `fk_pri_subject`(`subjectid`) USING BTREE,
  INDEX `fk_pri_coach`(`coachid`) USING BTREE,
  INDEX `fk_pri_member`(`memberid`) USING BTREE,
  CONSTRAINT `fk_pri_coach` FOREIGN KEY (`coachid`) REFERENCES `coach` (`coachId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_pri_member` FOREIGN KEY (`memberid`) REFERENCES `member` (`MemberId`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_pri_subject` FOREIGN KEY (`subjectid`) REFERENCES `subject` (`subId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of privatecoachinfo
-- ----------------------------
INSERT INTO `privatecoachinfo` VALUES (3, 25, 16, 1, 1, 200, 30, '2020-04-07', 1, 'fg', 'aa');
INSERT INTO `privatecoachinfo` VALUES (13, 26, 14, 2, 22, 660, 500.5, '2020-04-15', 1, '', 'asdf');
INSERT INTO `privatecoachinfo` VALUES (14, 38, 14, 4, 25, 16650, 18888.858, '2020-04-16', 1, '', 'asdf');
INSERT INTO `privatecoachinfo` VALUES (16, 34, 11, 1, 5, 150, 200, '2020-05-02', 1, '', 'asdf');
INSERT INTO `privatecoachinfo` VALUES (17, 25, 4, 5, 5, 100, 100, '2020-05-01', 1, '', 'asdf');

-- ----------------------------
-- Table structure for subject
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject`  (
  `subId` int(0) NOT NULL AUTO_INCREMENT,
  `subname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sellingPrice` double NULL DEFAULT NULL,
  PRIMARY KEY (`subId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of subject
-- ----------------------------
INSERT INTO `subject` VALUES (1, '健身球', 300);
INSERT INTO `subject` VALUES (2, '跑步机', 35);
INSERT INTO `subject` VALUES (4, '压力车', 50);
INSERT INTO `subject` VALUES (5, '仰卧起坐', 20);
INSERT INTO `subject` VALUES (6, '健身操', 50);
INSERT INTO `subject` VALUES (7, 'ceshi ', 13);

SET FOREIGN_KEY_CHECKS = 1;
