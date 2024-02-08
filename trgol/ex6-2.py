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

def f27(lst1, lst2):
    # Option1
    lst1 = set(lst1)
    lst2 = set(lst2)
    return lst1|lst2
    # Option2
    # return set(lst1)|set(lst2)

# print(f27([1,3,2,3,4,5],[6,7,5,9,0]))
