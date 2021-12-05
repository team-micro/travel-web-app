import numpy as np
import names
np.random.seed(777)

base_sql = """insert into `Users`(
    `username`,
    `password`,
    `is_admin`,
    `first_name`,
    `last_name`,
    `email`

) VALUES (
             "{}","{}",{},"{}","{}","{}"
);
"""
with open("test_users.sql", "w") as fh:
    for i in range(100):
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
    


