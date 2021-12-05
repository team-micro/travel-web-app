create table users_table
(
    user_id   INT          not null auto_increment,
    email     varchar(255) not null,
    is_admin  boolean null,
    username  varchar(255) null,
    first_name varchar(255) null,
    last_name  varchar(255) null,
    password  varchar(255) null,
    PRIMARY KEY (user_id) # column_7 int null
);

# drop table users_table;
