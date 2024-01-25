# 11) Receive an integer N from the user and print N lines from the following
# template (note that after that the whole number is not printed)

def ex11():
    N = int(input("input how many times? "))
    for i in range(1, N+1):
        print(i * str(i%10))
        
ex11()


# 23)

def ex23(a,b):
    for x in range(1,b+1):
        print(x,'x',a, "=", a*x)
        
# ex23(177,3)