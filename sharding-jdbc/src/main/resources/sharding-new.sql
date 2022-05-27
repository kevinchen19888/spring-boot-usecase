create
DATABASE sharding_m0;
USE
`sharding_m0`;
DROP TABLE IF EXISTS `test_user_0`;
CREATE TABLE `test_user_0`
(
    `id`     int(10) NOT NULL,
    username VARCHAR(225) DEFAULT NULL,
    password VARCHAR(225) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `test_user_1`;
CREATE TABLE test_user_1
(
    `id`       int(10) NOT NULL,
    `username` VARCHAR(225) DEFAULT NULL,
    password   VARCHAR(225) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
create
DATABASE sharding_m1;
USE
`sharding_m1`;
DROP TABLE IF EXISTS `test_user_0`;
CREATE TABLE `test_user_0`
(
    `id`       int(10) NOT NULL,
    `username` VARCHAR(225) DEFAULT NULL,
    password   VARCHAR(225) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `test_user_1`;
CREATE TABLE test_user_1
(
    `id`       int(10) NOT NULL,
    `username` VARCHAR(225) DEFAULT NULL,
    password   VARCHAR(225) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;