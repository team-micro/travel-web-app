-- auto-generated definition
create table review_table
(
    id             int auto_increment
        primary key,
    author         varchar(255) null,
    content        varchar(255) null,
    destination_id int          null,
    review_subject varchar(255) null
);

