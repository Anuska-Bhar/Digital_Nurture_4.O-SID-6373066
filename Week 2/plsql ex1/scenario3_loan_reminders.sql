CREATE TABLE loans (
    loan_id NUMBER,
    customer_id NUMBER,
    due_date DATE
);


DECLARE
    v_cust_id loans.customer_id%TYPE;
    v_due loans.due_date%TYPE;
BEGIN
    FOR loan_rec IN (SELECT * FROM loans WHERE due_date <= SYSDATE + 30) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan for customer ID ' || loan_rec.customer_id || 
                             ' is due on ' || TO_CHAR(loan_rec.due_date, 'DD-MON-YYYY'));
    END LOOP;
END;
/
