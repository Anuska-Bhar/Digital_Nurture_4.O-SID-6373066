CREATE TABLE accounts (
    account_id NUMBER,
    customer_id NUMBER,
    balance NUMBER
);


CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_acc IN NUMBER,
    p_to_acc IN NUMBER,
    p_amount IN NUMBER
) AS
    v_balance NUMBER;
BEGIN
    
    SELECT balance INTO v_balance FROM accounts WHERE account_id = p_from_acc;

    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds');
    ELSE
        UPDATE accounts
        SET balance = balance - p_amount
        WHERE account_id = p_from_acc;

        UPDATE accounts
        SET balance = balance + p_amount
        WHERE account_id = p_to_acc;

        COMMIT;
    END IF;
END;
/
