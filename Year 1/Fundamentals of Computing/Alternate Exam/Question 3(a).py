'''Corrected program of Question-3'''


# given 2D list
marks = [['john',80, 90, 76, 82],['katy', 50, 55, 70, 65],['sydney',80, 72, 88, 90]]

# creating a dictionary
marks_c = {}

# loop for iterating the 2D list
for i in range(len(marks)):
    name = marks[i][0]      # fetching the name of students
    l = []      # new list
    
    for j in range(1,len(marks[i])):    # iterating through the list of 2D list 
        l.append(marks[i][j])       # appending each mark in the inner list of 2D list
        marks_c[name] = l       # appending the dictionary with key as name and value as list 
        
print(marks_c)      # printing the dictionary
