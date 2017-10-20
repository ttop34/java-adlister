use adlister_db;
drop table IF EXISTS users;

CREATE TABLE IF NOT EXISTS users (
  id           INT UNSIGNED NOT NULL AUTO_INCREMENT,
  username      VARCHAR(50)  NOT NULL,
  email         VARCHAR(50) NOT NULL,
  password      VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
);