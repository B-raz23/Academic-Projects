SQL> SELECT a.Painting_ID, a.Painting_Name, a.Painter_ID FROM Painting a JOIN Order_Painting b ON a.Painting_ID = b.Painting_ID JOIN Orders c ON b.Order_ID = c.Order_ID WHERE MONTHS_BETWEEN (Issue_DATE_From_Painter, Order_Date) < 3;

PAINTING_I PAINTING_NAME                                                                                                                                          PAINTER_ID                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
---------- ------------------------------------------------------------------------------------------------------------------------------------------------------ -------------                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
P2         The Mona Lisa                                                                                                                                          A4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
P7         Water Lilies                                                                                                                                           A5                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
P3         Hare                                                                                                                                                   A1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
P6         Race Horses                                                                                                                                            A7                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
P2         The Mona Lisa                                                                                                                                          A4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
P3         Hare                                                                                                                                                   A1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
P7         Water Lilies                                                                                                                                           A5                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        

7 rows selected.

SQL> spool off
