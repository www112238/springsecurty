/*
 Navicat Premium Data Transfer

 Source Server         : buzhidaoshi
 Source Server Type    : MySQL
 Source Server Version : 50738
 Source Host           : 203.104.40.133:3306
 Source Schema         : buzhidaoshi

 Target Server Type    : MySQL
 Target Server Version : 50738
 File Encoding         : 65001

 Date: 28/02/2024 10:05:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for 业务
-- ----------------------------
DROP TABLE IF EXISTS `业务`;
CREATE TABLE `业务`  (
  `yewu` text CHARACTER SET utf8 COLLATE utf8_general_ci
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of 业务
-- ----------------------------
INSERT INTO `业务` VALUES ('1 添加设备信息接口：\r\n请求方法：POST\r\n请求URL：/api/equipment/add\r\n请求参数：\r\nname：设备名称\r\nmodel：设备型号\r\nserial_number：设备序列号\r\npurchase_date：采购日期\r\ndepartment：所属部门\r\ncategory：设备分类\r\n返回结果：成功添加的设备信息\r\n 2 查询设备信息接口：\r\n\r\n请求方法：GET\r\n请求URL：/api/equipment/{equipment_id}\r\n请求参数：equipment_id（设备ID）\r\n返回结果：指定设备ID的设备信息\r\n添加设备维护记录接口：\r\n\r\n请求方法：POST\r\n请求URL：/api/equipment/maintenance/add\r\n请求参数：\r\nequipment_id：设备ID\r\nmaintenance_record：维护记录\r\nmaintenance_date：维护日期\r\nmaintenance_person：维护人员\r\nmaintenance_cost：维护费用\r\n返回结果：成功添加的维护记录信息\r\n3 查询设备维护记录接口：\r\n\r\n请求方法：GET\r\n请求URL：/api/equipment/maintenance/{equipment_id}\r\n请求参数：equipment_id（设备ID）\r\n返回结果：指定设备ID的维护记录信息列表\r\n4 查询设备状态接口：\r\n\r\n请求方法：GET\r\n请求URL：/api/equipment/status/{equipment_id}\r\n请求参数：equipment_id（设备ID）\r\n返回结果：指定设备ID的当前状态信息\r\n\r\n\r\n5 统计设备的维护次数和总维护费用 按部门统计  按设备统计 总次数 总花费');

-- ----------------------------
-- Table structure for equipment
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment`  (
  `equipment_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '设备ID',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '设备名称',
  `model` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '设备型号',
  `serial_number` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '序列号',
  `purchase_date` date DEFAULT NULL COMMENT '采购日期',
  `status` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '设备状态 1可用 2不可用',
  `department` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '所属部门',
  `responsible_person` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '负责人',
  `category` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '设备分类',
  PRIMARY KEY (`equipment_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of equipment
-- ----------------------------
INSERT INTO `equipment` VALUES (1, '电脑', 'ThinkPad T480', 'SN123456', '2022-01-15', '1', 'IT部门', '张三', '办公设备');
INSERT INTO `equipment` VALUES (2, '打印机', 'HP LaserJet Pro MFP M428fdn', 'SN789012', '2021-12-20', '1', '行政部门', '李四', '办公设备');
INSERT INTO `equipment` VALUES (3, '办公椅', 'IKEA MARKUS', 'SN345678', '2022-02-05', '1', '行政部门', '王五', '办公家具');

-- ----------------------------
-- Table structure for equipment_sub
-- ----------------------------
DROP TABLE IF EXISTS `equipment_sub`;
CREATE TABLE `equipment_sub`  (
  `sub_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '子表ID',
  `equipment_id` int(11) DEFAULT NULL COMMENT '设备ID',
  `maintenance_record` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '维护记录',
  `maintenance_date` date DEFAULT NULL COMMENT '维护日期',
  `maintenance_person` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '维护人员',
  `maintenance_cost` decimal(10, 2) DEFAULT NULL COMMENT '维护费用',
  PRIMARY KEY (`sub_id`) USING BTREE,
  INDEX `equipment_id`(`equipment_id`) USING BTREE,
  CONSTRAINT `equipment_sub_ibfk_1` FOREIGN KEY (`equipment_id`) REFERENCES `equipment` (`equipment_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of equipment_sub
-- ----------------------------
INSERT INTO `equipment_sub` VALUES (1, 1, '更换了新的内存条', '2022-02-10', '维修人员A', 100.00);
INSERT INTO `equipment_sub` VALUES (2, 2, '清洁打印头', '2022-02-01', '维修人员B', 50.00);

SET FOREIGN_KEY_CHECKS = 1;
