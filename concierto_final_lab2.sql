-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema conciertosperu
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `conciertosperu` ;

-- -----------------------------------------------------
-- Schema conciertosperu
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `conciertosperu` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `conciertosperu` ;

-- -----------------------------------------------------
-- Table `conciertosperu`.`artistas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `conciertosperu`.`artistas` (
  `idArtistas` INT NOT NULL,
  `Nombre_Grupo` VARCHAR(45) NULL DEFAULT NULL,
  `Fecha_creacion` DATE NULL DEFAULT NULL,
  `Tipo_musica` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idArtistas`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `conciertosperu`.`proveedores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `conciertosperu`.`proveedores` (
  `idProveedores` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL DEFAULT NULL,
  `Telefono` INT NULL DEFAULT NULL,
  `Elemento` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idProveedores`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `conciertosperu`.`concierto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `conciertosperu`.`concierto` (
  `idConcierto` INT NOT NULL,
  `Fecha_evento` VARCHAR(45) NULL DEFAULT NULL,
  `proveedores_idProveedores` INT NOT NULL,
  `artistas_idArtistas` INT NOT NULL,
  PRIMARY KEY (`idConcierto`),
  INDEX `fk_Concierto_proveedores_idx` (`proveedores_idProveedores` ASC) VISIBLE,
  INDEX `fk_Concierto_artistas1_idx` (`artistas_idArtistas` ASC) VISIBLE,
  CONSTRAINT `fk_Concierto_artistas1`
    FOREIGN KEY (`artistas_idArtistas`)
    REFERENCES `conciertosperu`.`artistas` (`idArtistas`),
  CONSTRAINT `fk_Concierto_proveedores`
    FOREIGN KEY (`proveedores_idProveedores`)
    REFERENCES `conciertosperu`.`proveedores` (`idProveedores`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `conciertosperu`.`integrantes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `conciertosperu`.`integrantes` (
  `idIntegrantes` INT NOT NULL,
  `Nombre` VARCHAR(45) NULL DEFAULT NULL,
  `Edad` INT NULL DEFAULT NULL,
  `Anhios_exp` INT NULL DEFAULT NULL,
  `rol` VARCHAR(40) NULL DEFAULT NULL,
  `artistas_idArtistas` INT NOT NULL,
  PRIMARY KEY (`idIntegrantes`),
  INDEX `fk_integrantes_artistas1_idx` (`artistas_idArtistas` ASC) VISIBLE,
  CONSTRAINT `fk_integrantes_artistas1`
    FOREIGN KEY (`artistas_idArtistas`)
    REFERENCES `conciertosperu`.`artistas` (`idArtistas`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
