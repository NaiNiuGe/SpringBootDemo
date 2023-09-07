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

 Date: 07/09/2023 22:18:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score`  (
  `stuNo` bigint NOT NULL,
  `cNo` bigint NOT NULL,
  `score` smallint UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`stuNo`, `cNo`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES (1, 1, 56);
INSERT INTO `score` VALUES (1, 2, 87);
INSERT INTO `score` VALUES (1, 3, 69);
INSERT INTO `score` VALUES (1, 4, 92);
INSERT INTO `score` VALUES (2, 1, 76);
INSERT INTO `score` VALUES (2, 3, 69);
INSERT INTO `score` VALUES (2, 5, 90);
INSERT INTO `score` VALUES (3, 2, 53);
INSERT INTO `score` VALUES (3, 3, 96);
INSERT INTO `score` VALUES (4, 4, 67);
INSERT INTO `score` VALUES (5, 2, 70);
INSERT INTO `score` VALUES (5, 3, 81);
INSERT INTO `score` VALUES (5, 7, 78);
INSERT INTO `score` VALUES (5, 8, 69);
INSERT INTO `score` VALUES (6, 4, 93);
INSERT INTO `score` VALUES (6, 8, 62);
INSERT INTO `score` VALUES (7, 1, 58);
INSERT INTO `score` VALUES (7, 2, 76);
INSERT INTO `score` VALUES (8, 3, 65);
INSERT INTO `score` VALUES (8, 4, 89);
INSERT INTO `score` VALUES (9, 5, 92);
INSERT INTO `score` VALUES (9, 6, 90);
INSERT INTO `score` VALUES (9, 7, 42);
INSERT INTO `score` VALUES (9, 8, 80);
INSERT INTO `score` VALUES (10, 2, 75);
INSERT INTO `score` VALUES (10, 4, 69);
INSERT INTO `score` VALUES (11, 2, 100);
INSERT INTO `score` VALUES (11, 4, 92);
INSERT INTO `score` VALUES (11, 5, 99);
INSERT INTO `score` VALUES (11, 6, 76);
INSERT INTO `score` VALUES (12, 2, 83);
INSERT INTO `score` VALUES (12, 3, 71);
INSERT INTO `score` VALUES (13, 4, 80);
INSERT INTO `score` VALUES (13, 7, 96);

SET FOREIGN_KEY_CHECKS = 1;
