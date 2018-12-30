create database play_database;
CREATE  TABLE `play_database`.`user_register` (

  `id` BIGINT NOT NULL ,

  `userid` VARCHAR(45) NOT NULL ,

  `password` VARCHAR(45) NOT NULL ,

  `email` VARCHAR(45) NOT NULL ,

  `firstname` VARCHAR(45) NOT NULL ,

  `lastname` VARCHAR(45) NOT NULL ,

  `status` INT NOT NULL,
  
  `timestamp` TIMESTAMP NOT NULL

  PRIMARY KEY (`id`) );

CREATE  TABLE `play_database`.`user_role` (

  `id` BIGINT NOT NULL ,

  `role` VARCHAR(45) NOT NULL ,

  `user_register` BIGINT NOT NULL ,

  PRIMARY KEY (`id`) );

CREATE  TABLE `play_database`.`user_details` (

  `id` BIGINT NOT NULL ,

  `name` VARCHAR(45) NULL ,

  `phone` VARCHAR(45) NULL ,

  `address` VARCHAR(45) NULL ,

  PRIMARY KEY (`id`) );

