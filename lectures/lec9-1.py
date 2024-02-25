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
    for i in range(1,13,2):
        print((i*'X').center(11))