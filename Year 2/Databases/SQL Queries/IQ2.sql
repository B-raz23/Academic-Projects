SQL> SELECT a.Painting_ID, a.Painting_Name, a.Monthly_Charge, a.Buying_Cost AS Paid_Price, b.Painter_ID, b.Painter_Name FROM Painting a JOIN Painter b ON a.Painter_ID = b.Painter_ID;

PAINTING_I PAINTING_NAME                                                                                                                                          MONTHLY_CHARGE PAID_PRICE PAINTER_ID    PAINTER_NAME                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
---------- ------------------------------------------------------------------------------------------------------------------------------------------------------ -------------- ---------- ------------- ------------------------------------------------------------------------------------------                                                                                                                                                                                                                                                                                                                                                                                                                        
P1         Night Watch                                                                                                                                                       100       1000 A3            Rembrandt                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
P2         The Mona Lisa                                                                                                                                                     150       1500 A4            Leonardo da Vinci                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
P3         Hare                                                                                                                                                              100       1000 A1            Albrecht Durer                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
P4         Impression Sunrise                                                                                                                                                200       2000 A5            Claude Monet                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
P5         The Starry Night                                                                                                                                                  175       1750 A6            Vincent van Gogh                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
P6         Race Horses                                                                                                                                                       250       2500 A7            Edgar Degas                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
P7         Water Lilies                                                                                                                                                      275       2750 A5            Claude Monet                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      

7 rows selected.

SQL> spool off