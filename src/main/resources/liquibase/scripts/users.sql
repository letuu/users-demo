-- liquibase formatted sql

-- changeset att:1
CREATE TABLE users
(
    id    SERIAL,
    email TEXT
);

-- changeset att:2
ALTER TABLE users
    ADD COLUMN name text;

-- changeset att:3
CREATE INDEX users_name_index ON users (name);
