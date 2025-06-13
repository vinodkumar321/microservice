-- src/main/resources/schema.sql
CREATE TABLE exchange_value (
                                id BIGINT PRIMARY KEY,
                                currency_from VARCHAR(10),
                                currency_to VARCHAR(10),
                                conversion_multiple DECIMAL(19,2),
                                port INTEGER
);
