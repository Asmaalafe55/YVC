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
    
f7()