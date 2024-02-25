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

print('asklmnlakaa'.count('a'))
print('asklmnlakaa'.count('M'))
print(''.count('a'))
print('as'.count(''))
print('asklmnlakaa'.count('as'))
print('aaaaaaa'.count('aa'))


def f3(s):
    for i in 'abcd':
        print(i, s.count(i), s.count(i.upper()))
# f3('aabbbbbBBcccCCDDDDd')

print('asklmnlakaa'.find('m'))
print('asklmnlakaa'.find('M'))
print('asklmnlakaa'.replace('a','#'))
print('asklmnlakaa'.replace('a','#',3))
print('ask lmn lak aa'.split()) # --> ['ask','lmn','lak','aa']
# print('asklmnlakaa'.split(2)) # --> ['asklmn','lakaa']
L=['ASC','ASW','HTB','REV']
print('--'.join(L)) # --> 'ASC--ASW--HTB--REV'


def f4():
    sentence = input('enter a sentence: ')
    words = sentence.split()
    for word in words:
        print(word, len(word))
# f4()



