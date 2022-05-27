-- 废弃
create DATABASE sharding_m0;
create DATABASE sharding_m0_s0;
create DATABASE sharding_m0_s1;
create DATABASE sharding_m1;
create DATABASE sharding_m1_s0;
create DATABASE sharding_m1_s1;

-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

USE
`sharding_m0`;
DROP TABLE IF EXISTS `t_user_0`;
CREATE TABLE `t_user_0`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_1`;
CREATE TABLE `t_user_1`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_2`;
CREATE TABLE `t_user_2`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_3`;
CREATE TABLE `t_user_3`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

USE
`sharding_m0_s0`;
DROP TABLE IF EXISTS `t_user_0`;
CREATE TABLE `t_user_0`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_1`;
CREATE TABLE `t_user_1`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_2`;
CREATE TABLE `t_user_2`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_3`;
CREATE TABLE `t_user_3`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

USE
`sharding_m0_s1`;
DROP TABLE IF EXISTS `t_user_0`;
CREATE TABLE `t_user_0`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_1`;
CREATE TABLE `t_user_1`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_2`;
CREATE TABLE `t_user_2`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_3`;
CREATE TABLE `t_user_3`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

USE
`sharding_m1`;

DROP TABLE IF EXISTS `t_user_0`;
CREATE TABLE `t_user_0`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_1`;
CREATE TABLE `t_user_1`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_2`;
CREATE TABLE `t_user_2`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_3`;
CREATE TABLE `t_user_3`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

USE
`sharding_m1_s0`;

DROP TABLE IF EXISTS `t_user_0`;
CREATE TABLE `t_user_0`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_1`;
CREATE TABLE `t_user_1`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_2`;
CREATE TABLE `t_user_2`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_3`;
CREATE TABLE `t_user_3`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

USE
`sharding_m1_s1`;

DROP TABLE IF EXISTS `t_user_0`;
CREATE TABLE `t_user_0`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_1`;
CREATE TABLE `t_user_1`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_2`;
CREATE TABLE `t_user_2`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_user_3`;
CREATE TABLE `t_user_3`
(
    `id`   int(10) NOT NULL,
    `name` varchar(50) NOT NULL,
    `sex`  varchar(10) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;