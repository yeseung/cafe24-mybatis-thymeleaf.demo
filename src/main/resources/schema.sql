

CREATE TABLE `test` (
`id` INT(11) NOT NULL AUTO_INCREMENT,
`name` VARCHAR(255) NULL DEFAULT NULL COLLATE 'utf8mb3_general_ci',
PRIMARY KEY (`id`) USING BTREE
)
COLLATE='utf8mb3_general_ci'
ENGINE=InnoDB
;
