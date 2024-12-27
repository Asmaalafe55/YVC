""" A short script that will contain solutions to numpy exercises """
import numpy as np
def main():

    B = np.array([[1,2,-3],[3,4,-1]])
    A = np.array([[2,-5,1],[1,4,5],[2,-1,6]])
    y = np.array([2,-4,1])
    z = np.array([-15,-8,-22])

    """ This function prints solutions to the questions."""
    # INSTANTIATE YOUR NUMPY ARRAYS HERE FOR Q1,Q3,Q4

    # Q1:
    print ("BA:\n", np.dot(B,A))
    print ("\nAB':\n", np.dot(A,B.T))
    print ("\nAy:\n", np.dot(A,y))
    print ("\n<y,z>:\n", np.dot(y, z))
    #HINT: By default np.dot calculates the inner product. 
    
    #Q2:
    foo = np.arange(0,30)
    print("\n foo values is: \n", foo)
    print("\n foo shape is:\n ", foo.shape)
    bar = foo.reshape(5,6)
    print("\n bar values is: \n", bar)
    print("\n bar shape is: \n", bar.shape)
    bar[1,0]=-1
    print("\n bar values is: \n", bar)

    print("\n reshape method return a \n", foo.shape )
    """The shape of the array foo has not changed! i used foo array to
     copy it and reshape it , the copy of it is saved in bar array"""
    
    print("\n The sum of all bar values is: \n ",np.sum(bar) )
    print("\nThe sum of bar rows is:\n ",np.sum(bar,axis=1) )
    print("\n The sum of bar columns is: \n", np.sum(bar,axis=0))
    
    #Q3:
    intMat = np.random.randint(1,101,size=(10, 10))
    print("\n IntMat:\n",intMat)

    permIntMat = np.array([np.random.permutation(row) for row in intMat])
    print("\n PermIntMat:\n",permIntMat)
    vec = np.random.randint(1,101,size=(10)) 
    print("\n vec:\n",vec)
    all = np.vstack([permIntMat , vec])
    print("\n all:\n",all)
    
    print("\n The minimum of all columns is:\n ",np.min(all,axis=1))
    print("\n The maximum of all columns is:\n ",np.max(all,axis=1))
    
main()
