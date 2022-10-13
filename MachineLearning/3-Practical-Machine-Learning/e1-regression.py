## EXERCISE 1: REGRESSION
from regression import *
from local import *
import pandas as pd 
import numpy as np 
from statistics import mean

df = pd.DataFrame(pd.read_csv("1-Starter/assets/movieratings.csv"))
Darray = df.to_numpy()
x1_D = []
x2_D = []
y_D= []
predicted_csv = []
sq_error_csv = []

for (x1, x2, y) in Darray:
    x1_D.append(x1)
    x2_D.append(x2)
    y_D.append(y)

