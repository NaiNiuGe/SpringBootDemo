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

 Date: 07/09/2023 22:18:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course`  (
  `cNo` bigint NOT NULL AUTO_INCREMENT,
  `cName` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `tNo` char(5) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cNo`) USING BTREE,
  UNIQUE INDEX `cName`(`cName`) USING BTREE,
  INDEX `tNo`(`tNo`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES (1, '数据结构', '001');
INSERT INTO `course` VALUES (2, '操作系统', '002');
INSERT INTO `course` VALUES (3, '计算机网络', '001');
INSERT INTO `course` VALUES (4, '软件工程', '003');
INSERT INTO `course` VALUES (5, '计算机组成原理', '002');
INSERT INTO `course` VALUES (6, '数据库系统', '002');
INSERT INTO `course` VALUES (7, 'C语言', '003');
INSERT INTO `course` VALUES (8, '高等数学', '004');
INSERT INTO `course` VALUES (12, '马克思主义理论', '1');

SET FOREIGN_KEY_CHECKS = 1;
