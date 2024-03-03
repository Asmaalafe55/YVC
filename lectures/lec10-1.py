x=[1,4,6,77]
def f(L):
    print(L)
    L.append(1000)
    print(L)
f(x)

n = 123
print(id(n)) 
# the place of the number in the memory
n = n+1
print(id(n)) 
# we can see that the place of the same number plus 1 changes completly 
print(id(x))

d = '[1,7,1,1,9,9,1000,6]'
print(sorted(str(d)))

L=[234,2341,367,6,87,97,3]
print(L)
L.remove(6)
print(L)

L2=[234,2341,367,6,6,87,6 ,97,3]
print(L2)
while 6 in L2:
    L2.remove(6)
print(L2)

L3=[234,2341,367,6,6,87,6 ,97,3]
print(L3)
del L3[2:6]
print(L3)


# this is a commonly error to delete one number and to leave the other
# L4= list(range(30))
# print(L4)
# for i in range(0,len(L4),2):
#     del L4[i]
# L4= list(range(30))
# print(L4)
# # this is the right way from the end to the begininng
# for i in range(len(L4)-1,-1,-2):
#     del L4[i]
L4= list(range(30))
print(L4)  
# this is the best way to do so
del L4[::2]

# cookie monster
# we have  n cookies, the monster eats from the start one yes one no, then he starts from the end ...
# 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17
# - 2 - 4 - 6 - 8 - 10 - 12 - 14 - 16 -
# - 2 - - - 6 - - - 10 - - - 14 - - -
# - - - - - 6 - - - - - - - 14 - - -
# - - - - - 6 - - - - - - - - - - -
# then the cookie number 6 this is the cookie that the monster eat last

def f(n):
    cookies = list(range(1,n+1))
    while len(cookies)>1:
        del cookies[0::2]
        cookies.reverse()
    return cookies[0]
print(f(10))