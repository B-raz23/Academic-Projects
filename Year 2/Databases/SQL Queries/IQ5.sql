SQL> SELECT Painting_ID, Painting_Name, Painter_ID, Returned_Date_To_Painter FROM Painting WHERE Returned_Date_To_Painter IS NOT NULL;

PAINTING_I PAINTING_NAME                                                                                                                                          PAINTER_ID    RETURNED_                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
---------- ------------------------------------------------------------------------------------------------------------------------------------------------------ ------------- ---------                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
P1         Night Watch                                                                                                                                            A3            12-NOV-21                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
P4         Impression Sunrise                                                                                                                                     A5            23-DEC-21                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
P5         The Starry Night                                                                                                                                       A6            25-DEC-21                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   

SQL> spool off