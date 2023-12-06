--liquibase formatted sql
--changeset priyanshu.kumawat:1

CREATE TABLE IF NOT EXISTS students(
id SERIAL NOT NULL PRIMARY KEY,
first_name VARCHAR(250) ,
last_name VARCHAR(250),
age INTEGER
);

--rollback DROP TABLE students

