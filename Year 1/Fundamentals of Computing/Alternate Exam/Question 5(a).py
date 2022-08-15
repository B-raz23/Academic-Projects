'''This is a program that takes input from the user a string of numbers (eg.
    “24453”), then all the numbers from the string must be put in a list.
        The program then computes the sum, maximum and minimum from
                            the list of numbers.'''


# Creating a list
li = []

# Input for a string of numbers from the user
number = input("Enter a string of numbers: ")

# Fetching all the digits in the given string of number
for i in number:
    li.append(int(i))   # appending each digit in integer format in the list

# Initializing 3 different variables as:
total_sum = 0
max_number = li[0]
min_number = li[0]

# Iterating through the list li
for each in li:
    total_sum = total_sum + each    # calculating the sum of each digits
    
    if(each > max_number):      # finding the maximum number in the list
        max_number = each

    if(each < min_number):      # finding the minimum number in the list
        min_number = each

# Printing sum, maximum and minimum numbers
print("\nThe sum of all the numbers is: ", total_sum)
print("The maximum number is: ", max_number)
print("The minimum number is: ", min_number)

