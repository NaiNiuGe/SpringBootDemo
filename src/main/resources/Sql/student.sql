/*
 Navicat Premium Data Transfer

 Source Server         : drui
 Source Server Type    : MySQL
 Source Server Version : 80034
 Source Host           : localhost:3306
 Source Schema         : school

 Target Server Type    : MySQL
 Target Server Version : 80034
 File Encoding         : 65001

 Date: 07/09/2023 22:18:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `stuNo` bigint NOT NULL AUTO_INCREMENT,
  `stuName` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `gender` char(1) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL DEFAULT '男',
  `age` int NOT NULL,
  PRIMARY KEY (`stuNo`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, '李志', '男', 14);
INSERT INTO `student` VALUES (2, '宋东野', '男', 23);
INSERT INTO `student` VALUES (3, '赵雷', '男', 34);
INSERT INTO `student` VALUES (4, '马頔', '男', 32);
INSERT INTO `student` VALUES (5, '陈粒', '女', 18);
INSERT INTO `student` VALUES (6, '筠子', '女', 4);
INSERT INTO `student` VALUES (7, '寸铁', '男', 56);
INSERT INTO `student` VALUES (8, '狗毛', '男', 47);
INSERT INTO `student` VALUES (9, '崔健', '男', 39);
INSERT INTO `student` VALUES (10, '草东', '男', 40);
INSERT INTO `student` VALUES (11, '张悬', '女', 36);
INSERT INTO `student` VALUES (12, '撒娇', '女', 25);

SET FOREIGN_KEY_CHECKS = 1;
