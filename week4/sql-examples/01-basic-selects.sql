-- * means all columns not all records
SELECT * FROM customer;

-- we can specify just the columns we want instead
SELECT firstname, lastname FROM customer;

-- everything will be cast to lower case unless we put table names in "", but this looks bad below
SeleCT firsTNaMe fROM cuSTOMeR;

-- we can filter the results with the where clause, can also use AND/OR for multiple checks
SELECT * FROM album WHERE artistid = 10;
