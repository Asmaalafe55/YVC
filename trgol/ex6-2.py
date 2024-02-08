# 17) Pick up a sentence and return its initials (first letter of each word)
# f17('Hello, this is me') --> 'Htim'

def f17(s):
    string = s[0]
    for l in range(len(s)):
        if s[l]== " ":
            string += s[l+1]
    return string
        
# print(f17('Hello, this is me'))

# 18) Take in a list of words, return the longest word in it (if there are several - the first of them)
# f18(['which', 'is', 'longest', 'word']) --> 'longest'
# f18(['123', '3456', '4532','2']) --> '3456'

def f18 (L):
    max=''
    for i in range(len(L)):
        if len(L[i])>len(max):
            max = L[i]
    return max

print(f18(['123', '3456', '4532','2']))

# 25) Receive a string, return how many different characters are there in it?

def f25(string):
    return len(set(string))

# 26) Take a list of numbers and return how many different digits there are in them (all together)

def f26(lst):
    string=""
    for value in lst:
        string += str(value)
    
    return(f25(string))

# print(f26([123,456,789]))

# 27) Receive 2 lists and return one list of the parameters without duplicates
# f27([1,3,2,3,4,5],[6,7,5,9,0]) --> [0,1,2,3,4,5,6,7,9]

def f27(lst1, lst2):
    # Option1
    lst1 = set(lst1)
    lst2 = set(lst2)
    return list(lst1|lst2)
    # Option2
    # return set(lst1)|set(lst2)

# print(f27([1,3,2,3,4,5],[6,7,5,9,0]))

# 28) Take 3 lists, return a list of those that are in at least two of them
# f([4,2,1,7],[2,8,7,9,5],[1,7,5,30]) --> [1,2,5,7]

def f28(L1,L2,L3):
    lst1 = set(L1)&set(L2)
    lst2 = set(L1)&set(L3)
    lst3 = set(L3)&set(L2)
    l = list(lst1|lst2|lst3)
    return l
    
# print(f28([4,2,1,7],[2,8,7,9,5],[1,7,5,30]))