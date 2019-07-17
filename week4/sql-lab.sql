-- SQL Lab 

-- 1.0 SQL Queries
-- In this section you will be performing various queries against the Oracle Chinook database.
    -- 1.1 SELECT
    -- Task – Select all records from the Employee table.
    
    -- Task – Select all records from the Employee table where last name is King.
    
    -- Task – Select all records from the Employee table where first name is Andrew and REPORTSTO is NULL.
    
    -- 1.2 ORDER BY
    -- Task – Select all albums in Album table and sort result set in descending order by title.

    -- Task – Select first name from Customer and sort result set in ascending order by city

    -- 1.3 INSERT INTO
    -- Task – Insert two new records into Genre table

    -- Task – Insert two new records into Employee table
     
    -- Task – Insert two new records into Customer table

    -- 1.4 UPDATE
    -- Task – Update Aaron Mitchell in Customer table to Robert Walter

    -- Task – Update name of artist in the Artist table “Creedence Clearwater Revival” to “CCR”

    -- 1.5 LIKE
    -- Task – Select all invoices with a billing address like “T%”

    -- 1.6 BETWEEN
    -- Task – Select all invoices that have a total between 15 and 50

    -- Task – Select all employees hired between 1st of June 2003 and 1st of March 2004

    -- 1.7 DELETE
    -- Task – Delete a record in Customer table where the name is Robert Walter (There may be constraints that rely on this, find out how to resolve them).

-- 2.0	SQL Functions
-- In this section you will be using the Oracle system functions, as well as your own functions, to perform various actions against the database
    -- 2.1 System Defined Functions
    -- Task – Use a function that returns the current time.

    -- Task – Use a function that returns the length of the name of a mediatype from the mediatype table

    -- 2.2 System Defined Aggregate Functions
    -- Task – Use a function that returns the average total of all invoices

    -- Task – Use a function that returns the most expensive track

-- 3.0 JOINS
-- In this section you will be working with combing various tables through the use of joins. You will work with outer, inner, right, left, cross, and self joins.
    -- 3.1 INNER
    -- Task – Create an inner join that joins customers and orders and specifies the name of the customer and the invoiceId.

    -- 3.2 OUTER
    -- Task – Create an outer join that joins the customer and invoice table, specifying the CustomerId, firstname, lastname, invoiceId, and total.

    -- 3.3 RIGHT
    -- Task – Create a right join that joins album and artist specifying artist name and title.

    -- 3.4 CROSS
    -- Task – Create a cross join that joins album and artist and sorts by artist name in ascending order.

    -- 3.5 SELF
    -- Task – Perform a self-join on the employee table, joining on the reportsto column.
