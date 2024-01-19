# Write a function that takes an integer as a parameter.
# It will print for him an appropriate message whether the number is even or not
# divisible by 3 or not and whether it is divisible by 5 or not

def div235 (num):
    if num%2 == 0:
       print (num, "is even")
    else:
       print (num, "is odd")
    if num%3==0:
       print (num, "is divisible by 3")
    else:
       print (num, "is not divisible by 3")
    if num%5==0:
       print (num, "is divisible by 5")
    else:
       print (num, "is not divisible by 5")
        
        
        
        