SQL> SELECT a.Customer_Name, b.Painting_Name, c.Order_Type, d.Order_Date FROM Order_Painting c
  2  	JOIN Painting b ON c.Painting_ID = b.Painting_ID
  3  	JOIN Orders d ON d.Order_ID = c.Order_ID
  4  	JOIN Customer a ON a.Customer_ID = d.Customer_ID
  5  	WHERE d.Customer_ID = 'C7' AND c.Order_Type = 'Lease';

CUSTOMER_NAME                                      PAINTING_NAME                                                                                                                                          ORDER ORDER_DAT                                                                                                                                                                                                                                                                                           
-------------------------------------------------- ------------------------------------------------------------------------------------------------------------------------------------------------------ ----- ---------                                                                                                                                                                                                                                                                                           
Leia Osborne                                       Hare                                                                                                                                                   Lease 23-SEP-21                                                                                                                                                                                                                                                                                           
Leia Osborne                                       Hare                                                                                                                                                   Lease 09-NOV-21                                                                                                                                                                                                                                                                                           

SQL> spool off
