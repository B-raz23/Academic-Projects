'''This is a python program that takes 2 words as input from the user and prints
      out a list containing the letters which the 2 words have in common.'''


# Taking two different words as input 
word1 = input("Enter the first word: ").lower()
word2 = input("Enter the second word: ").lower()

# Making two different sets for the given two words 
set_word1 = set(word1)
set_word2 = set(word2)

# finding the common elements in the two sets
common = set_word1.intersection(set_word2)

# Converting the common set into a list
new_list = list(common)

# Printing out the list with common elements
print("\nThe letters in common are: ", new_list)
