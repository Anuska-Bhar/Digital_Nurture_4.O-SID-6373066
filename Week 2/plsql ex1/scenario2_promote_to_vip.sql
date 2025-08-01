
ALTER TABLE customers ADD (balance NUMBER, IsVIP CHAR(1));

BEGIN
    FOR cust IN (SELECT * FROM customers) LOOP
        IF cust.balance > 10000 THEN
            UPDATE customers
            SET IsVIP = 'T'
            WHERE customer_id = cust.customer_id;
        END IF;
    END LOOP;
    COMMIT;
END;
/
