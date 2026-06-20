/*
    -- The bank wants to apply a discount to loan interest rates for customers above 60 years old.
*/
BEGIN
    FOR cust_rec IN (
        SELECT customer_id, interest_rate 
        FROM customers_loans 
        WHERE age > 60
    ) LOOP
        UPDATE customers_loans
        SET interest_rate = interest_rate - 0.01
        WHERE customer_id = cust_rec.customer_id;
    END LOOP;
    
    COMMIT;
END;
/

/*
    -- A customer can be promoted to VIP status based on their balance.
*/
BEGIN
    FOR v_cust IN (
        SELECT customer_id 
        FROM accounts 
        WHERE balance > 10000
    ) LOOP
        UPDATE accounts
        SET IsVIP = 'TRUE'
        WHERE customer_id = v_cust.customer_id;
    END LOOP;
    
    COMMIT;
END;
/

/*
    -- The bank wants to send reminders to customers whose loans are due within the next 30 days.
*/
BEGIN
    FOR loan_rec IN (
        SELECT customer_name, loan_id, due_date 
        FROM loans
        WHERE due_date BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Customer ' || loan_rec.customer_name || 
                             ', your loan (ID: ' || loan_rec.loan_id || 
                             ') is due on ' || TO_CHAR(loan_rec.due_date, 'YYYY-MM-DD') || '.');
    END LOOP;
END;
/

/*
    -- The bank needs to process monthly interest for all savings accounts.
*/
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    FOR acc_rec IN (
        SELECT account_id, balance 
        FROM accounts 
        WHERE account_type = 'Savings'
    ) LOOP
        UPDATE accounts
        SET balance = balance + (balance * 0.01)
        WHERE account_id = acc_rec.account_id;
    END LOOP;
    
    COMMIT;
END;
/

/*
    -- The bank wants to implement a bonus scheme for employees based on their performance.
*/
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_dept_id IN NUMBER,
    p_bonus_pct IN NUMBER
) IS
BEGIN
    UPDATE employees
    SET salary = salary + (salary * (p_bonus_pct / 100))
    WHERE department_id = p_dept_id;
    
    COMMIT;
END;
/

/*
    -- Customers should be able to transfer funds between their accounts.
*/
CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account IN NUMBER,
    p_to_account   IN NUMBER,
    p_amount       IN NUMBER
) IS
    v_balance NUMBER;
BEGIN
    SELECT balance INTO v_balance 
    FROM accounts 
    WHERE account_id = p_from_account;
    
    IF v_balance >= p_amount THEN
        UPDATE accounts 
        SET balance = balance - p_amount 
        WHERE account_id = p_from_account;
        
        UPDATE accounts 
        SET balance = balance + p_amount 
        WHERE account_id = p_to_account;
        
        COMMIT;
    ELSE
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in the source account.');
    END IF;
END;
/