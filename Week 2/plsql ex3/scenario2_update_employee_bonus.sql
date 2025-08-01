CREATE TABLE employees (
    emp_id NUMBER,
    name VARCHAR2(100),
    department_id NUMBER,
    salary NUMBER
);


CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_dept_id IN NUMBER,
    p_bonus_pct IN NUMBER
) AS
BEGIN
    UPDATE employees
    SET salary = salary + (salary * p_bonus_pct / 100)
    WHERE department_id = p_dept_id;
    COMMIT;
END;
/
