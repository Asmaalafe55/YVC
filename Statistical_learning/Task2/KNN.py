# -*- coding: utf-8 -*-
import numpy as np
import pandas as pd

dataSet = pd.read_csv('cars_details.csv')
numerical_dataSet = dataSet.to_numpy()

data = numerical_dataSet[:,:-3]
targets = numerical_dataSet[:,-1]

perm = np.random.permutation(len(data))

trainRows = int(0.8*len(data))
trainingSet = data[perm][0:trainRows] # 1508x8
trainingTargets = targets[perm][0:trainRows] # 1508
testSet = data[perm][trainRows:] # 378x8
testTargets =  targets[perm][trainRows:] # 378

print(set(targets))

def max_min_Scaling(trainingSet, testSet):
    minTrainingSet = trainingSet.min(axis=0) # find the minimum of all columns
    maxTrainingSet = trainingSet.max(axis=0) # find the maximum of all columns
    rangeTrainingSet = maxTrainingSet - minTrainingSet
    rangeTrainingSet[rangeTrainingSet == 0] = 1  # Avoid division by zero
    NtrainingSet = (trainingSet - minTrainingSet) / rangeTrainingSet # calculating the x scaled
    NtrainingSet = NtrainingSet.astype(float)

    minTestSet = testSet.min(axis=0)  # find the minimum of all columns
    maxTestSet = testSet.max(axis=0)  # find the maximum of all columns
    rangeTestSet = maxTestSet - minTestSet
    rangeTestSet[rangeTestSet == 0] = 1  # Avoid division by zero
    NtesstSet = (testSet - minTestSet) / rangeTestSet # calculating the x scaled
    NtesstSet = NtesstSet.astype(float)  # Ensure numeric data type

    return NtrainingSet,NtesstSet

def euclidean_distance(NtrainingSet, vec):
    diff = NtrainingSet - vec  # Xi - Y
    diff_2 = diff ** 2  # (Xi - Y)^2
    dist = np.sum(diff_2, axis=1)  # sum of (Xi - Y)^2 across rows
    distance = np.sqrt(dist)  # sqrt of the sum of (Xi - Y)^2
    return distance

def manhattan_distance(NtrainingSet,vec):
    diff = NtrainingSet - vec  # Xi-Y
    diff_abs = np.abs(diff)  # |Xi-Y|
    distance = np.sum(diff_abs, axis=1)  # sum of (Xi-y)^2
    return distance

def predict(k, distance, trainingTargets):
    k_indices = np.argsort(distance)[:k] # indices of k smallest distances
    k_nearest_classes = trainingTargets[k_indices] #k nearest neighbors

    class_count = {} # counting the occurrences of each class
    for cls in k_nearest_classes:
        if cls in class_count:
            class_count[cls] += 1
        else:
            class_count[cls] = 1

    Class = max(class_count, key=class_count.get) # the class that appears highly

    return Class

def main_knn(k):
    NtrainingSet, NtesstSet = max_min_Scaling(trainingSet, testSet)
    correct_predictions = 0
    Class = ''

    for i in range(len(testSet)):
        vec = NtesstSet[i]  # Use test set sample as a vec
        distance = euclidean_distance(NtrainingSet, vec)
        predicted_class = predict(k, distance, trainingTargets)
        Class = predicted_class

        if predicted_class == testTargets[i]:
            correct_predictions += 1

    accuracy = (correct_predictions / len(NtesstSet)) * 100 # Calculate accuracy

    print(f"The Classification Label for k = {k} is: {Class}")
    print(f"The Classification Accuracy for k = {k} is: {accuracy:.2f}%")
    print()

main_knn(1)
main_knn(3)
main_knn(5)
main_knn(7)
main_knn(9)
main_knn(11)
