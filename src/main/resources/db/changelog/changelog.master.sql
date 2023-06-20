--liquibase formatted sql

--changeset tattoo_kot:1.0.1
CREATE TABLE IF NOT EXISTS users(
    id VARCHAR PRIMARY KEY,
    name VARCHAR(100)
);

--changeset tattoo_kot:1.0.2
INSERT INTO users (id, name) VALUES (1, 'John');