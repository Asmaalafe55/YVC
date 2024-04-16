# How many numbers are there between 1-1000000
# that have the number 4 and do not have the number 5
# For example 98144

def fourNotFive():
    cnt=0
    for num in range(1,1000001):
        if '4' in str(num):
            if not '5' in str(num):
                cnt+=1
    print(cnt)
    
    
# fourNotFive()

# Go over the numbers x to the right power
# 1**1, 2**2, 3**3 ...
# And find the one that contains your phone without an area code

import sys
sys.set_int_max_str_digits(1000000)

def phone(num):
    for x in range(1,1000000):
        if str(num) in str(x**x):
            return (x)
    
print(phone(345532))