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
        sum = sum + 1/x
        print(x,sum)
        x+=1

# f9()

# Receive from the user many words, until we have all the letters in alphabet
# then to print all the words, and how many words we have

def f10A():
    abc='poiuytrewqasdfghjklmnbvcxz'
    letters=[]
    words=[]
    while len(letters)<26:
        word = input('enter word: ')
        words = words + [word]
        for letter in word:
            if letter not in letters and letter in abc:
                letters = letters + [letter]
    print ('there were',len(words), 'words:')
    print (words)

# f10A()

def f10B():
    letters = set('poiuytrewqasdfghjklmnbvcxz')
    words =[]
    while len(letters)>0:
        x= input('enter a word :')
        words = words + [x]
        letters = letters -set(x)
    print('there were', len(words), 'words:')
    print(words)
        
# f10B()

# if the number is even to divine by 2
# else to multiple by 3 and add 1

def f11(N):
    L=[N]
    while N>1:
        if N%2==0:
            N= N//2
        else:
            N = N*3 +1
        L = L +[N]
    return L

# f11(5)