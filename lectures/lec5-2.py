# write a function that receives a list and it will print all of it 
# ex1([1,7,66]) --> 1 7 66

def ex1(List):
    for i in List:
        print(i, end=" ")

# ex1([1,7,66])       

# with the index of the parameter
def ex1B(List):
    for i in range(len(List)):
        print (List[i], end=" ")

# ex1B([1,7,66])

# receive a list and print all of ot except the fourth one
# ex2([4,8,11,345,456,5678,12,345]) 
# --> 4 8 11 456 5678 12 345

def ex2(L):
    for i in range(len(L)):
        if(i != 3):
            print (L[i], end=" ")

# ex2([4,8,11,345,456,5678,12,345]) 


            
