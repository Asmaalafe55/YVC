# Chapter 10

# to convert all the small letters to capital
# x= 'heLLO hi 12!'
# print(x.upper())
# print(x.isupper()) -- True/False

# to convert all the capital letters to small letters
# x= 'heLLO hi 12!'
# print (x.lower())
# print (x.islower()) -- True/False

# to make only the first letter is capital
# x= 'heLLO hi 12!'
# print(x.capitalize())

# to make every word start with capital letter
# x= 'heLLO hi 12!'
# print(x.title())

# to swap the small letters to be capital and the capital to be small letters
# x= 'heLLO 12!'
# print(x.swapcase())

def f1():
    # its only works for string not integer
    for i in range(1,10,2):
        print((i*'X').center(20))
    for i in range(1,10,2):
        print((i*'X').rjust(11)) 
    for i in range(1,10,2):
        print((i*'X').ljust(11))
        
# f1()

def f2():
    names = ['david','sara','nicole','omar']
    age = [20,5,100,17]
    cities = ['tel aviv', 'motzkin','afula','akko']
    for i in range(len(names)):
        print(names[i].title().ljust(8), str(age[i]).zfill(3).rjust(3),'',cities[i].title())

# f2()


