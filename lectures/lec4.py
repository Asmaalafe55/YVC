# write a function that recives 2 lists as parameters 
# it will print which one of them is empty
# g([2,4],[]) -> only the seconed empty
# g([],[]) -> the tow empty

def g(L1,L2):
    if L1:
        if L2:
            print ("the two full")
        print ("only the seconed one is empty")
    else :
        if L2:
            print ("only the first one is empty")
        print("the two is empty")

g([1],[])