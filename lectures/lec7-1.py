def f5():
    for n in range(10,33):
        if(n==14):
            continue
        if n==20:
            break
        print(n,end='')


# recive from the user until 10 numbers, if he inputs 0 so, to break
# print the sum of them

def f6():
    i = 10
    sum =0
    while(i!=0):
        n = int(input("enter number 0-9 : "))
        if n==0:
            break
        i-=1
        sum+=n
    print ("sum = ",sum)

# f6()

def f7():
    x=10
    while x<20:
        print(x ,end=' ')
        x+=2
    print ("bye👋🏼")
    
# f7()

def f8():
    x=10
    y=23
    while x<20:
        print(x,y)
        x+=1
        y*=2
        if y>1000:
            break

# f8()

# 1/2 + 1/3 + 1/4 + 1/5 ...
#  print all of them but not sum bigger than 6

def f9():
    sum = 0.5
    x=2
    while sum<3:
        print(x,sum)
        sum = sum +1/x
        x+=1

# f9()