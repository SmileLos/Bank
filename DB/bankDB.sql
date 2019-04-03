-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema bank
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bank
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bank` DEFAULT CHARACTER SET utf8 ;
USE `bank` ;

-- -----------------------------------------------------
-- Table `bank`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bank`.`user` (
  `userId` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `sureName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`userId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bank`.`account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bank`.`account` (
  `accoutId` INT NOT NULL AUTO_INCREMENT,
  `account` INT NOT NULL,
  `userId` INT NOT NULL,
  PRIMARY KEY (`accoutId`),
  INDEX `userId_idx` (`userId` ASC) VISIBLE,
  CONSTRAINT `userId`
    FOREIGN KEY (`userId`)
    REFERENCES `bank`.`user` (`userId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `bank`.`user`
-- -----------------------------------------------------
START TRANSACTION;
USE `bank`;
INSERT INTO `bank`.`user` (`userId`, `name`, `sureName`) VALUES (1, 'Platon', 'Ivanov');
INSERT INTO `bank`.`user` (`userId`, `name`, `sureName`) VALUES (2, 'Klim', 'Nikonov');
INSERT INTO `bank`.`user` (`userId`, `name`, `sureName`) VALUES (3, 'Bear', 'Grills');
INSERT INTO `bank`.`user` (`userId`, `name`, `sureName`) VALUES (4, 'Lena', 'Oxton');
INSERT INTO `bank`.`user` (`userId`, `name`, `sureName`) VALUES (5, 'Rachel', 'Amber');
INSERT INTO `bank`.`user` (`userId`, `name`, `sureName`) VALUES (6, 'Hitomi', 'Mikaro');
INSERT INTO `bank`.`user` (`userId`, `name`, `sureName`) VALUES (7, 'Garu', 'Lilo');
INSERT INTO `bank`.`user` (`userId`, `name`, `sureName`) VALUES (8, 'Evgeny', 'Pastebailo');
INSERT INTO `bank`.`user` (`userId`, `name`, `sureName`) VALUES (9, 'Mila', 'Vito');
INSERT INTO `bank`.`user` (`userId`, `name`, `sureName`) VALUES (10, 'Franz', 'Gerber');

COMMIT;


-- -----------------------------------------------------
-- Data for table `bank`.`account`
-- -----------------------------------------------------
START TRANSACTION;
USE `bank`;
INSERT INTO `bank`.`account` (`accoutId`, `account`, `userId`) VALUES (1, 17, 1);
INSERT INTO `bank`.`account` (`accoutId`, `account`, `userId`) VALUES (2, 15000, 2);
INSERT INTO `bank`.`account` (`accoutId`, `account`, `userId`) VALUES (3, 6000, 4);
INSERT INTO `bank`.`account` (`accoutId`, `account`, `userId`) VALUES (4, 731, 5);
INSERT INTO `bank`.`account` (`accoutId`, `account`, `userId`) VALUES (5, 94615, 6);
INSERT INTO `bank`.`account` (`accoutId`, `account`, `userId`) VALUES (6, 12354, 3);
INSERT INTO `bank`.`account` (`accoutId`, `account`, `userId`) VALUES (7, 49161, 8);
INSERT INTO `bank`.`account` (`accoutId`, `account`, `userId`) VALUES (8, 3316, 8);
INSERT INTO `bank`.`account` (`accoutId`, `account`, `userId`) VALUES (9, 28481, 10);
INSERT INTO `bank`.`account` (`accoutId`, `account`, `userId`) VALUES (10, 8941230, 9);

COMMIT;

