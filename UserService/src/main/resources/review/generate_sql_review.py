import os
import random
from typing import Generator
import numpy as np
import names
from pathlib import Path

ROOT = Path(os.getcwd())
QUANTITY = 100
print(ROOT)

target_path = ROOT/"test_reviews.sql"
if os.path.exists(ROOT / "test_reviews.sql"):
    print("Deleting existing SQL test script:", target_path)
    os.remove(target_path)


np.random.seed(777)


def generate_reviews():
    # -> Generator[str]:
    base_sql = """insert into `review_table`(
        `author`,
        `content`,
        `destination_id`,
        `review_subject`

    ) VALUES (
                "{}","{}",{},"{}"
    );
    """
    content_str = "foobar"
    sql_list = []

    print("Writing SQL test script to:", target_path)
    with open(target_path, "w") as fh:
        for i in range(1,QUANTITY+1):
            # author == user_id: int
            a = i
            # content: str
            c = content_str * random.randint(1, (i % 11) + 2)
            # destination_id: int
            d = random.randint(0, QUANTITY+1)
            # review_subject: str
            r = content_str * random.randint(1, (i % 11) + 2)

            sql_cmd = base_sql.format(
                a, c, d, r
            )
            fh.write(sql_cmd)
            sql_list.append(sql_cmd)

    def _generate():
        for _ in sql_list:
            yield _

    return _generate()


if __name__ == "__main__":
    g = generate_reviews()
    _g = next(g)
    print(_g)
