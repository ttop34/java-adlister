use adlister_db;
drop table IF EXISTS ads;

CREATE TABLE IF NOT EXISTS ads (
  id           INT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id      INT UNSIGNED NOT NULL,
  title         VARCHAR(50) NOT NULL,
  description      VARCHAR(100) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users(id)
);