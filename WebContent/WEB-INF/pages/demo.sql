-- ----------------------------
-- Table structure for `studentclass`
-- ----------------------------
DROP TABLE IF EXISTS `studentclass`;
CREATE TABLE `studentclass` (
  `ClassId` int(3) NOT NULL AUTO_INCREMENT,
  `ClassName` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`ClassId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `Uid` binary(36) NOT NULL COMMENT 'Uid',
  `Name` varchar(20) NOT NULL,
  `Age` int(3) NOT NULL,
  `ClassId` int(3) NOT NULL,
  PRIMARY KEY (`Uid`),
  KEY `StudentClass` (`ClassId`),
  CONSTRAINT `StudentClass` FOREIGN KEY (`ClassId`) REFERENCES `studentclass` (`ClassId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

