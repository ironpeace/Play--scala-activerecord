# Tasks schema

# --- !Ups
create table users (
  name varchar(128) not null,
  age int,
  createdat date,
  id bigint not null primary key auto_increment
);

# --- !Downs
drop table users;