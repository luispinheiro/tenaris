CREATE TABLE app_user (
    id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(20) NOT NULL,
    password VARCHAR(10) NOT NULL,
    display_name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    matricula VARCHAR(20) NOT NULL,
    turno VARCHAR(20) NOT NULL,
    cargo VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;