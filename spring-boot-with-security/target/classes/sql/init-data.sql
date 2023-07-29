CREATE PROCEDURE generate_data()
BEGIN
  DECLARE i INT DEFAULT 1;
  WHILE i < 100 DO
    INSERT INTO `user` (`username`,`email`) VALUES (CONCAT('username', i), CONCAT('username', i, '@gmail.com'));
    SET i = i + 1;
  END WHILE;
END

CALL generate_data();