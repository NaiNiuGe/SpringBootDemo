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

 Date: 07/09/2023 22:18:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `tNo` bigint NOT NULL AUTO_INCREMENT,
  `tName` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  PRIMARY KEY (`tNo`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (1, '张三');
INSERT INTO `teacher` VALUES (2, '李四');
INSERT INTO `teacher` VALUES (3, '王二');
INSERT INTO `teacher` VALUES (4, '王五');

SET FOREIGN_KEY_CHECKS = 1;
