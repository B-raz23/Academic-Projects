'''Fixed python program for Question 3(b).'''


# creating class Person
class Person:
    def __init__(self, name, address, number):      # initializer of class Person
        """Constructor of Person"""
        self.name = name
        self.address = address
        self.number = number


    # creating other 3 functions for Person class with certain return values
    
    def get_Person(self):   
        """Returns the name of a person"""
        return name

    def get_all_detail(self):
        """Returns all the details of person"""
        return "HI! My name is " + self.name + " and I live at " + self.address

    def get_contact(self):
        """Returns the contact of the person"""
        return self.number
    

# creating another class Employee which inherits Person class
class Employee(Person):
    # initializer of class Person
    def __init__(self, name, address, number, salary, department):
        """Constructor of Employee"""
        Person.__init__(self, name, address, number)    # calling the initializer of Person class
        self.salary = salary
        self.department = department


    # creating other 3 functions for Employee class 
    
    def get_contact(self):
        """Checks if the number is none and returns the contact of the
person"""
        if number == None:
            return "Does not have a number"
        else:
            return number

    def change_number(self, new_number):
        """method for CHANGING the number of the person"""
        self.number += new_number
        
    def change_address(self, addr):
        """method for CHANGING the address of the person """
        self.address = addr

# calling the specified classes with certain parameters and printing the return values from the functions called 
foo = Person("Ram", "Kamalpokhari", "9812121212")
print(foo.get_all_detail())
print(foo.get_contact())
bar = Employee("Rabi", "Gaushala", "9836699636", "40000", "HR")
print(bar.get_all_detail())
bar.change_address("Koteshwor")
print(bar.get_all_detail())
