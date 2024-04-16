def q4(n):
    step=0
    for i in range(n,0,-1):
        if 0<= step <=1: 
            print('+'*i)
            step+=1
        else:
            step=0
            print('-'*i)