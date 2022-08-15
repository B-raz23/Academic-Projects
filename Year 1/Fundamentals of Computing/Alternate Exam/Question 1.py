'''This is the python program for sorting the given list in ascending order.'''


# Given unsorted list is:
L = [9, 2, 1, 7, 5]

# initializing i as 1
i = 1

# Looping Statements for multiple execution of codes based on condition
while(True):
    # comparing 'i' and length of the list L
    if(i < len(L)):
        key = L[i]      # assigning key the value of list as per the index
        j = i - 1           # reducing i by 1 and storing in j

        # using loop for multiple execution of codes
        while(True):
            if(j >= 0 and key < L[j]):  # checking the condition as specified
                L[j + 1] = L[j]     # sorting the list L based on the index value
                j = j - 1       # decreasing value in j by 1

            else:       # for unsatisfied case
                L[j + 1] = key      # assign the value in key to specified index of list L
                i = i + 1       # increasing the value of i by 1
                break   # terminating the inner loop
                
    else:   # when condition is not true
        print("The sorted list is: ", L)    # printing the sorted list
        break       # terminating the outer loop
        
