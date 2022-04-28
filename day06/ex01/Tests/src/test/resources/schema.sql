DROP TABLE IF EXISTS product CASCADE;

CREATE TABLE IF NOT EXISTS product (
    identifier  INT IDENTITY PRIMARY KEY,
    name        VARCHAR(40) NOT NULL,
    price       INT NULL
)
