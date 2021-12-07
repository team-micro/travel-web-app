# Quickstart
Usage assumes prior setup of the SQL database for test data insertion 

## Test Directory Structure
```bash
.
├── build.sh
├── destination
│   ├── destination_schema.sql
│   ├── destinations-notebook.ipynb
│   ├── generate_sql_destination.py
│   ├── test_destinations.sql
│   └── uscities.csv
├── generic_sql_generation.py
├── java
│   └── com
│       └── hcl
│           ├── rest
│           │   └── api
│           └── springboot
│               └── UserServiceApplicationTests.java
├── README.md
├── recommendation
│   ├── generate_sql_recommendation.py
│   └── recommendation_table_schema.sql
├── requirements.txt
├── review
│   ├── generate_sql_review.py
│   ├── review_table_schema.sql
│   └── test_reviews.sql
├── test_destinations.sql
├── test_recommendations.sql
├── test_reviews.sql
├── test_users.sql
└── user
    ├── _beans.xml
    ├── generate_sql_users.py
    ├── test_users.sql
    ├── user.json
    ├── users.json
    └── user_table_schema.sql
```

## Usage
To use the `build.sh` script to do the following

1. Configure your Python environment and install the dependencies in `requirements.txt`
2. In the root `../test/` directory run `bash build.sh`
3. Run the generated SQL scripts `test_<service>.sql` using either and IDE or CLI to insert the randomly generated test data into the backend MySQL database
4. Check the backend SQL database to verify successful insertion
5. Test accordingly with `Postman` to validate service of test data and target endpoints
