# -*- coding: utf-8 -*-

 
import numpy as np
import pandas as pd


dataSet = pd.read_csv('cars_details.csv')
numerical_dataSet = dataSet.to_numpy()

data = numerical_dataSet[:,:-3]
targets = numerical_dataSet[:,-1]


perm = np.random.permutation(len(data))
trainRows = int(0.8*len(data));
trainingSet = data[perm][0:trainRows]
trainingTargets = targets[perm][0:trainRows]
testSet = data[perm][trainRows:]
testTargets =  targets[perm][trainRows:]

print(set(targets))


def max_min_Scalling(trainingSet, testSet):


    return NtrainingSet,NtestSet



def euclidean_distance(NtrainingSet,vec):
    

    return distance





def manhattan_distance(NtrainingSet,vec):
    

    return distance



def predict(k, distance, trainingTargets):

    
    return Class



def main_knn(k):
    
    
    
    
    print("The Classification Labels for k= ", " is:\n ", )
    print("The Classification Accuracy for k = " ," is: \n", )
    
    
