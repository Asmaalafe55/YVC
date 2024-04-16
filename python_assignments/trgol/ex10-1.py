def f():
    l = [1,5,4,3,2]
    l= sorted(l)
    print(l)

    l = [1,5,4,3,2]
    l.sort()
    print(l)
    print(l.index(2))
    lengths=set(3,4,5)
    lengths.add(2)
    print(lengths)
    

# Chapter 11

# 1) Write a function that will receive a list of numbers, and return the same list but
#  without the largest - and the smallest member. For the remaining members the original
#  order in the list should be preserved.

def f1(lst):
    result =[]
    for value in lst:
        if value>min (lst) and value < max(lst) :
            result.append(value)
    return result

# f1([4,5,6,4,10,13,4,5,8,9,9,11,13])

# 10) Receive a list of words Return a list that contains separate lists of the words
#  according to the length of the word Each sub-list will contain only existing lengths The
#  sub-lists by length are ascending and sorted by A-B

def f10(L):
    lengths = set()
    result = []
    for i in L:
        lengths.add(len(i))
    
    for i in sorted(lengths):
        sub_list = []  # list that receives all the strings that are same in length
        for string in L:
            if len(string) == i:
                sub_list.append(string)
        sub_list.sort()
        result.append(sub_list) # at the end add the sub list to the result
        
    return result

# print(f10(['qwer','zzz','poiuytr','ghj','abc','qq','hjkl']))

# 14) Print all the possibilities: multiply a two-digit number by a two-digit number
#  and get exactly the same digits in the result. The output should start like this:
# 15 x 93 = 1395

def f14():
    for i in range(10,100):
        for j in range(0,100):
            result = i*j
            if sorted(str(result)) == sorted(str(i)+ str(j)):
                print(i, 'x', j, '=', result)
# f14()

# 17) Write a function that will take a list of lists (containing numbers) and slowly crowd them
# left. It will print all the steps, until all members are in the first list.
                
def f17(lst):
    print(lst)
    for i in range(len(lst)-1):
        lst [-2-i] = lst[-2-i ]+ lst[-1-i]
        lst[-1-i] =[]
        print(lst)
        
# f17([[8],[1,3],[9],[2],[4,7]])