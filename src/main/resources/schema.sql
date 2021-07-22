DROP TABLE IF EXISTS Client;

CREATE TABLE Client
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(250) NOT NULL,
    last_name  VARCHAR(250) NOT NULL,
    age        Number default null,
    PRIMARY KEY (id)
);