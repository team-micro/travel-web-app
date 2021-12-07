# !/bin/usr/python
import numpy as np
import names
np.random.seed(777)
QUANTITY = 100

print("Running ", __file__)
MODEL = "user"
CREATE_SQL = """
create table user_table
(
    user_id    INT          not null auto_increment,
    email      varchar(255) not null,
    is_admin   boolean      null,
    username   varchar(255) null,
    first_name varchar(255) null,
    last_name  varchar(255) null,
    password   varchar(255) null,
    PRIMARY KEY (user_id) # column_7 int null
);\n
"""
base_sql = """insert into `user_table`(
    `username`,
    `password`,
    `is_admin`,
    `first_name`,
    `last_name`,
    `email`

) VALUES (
             "{}","{}",{},"{}","{}","{}"
);\n
"""
with open("test_users.sql", "w") as fh:
    for i in range(1, QUANTITY + 1):
        if i == 1:
           fh.write(CREATE_SQL)
        u = "testUser{}".format(i)
        a,b = np.random.randint(1,50), np.random.randint(100,150)
        p = "Hello@World{}{}".format(a,b)
        ia = False
        full = names.get_full_name()
        f,l = [ _.strip() for _ in full.split()]
        e = f"{a}{f}{b}@123.com"
        fh.write(base_sql.format(
            u, p, ia, f, l,e
        ))
        print(base_sql.format(
                          u, p, ia, f, l,e
                      ))
    


