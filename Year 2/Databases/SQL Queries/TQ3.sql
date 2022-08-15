SQL> SELECT * FROM (SELECT * FROM Customer) a INNER JOIN
  2  	(SELECT Customer_ID, COUNT(ORDER_ID) FROM Orders GROUP BY Customer_ID
  3  	HAVING COUNT(ORDER_ID) > 4) b ON (a.Customer_ID = b.Customer_ID);

no rows selected

SQL> spool off
