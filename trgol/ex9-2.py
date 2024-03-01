# Chapter 10

# 3)
def f3(s):
    count=0
    for i in range(len(s)):
        print(ord(s[i]))
        if ord(s[i]) not in ['1','2','3','4','5','6','7','8','9','0']:
            count +=1
    return count
print(f3('one 1 tow,2 ! 3'))