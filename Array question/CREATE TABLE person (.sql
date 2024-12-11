 CREATE TABLE person (
    ->   party_id VARCHAR(20) NOT NULL PRIMARY KEY,
    ->   first_name VARCHAR(255) DEFAULT NULL,
    ->   middle_name VARCHAR(255) DEFAULT NULL,
    ->   last_name VARCHAR(255) DEFAULT NULL,
    ->   gender CHAR(1) DEFAULT NULL,
    ->   birth_date DATE DEFAULT NULL,
    ->   marital_status_enum_id VARCHAR(20) DEFAULT NULL,
    ->   employment_status_enum_id VARCHAR(20) DEFAULT NULL,
    ->   occupation VARCHAR(255) DEFAULT NULL,
    ->   FOREIGN KEY (party_id) REFERENCES party(party_id)
    -> );
    