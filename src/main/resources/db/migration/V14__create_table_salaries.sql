CREATE TABLE salaries (
                          id INT8 GENERATED BY DEFAULT AS IDENTITY,
                          salary_sum FLOAT8 NOT NULL,
                          salary_type VARCHAR(255),  -- Changed from int4 to VARCHAR(255)
                          valute VARCHAR(255),
                          PRIMARY KEY (id)
);
