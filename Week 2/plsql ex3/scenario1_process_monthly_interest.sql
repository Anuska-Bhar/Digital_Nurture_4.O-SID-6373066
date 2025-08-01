CREATE TABLE savings_accounts (
    account_id NUMBER,
    customer_id NUMBER,
    balance NUMBER
);


CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    FOR acc IN (SELECT * FROM savings_accounts) LOOP
        UPDATE savings_accounts
        SET balance = balance + (balance * 0.01)
        WHERE account_id = acc.account_id;
    END LOOP;
    COMMIT;
END;
/
