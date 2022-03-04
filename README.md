# Topic5
This the repository to the Database Interaction and ORMs Challenge

##The Script to create the database
```
DROP DATABASE IF EXISTS db_authors;
CREATE DATABASE db_authors;
USE db_authors;
DROP TABLE IF EXISTS author;
CREATE TABLE author(
id SERIAL,
full_name varchar(50),
country varchar(20),
PRIMARY KEY (id));
DROP TABLE IF EXISTS book;
CREATE TABLE book(
id SERIAL,
title varchar(50),
published_year int,
PRIMARY KEY (id));
DROP TABLE IF EXISTS book_author;
create table book_author(
book_id BIGINT UNSIGNED,
author_id BIGINT UNSIGNED,
FOREIGN KEY (book_id)
REFERENCES book(id),
FOREIGN KEY (author_id)
REFERENCES author(id)
)
```

*The dependency used to this project was: spring-boot-starter-data-rest*
