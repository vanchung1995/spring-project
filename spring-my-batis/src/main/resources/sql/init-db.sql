create database IF NOT EXISTS spring_learning;
create user 'mysqluser'@'%' identified by 'password';
grant all privileges on spring_learning.* to 'mysqluser'@'%';


CREATE TABLE spring_learning.`user` IF NOT EXISTS (
	user_id INT auto_increment NOT NULL,
	username varchar(100) NOT NULL,
	created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP  NOT NULL,
	status int NOT NULL DEFAULT 1,
	email varchar(100) DEFAULT NULL,
	CONSTRAINT user_pk PRIMARY KEY (user_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;
