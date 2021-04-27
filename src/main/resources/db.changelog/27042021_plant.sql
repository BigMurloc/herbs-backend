CREATE SEQUENCE hibernate_sequence;
CREATE TABLE IF NOT EXISTS plant
(
    id          BIGINT,
    name      TEXT,
    species     TEXT,
    created_at  DATE,
    updated_at DATE,
    PRIMARY KEY (id)
)