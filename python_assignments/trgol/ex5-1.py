# 1) write a function that receives a normal number and it will return its length 

def f1(num):
    return(len(str(num)))
    
# print(f1(2343973))

# 2) write a function that receives a normal number and it will return the first index in it

def f2(num):
    str_num = str(num)
    return str_num[0]
    
# print(f2(3455))

# 3) write a function that receives a normal number and it will return the last index in it

def f3(num):
    str_num = str(num)
    return str_num[len(str_num)-1]

# print(f3(6578))

# 3) write a function that receives a number, return true if the number have at 
# least 2 digits that are the same, and if the last digit and the first digit are equal

def f4(num):
    str_num = str(num)
    if len(str_num)==1:
        return False
    for i in range(len(str_num)):
        for j in range(len(str_num)):
            if str_num[i]==str_num[j]:
                if str_num[0] == str_num[len(str_num)-1]:
                    return True
    return False

# print(f4(9))
# print(f4(5675))

# 5) write a function that receives a list and it will return the first four digits
# if there is smaller than 4, then to return all of them

def first4(list):
    list_len = len(list)
    if list_len<4:
        return list
    else:
        return list[:4]

# print(first4([1,5,7,4,2,8,3]))

# 6) write a function that receives a list and it will return the last 3 digits
# if there is smaller than 3, then to return all of them

def last3(list):
    list_len = len(list)
    if list_len<3:
        return list
    else:
        return list[4:]

# print(last3([1,5,7,4,2,8,3]))

