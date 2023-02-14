-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8mb3 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`adresse`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`adresse` ;

CREATE TABLE IF NOT EXISTS `mydb`.`adresse` (
  `idAdresse` INT NOT NULL AUTO_INCREMENT,
  `numero` INT NOT NULL,
  `rue` VARCHAR(100) NULL DEFAULT NULL,
  `ville` VARCHAR(60) NOT NULL,
  `cp` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAdresse`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`enseignant`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`enseignant` ;

CREATE TABLE IF NOT EXISTS `mydb`.`enseignant` (
  `idPersonne` INT NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(60) NOT NULL,
  `prenom` VARCHAR(60) NOT NULL,
  `specialite` VARCHAR(45) NOT NULL,
  `poste` VARCHAR(45) NOT NULL,
  `Adresse_idAdresse` INT NOT NULL,
  PRIMARY KEY (`idPersonne`),
  INDEX `fk_Enseignant_Adresse1_idx` (`Adresse_idAdresse` ASC) VISIBLE,
  CONSTRAINT `fk_Enseignant_Adresse1`
    FOREIGN KEY (`Adresse_idAdresse`)
    REFERENCES `mydb`.`adresse` (`idAdresse`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`etudiant`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`etudiant` ;

CREATE TABLE IF NOT EXISTS `mydb`.`etudiant` (
  `idPersonne` INT NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(60) NOT NULL,
  `prenom` VARCHAR(60) NOT NULL,
  `specialite` VARCHAR(45) NOT NULL,
  `section` VARCHAR(2) NOT NULL,
  `Adresse_idAdresse` INT NOT NULL,
  PRIMARY KEY (`idPersonne`),
  INDEX `fk_Etudiant_Adresse1_idx` (`Adresse_idAdresse` ASC) VISIBLE,
  CONSTRAINT `fk_Etudiant_Adresse1`
    FOREIGN KEY (`Adresse_idAdresse`)
    REFERENCES `mydb`.`adresse` (`idAdresse`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `mydb`.`etudiant_has_enseignant`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`etudiant_has_enseignant` ;

CREATE TABLE IF NOT EXISTS `mydb`.`etudiant_has_enseignant` (
  `Etudiant_idPersonne` INT NOT NULL,
  `Enseignant_idPersonne` INT NOT NULL,
  PRIMARY KEY (`Etudiant_idPersonne`, `Enseignant_idPersonne`),
  INDEX `fk_Etudiant_has_Enseignant_Enseignant1_idx` (`Enseignant_idPersonne` ASC) VISIBLE,
  INDEX `fk_Etudiant_has_Enseignant_Etudiant1_idx` (`Etudiant_idPersonne` ASC) VISIBLE,
  CONSTRAINT `fk_Etudiant_has_Enseignant_Enseignant1`
    FOREIGN KEY (`Enseignant_idPersonne`)
    REFERENCES `mydb`.`enseignant` (`idPersonne`),
  CONSTRAINT `fk_Etudiant_has_Enseignant_Etudiant1`
    FOREIGN KEY (`Etudiant_idPersonne`)
    REFERENCES `mydb`.`etudiant` (`idPersonne`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
