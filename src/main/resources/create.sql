CREATE TABLE USER_APP (
    id_USER INT AUTO_INCREMENT PRIMARY KEY,
    firstname VARCHAR(255),
    lastname VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255)
);

CREATE TABLE PRODUCT (
    id_PRODUCT INT AUTO_INCREMENT PRIMARY KEY,
    name_product VARCHAR(255),
    description VARCHAR(255),
    starting_value FLOAT,
    path_image VARCHAR(255)
);

CREATE TABLE OFFER (
    id_offer INT AUTO_INCREMENT PRIMARY KEY,
    value_offer FLOAT,
    offer_datetime DATETIME,
    id_PRODUCT INT,
    id_USER INT,
    CONSTRAINT fk_id_user FOREIGN KEY (id_USER) REFERENCES USER_APP(id_USER),
    CONSTRAINT fk_id_product FOREIGN KEY (id_PRODUCT) REFERENCES PRODUCT(id_PRODUCT)
);
INSERT INTO USER_APP (firstname,lastname,email,password) VALUES ('firstname','lastname','email','password');
INSERT INTO PRODUCT (name_product,description,starting_value,path_image) VALUES ('name_product','description',1,'pathToImg');

