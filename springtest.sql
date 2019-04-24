/*
Navicat MySQL Data Transfer

Source Server         : mybatis
Source Server Version : 50560
Source Host           : localhost:3306
Source Database       : springtest

Target Server Type    : MYSQL
Target Server Version : 50560
File Encoding         : 65001

Date: 2019-04-24 19:24:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(2) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) DEFAULT NULL,
  `usex` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '小九九', '男');
INSERT INTO `user` VALUES ('7', '张三', '男');
INSERT INTO `user` VALUES ('8', '小飞', '男');
