CREATE TABLE tag (
    id BIGINT (20) PRIMARY KEY AUTO_INCREMENT,
    codigo VARCHAR (20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE chu (
    id BIGINT (20) PRIMARY KEY AUTO_INCREMENT,
    whentodo DATETIME NOT NULL,
    nivel INTEGER NOT NULL,
    abastecimento DECIMAL (4,1) NOT NULL,
    condicao VARCHAR(10) NOT NULL,
    observacao TEXT,
    tag_id BIGINT (20) NOT NULL,
    app_user_id BIGINT(20) NOT NULL,
    FOREIGN KEY (tag_id) REFERENCES tag (id),
    FOREIGN KEY (app_user_id) REFERENCES app_user (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;