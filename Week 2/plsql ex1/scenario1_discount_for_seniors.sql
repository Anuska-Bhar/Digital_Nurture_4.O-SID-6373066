
CREATE TABLE customers (
    customer_id NUMBER,
    name VARCHAR2(100),
    age NUMBER,
    loan_interest_rate NUMBER
);


BEGIN
    FOR cust IN (SELECT * FROM customers) LOOP
        IF cust.age > 60 THEN
            UPDATE customers
            SET loan_interest_rate = loan_interest_rate - 1
            WHERE customer_id = cust.customer_id;
        END IF;
    END LOOP;
    COMMIT;
END;
/
